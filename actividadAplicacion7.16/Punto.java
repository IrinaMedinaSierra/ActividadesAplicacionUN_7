public class Punto {
   double x, y;

   public Punto(double x, double y) {
      this.x = x;
      this.y = y;
   }

   public void desplazaX(double dx) {
      x += dx;
   }

   public void desplazaY(double dy) {
      y += dy;
   }

   public void desplaza(double dx, double dy) {
      x += dx;
      y += dy;
   }

   void muestra() {
      System.out.println("(" + x + ", " + y + ")");
   }

   double distanciaEuclidea(Punto otro) {
      return Math.sqrt(Math.pow(x - otro.x, 2) +
                       Math.pow(y - otro.y, 2));
   }

}
