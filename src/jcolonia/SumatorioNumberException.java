package src.jcolonia;

/**
 * Excepci�n usada generalmente en la aplicaci�n �Sumatorio MVC� cuando se
 * intenta a�adir con formato incorrecto o fuera del rango soportado.
 * 
 * @versi�n 2022.3.1
 * @author <a href="dmartin.jcolonia@gmail.com">David H. Mart�n</a>
 */
public class SumatorioNumberException extends Exception {

	/** N�mero de serie, asociado a la versi�n de la clase. */
	private static final long serialVersionUID = 20220509001L;

	/**
	 * Crea una excepci�n sin ninguna informaci�n adicional.
	 */
	public SumatorioNumberException() {
		super();
	}

	/**
	 * Crea una excepci�n con un texto descriptivo.
	 * 
	 * @param mensaje el texto correspondiente
	 */
	public SumatorioNumberException(String mensaje) {
		super(mensaje);
	}

	/**
	 * Crea una excepci�n secundaria almacenando otra excepci�n de referencia.
	 * 
	 * @param causa la excepci�n �o {@link Throwable}� correspondiente
	 */
	public SumatorioNumberException(Throwable causa) {
		super(causa);
	}

	/**
	 * Crea una excepci�n secundaria almacenando otra excepci�n de referencia y un
	 * texto descriptivo.
	 * 
	 * @param mensaje el texto correspondiente
	 * @param causa   la excepci�n �o {@link Throwable}� correspondiente
	 */
	public SumatorioNumberException(String mensaje, Throwable causa) {
		super(mensaje, causa);
	}
}
