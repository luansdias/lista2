public class L2E4 {
    public static void main(String[] args) {

        int multiplos2 = 0;
        int multiplos3 = 0;
        int multiplos5 = 0;

        for (int i = 1; i <= 1000; i++) {

            if (i % 2 == 0) {
                multiplos2++;
            }
            if (i % 3 == 0) {
                multiplos3++;
            }
            if (i % 5 == 0) {
                multiplos5++;
            } }

            System.out.println("Multiplos de 2:" + multiplos2);
            System.out.println("Multiplos de 3:" + multiplos3);
            System.out.println("Multiplos de 5:" + multiplos5);
        }
    }
