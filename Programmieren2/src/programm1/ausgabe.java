package programm1;

import javax.swing.*;
public class ausgabe {
	public static void main(String[] args) {
		// Ausgabe im Konsolenfenster:
		System.out.print("Dies ist eine ");
		System.out.println("Ausgabe mit " + (4+3) + " Wörtern.");
		// formatierte Ausgabe im Konsolenfenster:
		System.out.printf("Dies ist %1$s Ausgabe mit %2$d Wörtern.\n", "eine", 4+3);
		System.out.printf("pi = %1$.3f \n", 3.141592653589793);
		// Ausgabe in eigenem Fenster:
		JOptionPane.showMessageDialog( null, "Die ist eine Ausgabe \n mit " + 7 + " Wörtern.");
	}
}
