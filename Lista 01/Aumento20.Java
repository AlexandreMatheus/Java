import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite um salario e direi o seu aumento (se tiver direito)");
    while (true){
      float entrada = ler.nextFloat();
      if (entrada<0.00 || entrada>=500.00){
        break;
      }
      float novo = entrada+(entrada*0.2f);
      System.out.printf("O novo salario é: %.2f\n",novo);
    }
  }
}
