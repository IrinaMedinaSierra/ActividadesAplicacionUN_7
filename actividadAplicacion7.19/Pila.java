import java.util.Arrays;

public class Pila {

   private Integer datos[];

   public Pila() {
      datos = new Integer[0];
   }

   public void apila(Integer elem) {
      datos = Arrays.copyOf(datos, datos.length + 1);
      datos[datos.length - 1] = elem;
   }

   Integer cima() {
      Integer elem = null;
      if (datos.length > 0) {
         elem = datos[datos.length - 1];
      }
      return elem;
   }

   Integer desapila() {
      Integer elem = cima();
      datos = Arrays.copyOf(datos, datos.length - 1);
      return elem;
   }

   boolean vacia() {
      return datos.length == 0;
   }
}
