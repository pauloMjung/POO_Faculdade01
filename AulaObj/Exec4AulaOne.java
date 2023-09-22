import javax.swing.JOptionPane;
import java.util.Arraylist;

public class Exec4AulaOne {
	
	String marca;
	String cor;
	int anoFabricado;
	
		 boolean void cadastra () {
			marca = JOptionPane.ShowInputDialog("informe a marca");
			cor= JOptionPane.showInputDialog("informe a cor do carro");
			anoFabricado = Integer.parseInt(JOptionPane.showInputDialog("informe o ano que o carro foi fabricado: "));
			
		}
		boolean validaCadastro() {
				if(marca.equals(""){
						JOptionPane.showInputDialog(null, "Marca é obrigatorio")
						return false;
				}
				if(cor.equals(""){
						JOptionPane.showMessageDialog(null, "Cor do carro é obrigatoria")
						return false;
				}
				if(anoFabricado.equals(""))
	}
		
		
		
		
}
