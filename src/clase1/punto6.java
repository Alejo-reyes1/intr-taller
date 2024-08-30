package clase1;

import javax.swing.JOptionPane;

public class punto6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroArreglo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de elementos que desea agregar"));
		int []arreglo=crearArreglo(numeroArreglo);
		organizar(arreglo);
	}
	public static int[]crearArreglo(int numeros){
		int[]arreglo=new int[numeros];
		for (int i=0;i<numeros;i++) {
			arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero entero a la cadena"));
		}return arreglo;
	}public static void organizar(int []arreglo) {
		String arregloFinal="";
		String arregloInicial="";
		for (int c=0;c<arreglo.length;c++) {
			arregloInicial+=arreglo[c]+",";
		}
		for(int x=0;x<arreglo.length;x++) {
			for(int i=0;i<arreglo.length-x-1;i++) {
				if (arreglo[i]<arreglo[i+1]) {
					int posicionInicial=i;
					int posicionCambiar=i+1;
					cambiarPosicion(posicionInicial,posicionCambiar,arreglo);
				}
			}
		}
		for (int j=0;j<arreglo.length;j++) {
			arregloFinal+=arreglo[j]+",";
		}
		JOptionPane.showMessageDialog(null,"el arreglo inicial es\n"+arregloInicial+ "\nel arreglo despues del metodo de la burbuja es\n"+arregloFinal);
	}		
	public static void cambiarPosicion(int indexUno,int indexDos,int []arreglo) {
		int valorTemporal=arreglo[indexUno];
		int valorTemporalDos=arreglo[indexDos];
		arreglo[indexDos]=valorTemporal;
		arreglo[indexUno]=valorTemporalDos;
	}
}
