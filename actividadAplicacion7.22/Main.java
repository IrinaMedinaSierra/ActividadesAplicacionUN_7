public class Main {

   public static void main(String[] args) {
      Conjunto c1 = new Conjunto();
      for (int i = 0; i < 10; i++) {
         c1.insertar(i);
      }
      System.out.println("c1: " + c1);
      Conjunto c2 = new Conjunto();
      for (int i = 0; i < 10; i++) {
         c2.insertar(i + 5);
      }
      System.out.println("c2: " + c2);
      System.out.println("c1 U c2: " + Conjunto.union(c1, c2));
      System.out.println("c1 Inter c2: " + Conjunto.interseccion(c1, c2));
      System.out.println("c1 - c2: " + Conjunto.diferencia(c1, c2));
   }
}
