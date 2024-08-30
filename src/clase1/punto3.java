package clase1;

import javax.swing.JOptionPane;

public class punto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cuantosNumeros=Integer.parseInt(JOptionPane.showInputDialog("Cuantos numeros desea ingresar? "));
		int[] arreglo=crearCadena(cuantosNumeros);
		String positivos=verificarPositivos(arreglo);
		String negativos=verificarNegativos(arreglo);
		String ceros=verificarCeros(arreglo);
		imprimir(positivos,negativos,ceros);
	}
	public static int[]crearCadena(int cuantosNumeros) {
		int[] listaNumeros=new int[cuantosNumeros];
		for(int i=0;i<cuantosNumeros;i++) {
			listaNumeros[i]=Integer.parseInt(JOptionPane.showInputDialog("nuemro a ingresar: "));
			
		}return listaNumeros;
	}
	public static String verificarPositivos(int []arreglo){
		int cantidadPositivos=0;
		double porcentaje;
		String positivosFinal;
		for(int i=0;i<arreglo.length;i++) {
			if(arreglo[i]>0) {
				cantidadPositivos+=1;
			}
		}porcentaje=((double)cantidadPositivos/arreglo.length)*100;
		positivosFinal = "La cantidad de positivos es " + cantidadPositivos + 
                " y su porcentaje es " + String.format("%.2f", porcentaje) + "%";
		return positivosFinal;
	}
	public static String verificarNegativos(int []arreglo){
		int cantidadNegativos=0;
		double porcentaje;
		String positivosFinal;
		for(int i=0;i<arreglo.length;i++) {
			if(arreglo[i]<0) {
				cantidadNegativos+=1;
			}
		}porcentaje=((double)cantidadNegativos/arreglo.length)*100;
		positivosFinal = "La cantidad de negativos es de " + cantidadNegativos + 
                " y su porcentaje es " + String.format("%.2f", porcentaje) + "%";
		return positivosFinal;
	}
	public static String verificarCeros(int []arreglo){
		int cantidadCeros=0;
		double porcentaje;
		String positivosFinal;
		for(int i=0;i<arreglo.length;i++) {
			if(arreglo[i]==0) {
				cantidadCeros+=1;
			}
		}porcentaje=((double)cantidadCeros/arreglo.length)*100;
		positivosFinal = "La cantidad de negativos es de " + cantidadCeros + 
                " y su porcentaje es " + String.format("%.2f", porcentaje) + "%";
		return positivosFinal;
	}
	public static void imprimir(String positivos,String negativos,String ceros) {
		String salida="la cantidad de positivos son "+positivos+ "\nla cantidad de negativos son"+negativos+"\nla cantidad de ceros son "+ceros;
		System.out.print(salida);
	}

}
