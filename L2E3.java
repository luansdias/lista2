import java.util.Scanner;
public class L2E3 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int numero;
        double soma = 0;

        System.out.println("Digite o valor de n");
        numero = leia.nextInt();

        for (int i = 1; i <= numero; i++) {
            soma = soma + Math.pow(i, 2);
        }

        System.out.println(soma);
        leia.close();    
    }
}
