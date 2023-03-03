
public class Conjunto {
   private Lista lista;

   public Conjunto() {
      lista = new Lista();
   }

   public Conjunto(int capacidadInicial) {
      lista = new Lista(capacidadInicial);
   }

   int numeroElementos() {
      return lista.numeroElementos();
   }

   boolean pertenece(Integer elemento) {
      return lista.buscar(elemento) >= 0;
   }

   boolean insertar(Integer nuevo) {
      boolean insertado = false;
      if (!pertenece(nuevo)) {
         lista.insertarFinal(nuevo);
         insertado = true;
      }
      return insertado;
   }

   boolean insertar(Conjunto otroConjunto) {
      boolean modificado = false;
      for (int i = 0; i < otroConjunto.lista.numeroElementos(); i++) {
         boolean insertado = insertar(otroConjunto.lista.get(i));
         if (insertado) {
            modificado = true;                           
         }                     
      }
      return modificado;
   }

   boolean eliminarElemento(Integer elemento) {
      boolean eliminado = false;
      int indice = lista.buscar(elemento);
      if (indice != -1) {
         lista.eliminar(indice);
         eliminado = true;
      }
      return eliminado;
   }

   boolean eliminarConjunto(Conjunto otroConjunto) {
      boolean modificado = false;
      for (int i = 0; i < otroConjunto.lista.numeroElementos(); i++) {
         boolean eliminado = eliminarElemento(otroConjunto.lista.get(i));
         if (eliminado) {
            modificado = true;  
         }                      
      }
      return modificado;
   }

   public String toString() {
      lista.ordenar();
      return lista.toString();
   }
   
   static boolean incluido(Conjunto c1, Conjunto c2) {
      boolean incluido = true;
      for (int i = 0; i < c1.numeroElementos() && incluido; i++) {
         if (!c2.pertenece(c1.lista.get(i))) {
            incluido = false;
         }
      }
      return incluido;
   }

   static Conjunto union(Conjunto c1, Conjunto c2) {
      Conjunto nuevo = new Conjunto();
      nuevo.insertar(c1);
      nuevo.insertar(c2);
      return nuevo;
   }

   static Conjunto interseccion(Conjunto c1, Conjunto c2) {
      Conjunto nuevo = new Conjunto();
      for (int i = 0; i < c1.numeroElementos(); i++) {
         if (c2.pertenece(c1.lista.get(i))) {
            nuevo.insertar(c1.lista.get(i));
         }
      }
      return nuevo;
   }

   static Conjunto diferencia(Conjunto c1, Conjunto c2) {
      Conjunto nuevo = new Conjunto();
      for (int i = 0; i < c1.numeroElementos(); i++) {
         if (!c2.pertenece(c1.lista.get(i))) {
            nuevo.insertar(c1.lista.get(i));
         }
      }
      return nuevo;
   }
}
