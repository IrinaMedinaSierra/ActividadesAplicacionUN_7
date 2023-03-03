public class Ecuacion2Grado {

   private double a, b, c;

   public Ecuacion2Grado(double a, double b, double c) {
      this.a = a;
      this.b = b;
      this.c = c;
   }

   public void setC(double c) {
      this.c = c;
   }

   public void setA(double a) {
      this.a = a;
   }

   public void setB(double b) {
      this.b = b;
   }

   double[] solucion() {
      double sol[] = new double[2];
      if (!esPositivoDiscriminante()) {
         sol[0] = sol[1] = Double.NaN;
      } else {
         double d = discriminante();
         sol[0] = (-b - Math.sqrt(d))/2*a;
         sol[1] = (-b + Math.sqrt(d))/2*a;
      }
      return sol;
   }

   private double discriminante() {
      return Math.pow(b, 2) - 4 * a * c;
   }

   public boolean esPositivoDiscriminante() {
      return discriminante() >= 0;
   }
}
