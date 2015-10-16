/**
* - de quantos números pares de três algarismos distintos podem ser formados, dispondo dos algarismos de 0 a 9
*/
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
 import java.util.*;
 import javax.swing.JOptionPane;
 
public class Exercicio6 {
	public static void main(String[] args){
		int [] posicao = {1,2,3};
		ArrayList<Integer> possibilidades = new ArrayList<Integer> ();
		int[] algarismos = {0,1,2,3,4,5,6,7,8,9};
		int[] situacoes = {1,2};
		int totalFase1 = 0;
		int totalFase2 = 0;
		//int totalFase3 = 0;
		int c = 0;
		int proximoVal = 0;
		int total;
		
		for(int i = 1; i <= situacoes.length; ++i){
			if(i == 1){
				//nove  possibilidades'
				int possibNaPrimeiraPosicao = 9;
				//já foi usada a possibilidade 1 e a 3
				int possibNaSegPosicao = possibNaPrimeiraPosicao - 1;
				//este dígito será obrigatoriamente todos os pares terminados em 0
				int possibNaTercPosicao = 1;
				//adiciona a lista
				possibilidades.add(possibNaPrimeiraPosicao);
				possibilidades.add(possibNaSegPosicao);
				possibilidades.add(possibNaTercPosicao);
			}
			else if(i == 2){
				//não se pode usar o zero e já foi usado e nem o já usado no terceiro algarismo
				int possibNaPrimeiraPosicao = 8;
				//já usamos a possibilidade 1 e 3
				int possibNaSegPosicao = 8;
				//algarismo pares entre 2 8 (tira-se o 0)
				int possibNaTercPosicao = 4;
				//adiciona a lista
				possibilidades.add(possibNaPrimeiraPosicao);
				possibilidades.add(possibNaSegPosicao);
				possibilidades.add(possibNaTercPosicao);
			}
		}
		
		for(int i = 0; i < possibilidades.size();++i){
					if(i < 2){
						if(totalFase1 == 0){
							totalFase1 = possibilidades.get(i) * possibilidades.get(i + 1) * possibilidades.get(i + 2);
						}
					}
					
					if(i > 2){
						if(totalFase2 == 0){
							totalFase2 = possibilidades.get(i) * possibilidades.get(i+1) * possibilidades.get(i+2);
							break;
						}
					}
		}
		
		total = totalFase1 + totalFase2;	
		JOptionPane.showMessageDialog( null, "total de números pares de três algarismos distintos formados entre 0 e 9 #{" + total + "}", "Algoritmo", JOptionPane.INFORMATION_MESSAGE );
	}
}