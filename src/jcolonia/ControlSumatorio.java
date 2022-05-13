package src.jcolonia;

import java.util.Scanner;

/**
 * Gesti�n de n�meros �decimales�: recogida y visualizaci�n de la suma.
 * 
 * @versi�n 2022.3.1
 * @author <a href="dmartin.jcolonia@gmail.com">David H. Mart�n</a>
 */
public class ControlSumatorio {
	/**
	 * Texto identificativo de las funciones de la aplicaci�n que aparecer�n en el
	 * men� principal.
	 */
	private static final String[] OPCIONES_MEN�_PRINCIPAL = { "Agregar valor", "Mostrar valores", "Mostrar suma",
			"Restablecer", "SALIR" };

	/**
	 * T�tulo de la aplicaci�n. Se mostrar� como encabezado del men� principal.
	 */
	private static final String T�TULO_MEN�_PRINCIPAL = "Sumatorio";

	/**
	 * Recurso asociado a la entrada est�ndar de la aplicaci�n. Debe ser un objeto
	 * �nico a compartir con las diferentes vistas creadas.
	 */
	private Scanner entrada;

	private ListaN�meros conjunto;

	private VistaMen�B�sico men�Principal;

	public ControlSumatorio(Scanner in) {
		this.entrada = in;
		conjunto = new ListaN�meros();
	}

	private void buclePrincipal() {
		int opci�nElegida;
		boolean fin = false;

		men�Principal = new VistaMen�B�sico(T�TULO_MEN�_PRINCIPAL, entrada, OPCIONES_MEN�_PRINCIPAL);

		// Bucle general
		do {
			men�Principal.mostrarT�tulo1();
			men�Principal.mostrarOpciones();
			opci�nElegida = men�Principal.pedirOpci�n();
			switch (opci�nElegida) {
			case 5: // SALIR
				fin = true;
				Vista.mostrarAviso("���A-D-I-O-S!!");
				break;
//			case 1: // Opci�n 1: Entrada datos
//				cargarSumando();
//				break;
//			case 2: // Opci�n 2: Mostrar sumandos
//				mostrarSumandos();
//				break;
//			case 3: // Opci�n 3: Mostrar suma
//				mostrarSuma();
//				break;
//			case 4: // Opci�n 4: Reset
//				restablecer();
//				break;
			default: // Opci�n no esperada: abortar
				ejecutarGen�rico(opci�nElegida);
				System.err.println("Error interno de programa - operaci�n pendiente de desarrollo");
				System.exit(1);
			}
		} while (!fin);
	}

	private void ejecutarGen�rico(int id) {
		String mensaje;
		mensaje = String.format("%n  Ha elegido la opci�n %d: �%s�", id, OPCIONES_MEN�_PRINCIPAL[id - 1]);
		Vista.mostrarTexto(mensaje);
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		ControlSumatorio control = new ControlSumatorio(entrada);
		control.buclePrincipal();
		entrada.close();
	}
}

