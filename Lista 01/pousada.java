import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    String nome;
    int opcao;
    int dias = 0;
    float valorCliente = 0.0f;
    float totalPousada=0.0f;
    while(true){
      System.out.println("Informe o nome: ");
      nome = ler.nextLine();
      System.out.println("Informe o numero de diarias: ");
      dias = ler.nextInt();
      valorCliente=dias*40.0f;

      if(dias<10){
        valorCliente+=(dias*15);
      }
      if (dias>10){
        valorCliente+=(dias*8); 
      }
    
      System.out.println("Cliente:" + nome);
      System.out.println("Valor cliente:" + valorCliente);

      System.out.println("Continuar? 1-sim:");
      System.out.println("           2-não:");
      opcao = ler.nextInt();

      totalPousada+=valorCliente;
      if (opcao==2){
        System.out.println("Total Arrecadado: "+totalPousada);
        break;
      }
    }
    
  }
}
