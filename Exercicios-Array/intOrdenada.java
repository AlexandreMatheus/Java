import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int[] numeros = new int[10];
    
    for(int x = 0;x<numeros.length;x++){
      System.out.print((x+1)+"º numero -> ");
      numeros[x]= entrada.nextInt();
    }
    Arrays.sort(numeros);

    System.out.println();
    System.out.println("Array ordenado:");

    for(int i = 0;i<numeros.length;i++){
      System.out.println((i+1)+"º numero -> "+numeros[i]);

    }
  }
}
