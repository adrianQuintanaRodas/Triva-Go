package Controlador;

import javax.swing.JOptionPane;

import Modelo.Cliente;

public class Controlador {
	/*por el momento los datos se an metido a mano en el programa para ir creando las funcionalidades 
	 * del programa mas adelante se iran implementando mas metodos y conexiones con la base de datos
	 */
	public static Cliente c1 = new Cliente("m","adrian","quintana",36525,"adrian","12345678");
	public static void main(String[] args) {
		lanzarMensaje();
		//metodo para saber si funciona correctamente el metodo de logueo
		if(logueo(c1.getDni(), c1.getContraseña())==true) {
			System.out.println("perfecto");
		}else {
			System.out.println("mal");
		}
	}
	/*metodo para loguearse que, por ahora los datos se an metido a mano y no por una
	 * base de datos, pero mas adelante el metodo hara una select a la base de datos para 
	 * comparar lo que se le pase con los campos de la base de datos
	 */
	public static boolean logueo(String usu, String con) {
		//esta parte habra que cambiarla y los datos de las variables seran cojidas desde la base de datos
		String nombre="adrian";
		String contraseña="12345678";
		//comparacion de los datos de las variables con los parametros que se le an pasado al metodo
		if(nombre.equals(usu)&&contraseña.equals(con)) {
			return true;
		}
		return false;
	}
	public static void lanzarMensaje(){
		  //En la siguiente línea está la magia (es lo que muestra el mensaje).
		  JOptionPane.showMessageDialog(null,"Usuario logueado correctamente"+ "\n tu usuario sera tu dni");
		 }

}
