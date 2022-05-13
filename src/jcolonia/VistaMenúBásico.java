package src.jcolonia;

import java.util.Scanner;

/**
 * Clase VistaMen�B�sico que crea un menu con un nombre detallado para el proyecto
 * @author Celia-07
 *
 */
public class VistaMen�B�sico {
	
	private Scanner Sc;
	private String[] opcionesMen�Principal;
	private String[] t�tuloMen�Principal;
	private int  opci�nElegida;
	/**
	 * Constructor de la clase VistaMen�B�sico
	 * @param t�tuloMen�Principal parametro que define el titulo del menu
	 * @param entrada parametro que define la captura de datos por teclado
	 * @param opcionesMen�Principal parametro que define la cantidad de opciones del menu
	 */
	public VistaMen�B�sico(String t�tuloMen�Principal, Scanner entrada, String[] opcionesMen�Principal) {
		this.Sc=entrada;
		
		
		this.opcionesMen�Principal=new String[opcionesMen�Principal.length];
		for(int i=0; i<opcionesMen�Principal.length; i++) {
			this.opcionesMen�Principal[i]=opcionesMen�Principal[i];
		}
	}
	
	/**
	 * Metodo que imprime el texto en la consola
	 * @param texto parametro que define el texto
	 */
	public static void mostrarT�tulo1(String texto) {
		System.out.println(texto);
	}
	
	
	/**
	 * Metodo que recorre la longitud del menu y lo imprime en la consola
	 */
	public void mostrarOpciones() {
		System.out.println("MENU");
		System.out.println("----------");
		for (int k=0; k<opcionesMen�Principal.length;k++) {
			System.out.printf("%d ------>%s%n",(k+1), opcionesMen�Principal[k]);
		}
		System.out.println("0------> salir");
		
		System.out.printf("Introduce una opcion");
		
	}

	/**
	 * Metodo que tiene una entrada por teclado para que el usuario eliga la opcion
	 * @return devuelve el valor de la opcion elegida
	 */
	public int pedirOpci�n() {
		String linea;
		
		boolean salir=false;
		
		while(!salir) {
			try {
				linea=Sc.nextLine();
				opci�nElegida=Integer.parseUnsignedInt(linea);
				if (opci�nElegida>opcionesMen�Principal.length) {
					System.out.println("Esta opcion no es valida");
				}else {
					salir=true;
				}
				
				
			}catch(NumberFormatException ex) {
				System.out.printf("\tNo es una de las opciones validas <%s>%n",ex.getMessage());
			}
		}
		return opci�nElegida;
	}

	

}
