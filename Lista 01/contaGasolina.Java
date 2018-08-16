import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite a quantidade de litros de gasolina");
    int refrigerante = 2;
    double gasolina = ler.nextDouble();
    double valorrefrigerante =3.00;
    double valorgasolina=2.50;
    double conta = (gasolina*valorgasolina)+(refrigerante*valorrefrigerante);
    System.out.printf("Sua conta é: %.2f\n",conta);
  }
}
