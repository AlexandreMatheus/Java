import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite o seu salario seguido do emprestimo e te digo se você terá esse emprestimo :)");
    String salemp[] = ler.nextLine().split(" ");
    double val = Float.valueOf(salemp[0])*0.3f;
    if (val>=Float.valueOf(salemp[1])){
      System.out.println("Pode pegar");
    }else{
      System.out.println("Não pode pegar");
    }

  }
}
