import java.util.Scanner;

public class L2E5 {
    public static void main(String[] args) {


        int maiorIdade = 0;
        int diferente = 0;
        int menorIdade = 0;
 
        Scanner leia = new Scanner(System.in);


        System.out.println("Digite a quantidade de habitantes:");
        int qtd  = leia.nextInt();

        leia.nextLine();
        

        for(int i = 1; i <= qtd; i++) {
            System.out.println("Qual gênero do habitante " + i + "?");
            String genero = leia.nextLine();
            while(!genero.equalsIgnoreCase("feminino") && !genero.equalsIgnoreCase("masculino")) {
                System.out.println("O gênero precisa ser masculino ou feminino:");
                genero = leia.nextLine();
            }

            System.out.println("Qual cor dos olhos do habitante " + i + "?" + "\n Verdes" + "\n Azuis" + "\n Castanhos") ;
            String olhos = leia.nextLine();
            while(!olhos.equalsIgnoreCase("castanhos") && !olhos.equalsIgnoreCase("azuis") && !olhos.equalsIgnoreCase("verdes")) {
                System.out.println("Cor inválida. Escolha entre: Castanhos, Verdes ou Azuis:");
                olhos = leia.nextLine();
            }

            System.out.println("Qual cor dos cabelos habitante " + i + "?" + "\n Louros" + "\n Castanhos" + "\n Pretos");
            String cabelos= leia.nextLine();
            while (!cabelos.equalsIgnoreCase("pretos") && !cabelos.equalsIgnoreCase("louros") && !cabelos.equalsIgnoreCase("castanhos")) {
                System.out.println("Cor inválida. Escolha entre: Pretos, Louros ou Castanhos:");
                cabelos = leia.nextLine();
            }

            System.out.println("Qual idade do habitante " + i + "?");
            int idade = leia.nextInt();
            
            while(idade < -1 || idade == 0) {
                System.out.println("Bebês no ventre não são contabilizados! Digite novamente:");
                idade = leia.nextInt();
                
                leia.nextLine();
            }
            
            if (idade == -1) {
                break;
            }
            
            if (i == 1) {
                menorIdade = idade;
            }
            
            else if (idade < menorIdade) {
                menorIdade = idade;
            }
            
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            
            if(idade >= 18 && idade <=35 && genero.equalsIgnoreCase("feminino") && cabelos.equalsIgnoreCase("louros") && olhos.equalsIgnoreCase("verdes")) {
                diferente++;
            }
        }
        
        
          System.out.println("Maior idade: " + maiorIdade);
          System.out.println("Menor idade: " + menorIdade);
          System.out.println("Pessoas com as caracteristicas desejadas: " + diferente);
            
            leia.close();
}
}
