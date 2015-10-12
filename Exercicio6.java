/**
* - de quantos modos três pessoas podem ficar em uma fila indiana
*/
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class Exercicio6 {
	public static void main(String[] args){
		int [] posicao = {1,2,3};
		ArrayList<Integer> possibilidades = new ArrayList<Integer> ();
		int[] algarismos = {0,1,2,3,4,5,6,7,8,9};
		
		for(int i = 0; i <= 1; ++i){
			if(posicao[0] == 1){
				possibilidades.add(9);
			}
			if(posicao[1] == 2){
				possibilidades.add(algarismos.length - 2);
			}
			if(posicao[2] == 3){
				possibilidades.add(0);
			}
		}
		
		System.out.println(Arrays.toString(possibilidades.toArray()));
	}
}