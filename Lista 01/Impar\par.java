import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite os numeros que te digo se é impar ou par");
    for (int i=0; i<10;i++){
      
      int num = ler.nextInt();
      if (num%2==0){
        System.out.println("É um numero par");
      }
      else{
        System.out.println("É um numero impar");
      }
    }
  }
}
