/**
 * 
 */
package patrones;

/**
 * @author DUSGAB
 *
 */
public class Principal {

	public static void main(String[] args) {

		ServicioMensaje sm = new ServicioMensajeImpl();
		System.out.println(sm.mensaje("pepito"));

	}

}
