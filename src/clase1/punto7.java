package clase1;

import javax.swing.JOptionPane;

public class punto7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tamañoCadena=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de enteros que quiere agregar al arreglo"));
		int []cadena=crearCadena(tamañoCadena);
		int cuantasVecesCorrer=Integer.parseInt(JOptionPane.showInputDialog("ingrese cuantas veces quiere correr el arreglo a la derecha"));
		correrCadena(cadena,cuantasVecesCorrer);
		crearMensaje(cadena,cuantasVecesCorrer);

	}
	public static int[]crearCadena(int tamañoCadena){
		int[]arreglo=new int [tamañoCadena];
		for(int i=0;i<tamañoCadena;i++) {
			arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la lista en la posicion "+(i+1)));
		}return arreglo;
	}
	public static void correrCadena(int []arreglo,int cantidadCorrer){
		int ultimoNumero;
		for(int i=0;i<cantidadCorrer;i++) {
			ultimoNumero=arreglo[arreglo.length-1];
			for(int x=arreglo.length-1;x>0;x--) {
				arreglo[x]=arreglo[x-1];
			}arreglo[0]=ultimoNumero;
		}
	}
	public static void crearMensaje(int []cadena,int cantidadCorrer) {
		String mensaje="el arreglo ingresado despues de correrlo "+cantidadCorrer+" de veces a la derecha queda asi\n";
		for (int x=0;x<cadena.length;x++) {
			mensaje+=cadena[x]+",";
		}JOptionPane.showMessageDialog(null, mensaje);
	}

}
