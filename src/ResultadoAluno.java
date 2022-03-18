import javax.swing.JOptionPane;

public class ResultadoAluno {

	public static void main(String[] args) {
		
		double media = 5;
				
		if (media >= 6) {
			JOptionPane.showMessageDialog(null, 
					media + " Aprovado! ");
		}		
		else {
			JOptionPane.showMessageDialog(null, 
					media + " Reprovado! ");
		}
		
	}

}