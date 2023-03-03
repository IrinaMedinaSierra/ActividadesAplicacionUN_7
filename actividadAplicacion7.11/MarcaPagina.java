public class Marcapagina {
   private int ultimaPagina;

   public Marcapagina() {
      ultimaPagina = 1;
   }

   void siguientePag() {
      ultimaPagina++;
   }

   void comenzar() {
      ultimaPagina = 1;
   }

   int ultimaPaginaLeida() {
      return ultimaPagina;
   }
}
