import java.util.Arrays;

public class Cifrado {

   static String cesar(String texto, int n) {
      char mensaje[] = texto.toCharArray();
      for (int i = 0; i < mensaje.length; i++) {
         char c = mensaje[i];
         if (Character.isAlphabetic(c)) {
            c+= n;
            if (Character.isLowerCase(mensaje[i])) {
               if (c > 'z') {
                  c = (char)(c - 'z' + 'a' -1);
               }
            } else {
               if (c > 'Z') {
                  c = (char)(c - 'Z' + 'A' -1);
               }
            }
            mensaje[i] = c;
         }
      }
      return String.valueOf(mensaje);
   }
}
