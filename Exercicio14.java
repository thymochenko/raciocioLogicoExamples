/**
*Quantos números de três algarismos distintos podem ser formados dispondo dos algarismos [1,2,3,4,5]
*/
import javax.swing.JOptionPane;
import java.util.Arrays;

public class Exercicio14 {
	public static void main(String[] args){
		int [] cuniverso = {1,2,3,4,5};
		int subgrupo = 3;
		int subtracaoCueASub = 0;
		int resultfact = 0;
		
		if(cic(cuniverso)){
			subtracaoCueASub = cuniverso.length - subgrupo;
			resultfact = factorial(cuniverso.length, subtracaoCueASub);
			JOptionPane.showMessageDialog( null, "podem ser formados : #{" + resultfact + "}", "Algarismos", JOptionPane.INFORMATION_MESSAGE );
		}
		else{
			
			JOptionPane.showMessageDialog( null, "erro", "Algarismos", JOptionPane.INFORMATION_MESSAGE );
		}
	}
	
	/**
	*cic : processo para descobrir se se trata de arranjo ou combinação
	*/
	public static boolean cic(int[] cu){
		int [] contAux = new int[5];
		for(int i = cu.length - 1; i >= 0; --i ){
			contAux[i] = cu[i];
		}
		
		boolean result = Arrays.equals(cu,contAux);
		
		if(result){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static int factorial(int n, int sub) {
        int fact = 1;
		int auxN = sub;
        for (int i = sub; i < n; i++) {
			auxN++;
			if(i == sub){
				//System.out.println(auxN);
			}
            fact *= auxN;
			System.out.println(auxN);
        }
        return fact;
    }
}