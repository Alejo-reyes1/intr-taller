package clase1;

import javax.swing.JOptionPane;

public class punto5 {

	public static void main(String[] args) {
		int matrizTamaño=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la matriz cuadrado"));
		int [][]matrizUno=crearMatriz(matrizTamaño);
		int[][]matrizDos=crearMatriz(matrizTamaño);
		int[][]matrizEspejo=crearMatrizEspejo(matrizUno,matrizDos);
		String mensajeMatrizUno=mostrarMatriz(matrizUno);
		String mensajeMatrizDos=mostrarMatriz(matrizDos);
		String mensajeMatrizEspejo=mostrarMatriz(matrizEspejo);
		mostrarResultado(mensajeMatrizUno,mensajeMatrizDos,mensajeMatrizEspejo);
		

	}
	public static int [][]crearMatriz(int matrizTamaño){
		int [][]matriz= new int[matrizTamaño][matrizTamaño];
		for (int x=0;x<matrizTamaño;x++) {
			for(int i=0;i<matrizTamaño;i++) {
				matriz[x][i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+(x+1)+" "+(i+1)+" de la matriz"));
			}
		}return matriz;
	}
	public static int[][]crearMatrizEspejo(int[][]matrizUno,int[][]matrizDos){
		int n=matrizUno.length;
		int [][]matrizEspejo=new int[n][n];
		int espejoI;
		int espejoJ;
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				espejoI=n-1-i;
				espejoJ=n-1-j;
				matrizEspejo[i][j]=matrizUno[i][j]+matrizDos[espejoI][espejoJ];
			}
		}return matrizEspejo;
	}
	public static String mostrarMatriz(int [][]matrizUno) {
		String mensajeMatriz="";
		for(int i=0;i<matrizUno.length;i++) {
			for(int j=0;j<matrizUno.length;j++) {
				mensajeMatriz+=matrizUno[i][j]+" ";
			}mensajeMatriz+="\n";
		}return mensajeMatriz;
	}
	public static void mostrarResultado(String matrizUno,String matrizDos,String matrizEspejo) {
		String mensaje="El resultado de la suma de la matriz 1 que es:\n"+matrizUno+"\ncon la suma espejo de la matriz dos:\n"
				+matrizDos+"\nda como resultado:\n" +matrizEspejo;
		JOptionPane.showMessageDialog(null, mensaje);
	}

}
