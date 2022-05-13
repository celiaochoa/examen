package src.jcolonia;

import java.util.Scanner;

/**
 * Clase VistaMenúBásico que crea un menu con un nombre detallado para el proyecto
 * @author Celia-07
 *
 */
public class VistaMenúBásico {
	
	private Scanner Sc;
	private String[] opcionesMenúPrincipal;
	private String[] títuloMenúPrincipal;
	private int  opciónElegida;
	/**
	 * Constructor de la clase VistaMenúBásico
	 * @param títuloMenúPrincipal parametro que define el titulo del menu
	 * @param entrada parametro que define la captura de datos por teclado
	 * @param opcionesMenúPrincipal parametro que define la cantidad de opciones del menu
	 */
	public VistaMenúBásico(String títuloMenúPrincipal, Scanner entrada, String[] opcionesMenúPrincipal) {
		this.Sc=entrada;
		
		
		this.opcionesMenúPrincipal=new String[opcionesMenúPrincipal.length];
		for(int i=0; i<opcionesMenúPrincipal.length; i++) {
			this.opcionesMenúPrincipal[i]=opcionesMenúPrincipal[i];
		}
	}
	
	/**
	 * Metodo que imprime el texto en la consola
	 * @param texto parametro que define el texto
	 */
	public static void mostrarTítulo1(String texto) {
		System.out.println(texto);
	}
	
	
	/**
	 * Metodo que recorre la longitud del menu y lo imprime en la consola
	 */
	public void mostrarOpciones() {
		System.out.println("MENU");
		System.out.println("----------");
		for (int k=0; k<opcionesMenúPrincipal.length;k++) {
			System.out.printf("%d ------>%s%n",(k+1), opcionesMenúPrincipal[k]);
		}
		System.out.println("0------> salir");
		
		System.out.printf("Introduce una opcion");
		
	}

	/**
	 * Metodo que tiene una entrada por teclado para que el usuario eliga la opcion
	 * @return devuelve el valor de la opcion elegida
	 */
	public int pedirOpción() {
		String linea;
		
		boolean salir=false;
		
		while(!salir) {
			try {
				linea=Sc.nextLine();
				opciónElegida=Integer.parseUnsignedInt(linea);
				if (opciónElegida>opcionesMenúPrincipal.length) {
					System.out.println("Esta opcion no es valida");
				}else {
					salir=true;
				}
				
				
			}catch(NumberFormatException ex) {
				System.out.printf("\tNo es una de las opciones validas <%s>%n",ex.getMessage());
			}
		}
		return opciónElegida;
	}

	

}
