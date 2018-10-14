import java.util.*;
class Main {
  public static void main(String[] args) {
    int[] numeros = new int[300];
    
    for(int x=0; x<numeros.length;x++){
      numeros[x]=35;
    }

    /*1º forma de print
    for(int i = 0; i<numeros.length;i++){
      System.out.println("Position: " + i + " -> " + numeros[i]);
    }
    */
   

    /*2º forma de print
    int cont=0;
    for(int n : numeros) {
		System.out.println("Position: " + cont + " -> " + n);
    cont++;
	  }*/

    /*3º forma de print
    System.out.println(Arrays.toString(numeros));
    */
  }
}
