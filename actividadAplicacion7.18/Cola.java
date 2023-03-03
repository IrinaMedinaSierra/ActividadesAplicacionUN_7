import java.util.Arrays;

public class Cola {

   private Integer datos[];

   public Cola() {
      datos = new Integer[0];
   }

   public void encola(Integer elem) {
      datos = Arrays.copyOf(datos, datos.length + 1);
      datos[datos.length - 1] = elem;
   }

   Integer primero() {
      Integer elem = null;
      if (datos.length > 0) {
         elem = datos[0];
      }
      return elem;
   }

   Integer desencola() {
      Integer elem = null;
      if (!vacia()) {
         elem = datos[0];
         System.arraycopy(datos, 1, datos, 0, datos.length - 1);
         datos = Arrays.copyOf(datos, datos.length - 1);
      }
      return elem;
   }

   boolean vacia() {
      return datos.length == 0;
   }
}
