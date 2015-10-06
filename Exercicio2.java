/**
* - num hospital existem 3 portas de entrada [p1,p2,p3] que dão para um saguão
* - no qual existem quatro elevadores [e1,e2,e3,e4]. Um visitante deve dirigir-se ao quinto
* - andar ultilizando 1 dos elevadores. De quantas meneiras diferentes poderá fazê-lo.
*/
public class Exercicio2 {
	public static void main(String[] args){
		int[] portasDeEntrada = {21,31,34};
		int[] elevadores = {1,2,3,4};
		//etapa 1 {a escolha de uma porta de entrada}
		int totalPortas = portasDeEntrada.length;
		//escolha de um elevador
		int totalElevadores = elevadores.length;
		//resultado
	System.out.println("temos o total de #{" + totalElevadores * totalPortas + " }possibilidades distintas");
	}
}