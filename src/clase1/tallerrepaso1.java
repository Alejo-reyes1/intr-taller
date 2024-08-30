package clase1;
import javax.swing.JOptionPane;

public class tallerrepaso1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroUno=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero 1"));
		int numeroDos=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero 2"));
		int numeroTres=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero 3"));
		verificarMayor(numeroUno,numeroDos,numeroTres);
	}
	public static void verificarMayor(int x,int y,int z) {
		if(x>y && x>z && y>z) {
			System.out.println("El Mayor es el numero "+ x + " El numero del medio es "+ y +" el numero menor es " +z);
		}else if(x>y && x>z && y<z) {
			System.out.println("El Mayor es el numero "+ x + " El numero del medio es "+ z +" el numero menor es " +y);
		}else if(y>z && y>x && z>x) {
			System.out.println("El Mayor es el numero "+ y + " El numero del medio es "+ z +" el numero menor es " +x);
		}else if(y>z && y>x && z<x) {
			System.out.println("El Mayor es el numero "+ y + " El numero del medio es "+ x +" el numero menor es " +z);
		}else if(z>x && z>y && y>z) {
			System.out.println("El Mayor es el numero "+ z + " El numero del medio es "+ y +" el numero menor es " +x);
		}else if(z>x && z>y && z>y) {
			System.out.println("El Mayor es el numero "+ z +  "El numero del medio es "+ z +" el numero menor es " +y);
		}
	}
}
