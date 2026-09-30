public class L2E1 {
    public static void main(String[] args) {
      
      int a = 233;
      int b = 456;
      
      for (int i = a; i <= b; i+=5) {
          System.out.println(i);
          
          while (i >= 300 && i <= 400 ) {
              i+=3;
              System.out.println(i);
          }
          
      }

    }
}
