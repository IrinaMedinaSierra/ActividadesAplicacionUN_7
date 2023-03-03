public class Calendario {

   private int a, m, d;
   private final int diasMes[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

   public Calendario(int d, int m, int a) {
      this.a = a;
      this.m = m;
      this.d = d;
      compruebaFecha();
   }
   private void compruebaFecha() {
      if (a==0) {
         a = 1;
      }
      if (m<1 || 12<m) {
         m = 1;
      }
      if (d<1 || diasMes[m-1]<d) {
         d = 1;
      }
   }

   void incrementarDia() {
      d++;
      if (d > diasMes[m-1]) {
         d = 1;
         incrementaMes();
      }
   }

   void incrementaMes() {
      m++;
      if (m > 12) {
         m = 1;
         incrementaAño();
      }
   }

   void incrementaAño() {
      a++;
      if (a == 0) {
         a = 1;
      }
   }

   void mostrar() {
      String ceroDia = d < 10 ? "0" : "";
      String ceroMes = m < 10 ? "0" : "";

      System.out.println(ceroDia + d + "/" + ceroMes + m + "/" + a);
   }
   
   boolean iguales(Calendario otro) {
      return (this.d == otro.d &&
              this.m == otro.m &&
              this.a == otro.a);
   }      
}
