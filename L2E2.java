import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class L2E2 {
    public static void main(String[] args) {
     
     Scanner leia = new Scanner(System.in);
     
  // Primeira Data:
      
      System.out.println("Digite o dia da primeira data");
      int diaA = leia.nextInt();
      
      while (diaA<= 0 || diaA > 31) {
      System.out.println("Dia inválido, tente novamente");
      diaA = leia.nextInt(); }
      
      System.out.println("Digite o mês da primeira data");
      int mesA = leia.nextInt();
      
         while (mesA <= 0 || mesA >12) {
          System.out.println("Mês inválido, tente novamente.");
          mesA = leia.nextInt(); }

      System.out.println("Digite o ano da primeira data");
      int anoA = leia.nextInt();
      
      while (anoA <= 0) {
          System.out.println("Ano inválido, tente novamente");
          anoA = leia.nextInt(); }
          
          LocalDate data1 = LocalDate.of(anoA, mesA, diaA);
          
          // Segunda data: 
      
      System.out.println("Digite o dia da segunda data");
      int diaB = leia.nextInt();
      
      while (diaB <= 0 || diaB > 31) {
          System.out.println("Dia inválido, tente novamente");
          diaB = leia.nextInt();
      }
      
      System.out.println("Digite o mês da segunda data");
      int mesB = leia.nextInt();
      
         while (mesB <= 0 || mesB >12) {
          System.out.println("Mês inválido, tente novamente.");
          mesB = leia.nextInt(); }
      
      System.out.println("Digite o ano da primeira data");
      int anoB = leia.nextInt();
      
      while (anoB <= 0) {
          System.out.println("Ano inválido, tente novamente");
          anoB = leia.nextInt(); }
          
          LocalDate data2 = LocalDate.of(anoB, mesB, diaB);
          
          LocalDate maior;
          LocalDate menor;

          if (data1.isBefore(data2)) {
          menor = data1;
          maior = data2; }
          
          else {
          menor = data2;
          maior = data1; }
          
          long dias = ChronoUnit.DAYS.between(menor, maior);
          
          System.out.println("A quantidade de dias entre a data mais antiga e a mais recente é: " + dias);
          
          leia.close();
    }
}
