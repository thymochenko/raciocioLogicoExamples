/**
* - de quantos modos três pessoas podem ficar em uma fila indiana
*/
import java.util.Random;
import java.util.Arrays;

public class Exercicio5 {
	public static void main(String[] args){
		int[] digito = {1,2,3,4,5,6,7,8};
		int[] numero = new int[9];
		int[] resultadoEtapa = new int[8];
		
		Random generator = new Random();
		
		for(int i =0; i <= digito.length - 1; ++i){
			if(i > 0 && i < 3){
				System.out.println("("+ i + ")");
				numero[i] = generator.nextInt(1)+3;	
				resultadoEtapa[i] = 2;
				System.out.println(numero[i]);
			}
			if(i > 2 && i < 5){
				System.out.println("["+ i + "]");
				numero[i] = generator.nextInt(1)+9;	
				resultadoEtapa[i] = 9;
				System.out.println(numero[i]);
			}
			if(i >= 5 && i <= 8){
				System.out.println("{"+ i + "}");
				numero[i] = generator.nextInt(9);	
				resultadoEtapa[i] = 10;
				System.out.println(numero[i]);
		    }
		}
		
		System.out.println(Arrays.toString(numero));
	}
}