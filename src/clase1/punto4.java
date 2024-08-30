package clase1;

import javax.swing.JOptionPane;

public class punto4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cantidadVertical=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de * verticales"));
		int cantidadHorizontal=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de * horizontales"));
		crearFigura(cantidadVertical,cantidadHorizontal);
	}
	public static void crearFigura(int vertical,int horizontal) {
		String figura="";
		for(int i=0;i<vertical;i++) {
			if (i==0 ||i==vertical-1) {
				for (int x=0;x<horizontal;x++) {
					figura+="*";	
				}figura+="\n";
			}else {
				figura+="*";
				for(int x=0;x<horizontal-2;x++) {
					figura+=" ";
				}figura+="*"+"\n";
			}
		}System.out.println(figura);
	}
}
