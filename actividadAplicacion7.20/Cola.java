public class Cola {
   Lista datos;
   
   public Cola() {
      datos = new Lista();
   }

   public void encola(Integer elem) {
      datos.insertarFinal(elem);
   }

   Integer primero() {
      Integer elem = datos.get(0);
      return elem;
   }

   Integer desencola() {
      Integer elem = datos.get(0);
      datos.eliminar(0);
      return elem;
   }

   boolean vacia() {
      return datos.get(0) == null;
   }
}


