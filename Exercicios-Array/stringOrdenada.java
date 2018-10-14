import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String[] nomes = new String[10];
    
    for(int x = 0;x<nomes.length;x++){
      System.out.print((x+1)+"º nome -> ");
      nomes[x]= entrada.nextLine();
    }
    Arrays.sort(nomes);

    System.out.println();
    System.out.println("Array ordenado:");

    for(int i = 0;i<nomes.length;i++){
      System.out.println((i+1)+"º nome -> "+nomes[i]);

    }
  }
}
