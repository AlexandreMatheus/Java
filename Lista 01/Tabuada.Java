import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite um numero e te mostro a tabuada dele ;)");
    int entrada = ler.nextInt();
    for (int i=1; i<=10;i++){
        System.out.printf("%d x %d = %d\n",entrada,i,entrada*i);
      
    }
  }
}
