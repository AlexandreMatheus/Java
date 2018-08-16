import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite o salario seguido do percentual de aumento (sem a porcentagem)");
    String entrada[] = ler.nextLine().split(" ");
    float aum=(Float.valueOf(entrada[0])*(Float.valueOf(entrada[1])/100));
    float tot=aum+Float.valueOf(entrada[0]);
    System.out.printf("Seu amento é de %.2f e o novo salario é %.2f\n",aum,tot);

  }
}