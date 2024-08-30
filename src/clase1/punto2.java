package clase1;

import javax.swing.JOptionPane;

public class punto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadenaInicial=JOptionPane.showInputDialog("ingrese la cadena principal");
		devolverCadena(cadenaInicial);
	}
	public static void devolverCadena(String cadena) {
		String cadenaNueva="";
		String cadenaComparar="";
		char caracter;
		for (int x=0;x<cadena.length();x++) {
			caracter=cadena.charAt(x);
			if (x==0) {
				cadenaNueva+=caracter;
			}else {
				int ultimaPosicion=cadenaNueva.length()-1;
				if (caracter==cadenaNueva.charAt(ultimaPosicion)) {
					if(cadenaNueva.length()>cadenaComparar.length()) {
						cadenaComparar=cadenaNueva;
					}
					cadenaNueva="";
					cadenaNueva+=caracter;
					
				}else {
					cadenaNueva+=caracter;
				}
			}
		}if (cadenaNueva.length()>cadenaComparar.length()) {
			JOptionPane.showMessageDialog(null, "la cadena mayor es"+cadenaNueva);
			
		}else if(cadenaNueva.length()<cadenaComparar.length()) {
			JOptionPane.showMessageDialog(null, "la cadena mayor es"+cadenaComparar);
			
		}else {
			JOptionPane.showMessageDialog(null, "las dos cadenas son del mismo tamaño"+cadenaComparar+"\n"+cadenaNueva+"\n");
		}
	}
		
}

	