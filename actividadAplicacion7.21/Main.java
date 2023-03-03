public class Main {

   public static void main(String[] args) {
      Conjunto c1 = new Conjunto();
      for (int i = 0; i < 10; i++) {
         c1.insertar(i);
      }
      System.out.print("c1: ");
      c1.mostrar();
      Conjunto c2 = new Conjunto();
      for (int i = 0; i < 10; i++) {
         c2.insertar(i + 5);
      }
      System.out.print("c2: ");
      c2.mostrar();
      c1.eliminarConjunto(c2);
      System.out.print("c1: ");
      c1.mostrar();
   }
}
