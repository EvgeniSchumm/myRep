package programm4;

public class MischMasch4 {
	int z�hler = 0;
	
	public static void main(String [] args) {
		int anzahl = 0;
		MischMasch4[] m4a =new MischMasch4[20];
		int x = 0;
		while (x < 9) {
			m4a[x] = new MischMasch4();
			m4a[x].z�hler = m4a[x].z�hler + 1;
			anzahl = anzahl + 1;
			anzahl = anzahl
			+ m4a[x].vielleichtNeu(x);
			x = x + 1;
		}
		System.out.println(anzahl + " "
		+ m4a[1].z�hler);
	}

	public int vielleichtNeu(int index) {
		if (index < 5) {
		MischMasch4 m4 = new MischMasch4();
		m4.z�hler = m4.z�hler + 1;
		return 1;
		}
		return 0;
	}
}
