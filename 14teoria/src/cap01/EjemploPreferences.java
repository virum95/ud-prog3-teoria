package cap01;

import java.util.prefs.*;

/**  Ejemplo de clase java.util.prefs.Preferences
 * @author Andoni Egu�luz Mor�n
 * Facultad de Ingenier�a - Universidad de Deusto
 */
public class EjemploPreferences {

	// Variable de preferencias - se crea con una instancia 
	static private Preferences prefs = 
			Preferences.userNodeForPackage(EjemploPreferences.class);
	
	// Prueba de preferencias
	public static void main(String[] args) {
		String pref = "PRUEBA";
		String valor = "1024,768";
		System.out.println( "Valor de la preferencia " + pref +
				": " + prefs.get( pref, "NO EXISTE" ));
		System.out.println( "Cambiamos la preferencia a: " + valor );
		prefs.put( pref, valor );  // Mete la preferencia
		// prefs.remove( pref );  //  Lo quita
		
		// Las preferencias se guardan en el registro de Windows o
		// en los equivalentes en otros sistemas.
		// Por tanto, se mantienen entre ejecuciones y 
		// cierres/apagados del ordenador.
		// (No es adecuado abusar)
		
		// En windows
		// regedit
	}

}