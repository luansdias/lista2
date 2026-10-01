import java.util.Scanner;

public class L2E6 {
    public static void main(String[] args) {
      
      String[] cidades = new String[5];
      int[] codigos = new int[5];
      int[] passeio = new int[5];
      int[] acidentes = new int[5];
      double maiorIndice = 0;
      double menorIndice = 0;
      String maiorCidade = "";
      String menorCidade = "";
      double soma = 0;
      double soma1 = 0;
      int qtd = 0;
      
      Scanner leia = new Scanner(System.in);
      
      System.out.println("Digite o nome das 5 cidades:");
      
      for (int i = 0; i < cidades.length; i++) {
          
          cidades[i] = leia.nextLine(); }
          
          for (int i = 0; i < cidades.length; i++) {
              System.out.println("Digite o código da cidade " + cidades[i]);
              codigos[i] = leia.nextInt();
              
              System.out.println("Digite o número de veículos de passeio da cidade " + cidades[i]);
              passeio[i] = leia.nextInt();
             
              System.out.println("Digite o número de acidentes com vítimas da cidade " + cidades[i]);
              acidentes[i] = leia.nextInt();
              
              if(passeio[i] < 2000) {
                  soma1 = soma1 + acidentes[i];
                  qtd++;
              }
              
              soma = soma + passeio[i];
              
              double indice = (double) acidentes[i] / passeio[i];
              
              if (i == 0) {
                  maiorIndice = indice;
                  menorIndice = indice;
                  maiorCidade = cidades[i];
                  menorCidade = cidades[i];
              }
              
              if(indice > maiorIndice) {
                  maiorIndice = indice;
                  maiorCidade = cidades[i];
              }
              
              if(indice < menorIndice) {
                  menorIndice = indice;
                  menorCidade = cidades[i];
              }
              
              
          }
          
          double media = soma / 5;
          double media1 = soma1 / qtd;
          
         System.out.println("Maior índice de acidentes: " + maiorCidade + ":" + maiorIndice);
         System.out.println("Menor índice de acidentes: " + menorCidade + ":" + menorIndice);
         System.out.println("Média de veículos das 5 cidades juntas: " + media);
         System.out.println("Média de acidentes de trânsito nas cidades com menos de 2000 veículos: " + media1);
         
         leia.close();
    }
}
