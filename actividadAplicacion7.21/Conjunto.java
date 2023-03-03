public class Conjunto {
   private Lista lista;

   public Conjunto() {
      lista = new Lista();
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

   public void mostrar() {
      lista.mostrar();
   }
}
