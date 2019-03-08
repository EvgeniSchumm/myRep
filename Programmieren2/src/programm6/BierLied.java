package programm5;

public class BierLied
{
	public static void main (String[] args)
	{
		int BierAnzahl = 5;
		String Wort = "Flaschen";
		
		while (BierAnzahl > 0)
		{
			if (BierAnzahl == 1)
			{
				Wort = "Flasche";
			}
			
			System.out.println(BierAnzahl+" "+Wort+" Bier im Kuelschrank");
			System.out.println(BierAnzahl+" "+Wort+" Bier.");
			System.out.println("Hol eine raus.");
			System.out.println("Und lass sie rumgehen.");
			BierAnzahl = BierAnzahl - 1;
			
			
			
			if (BierAnzahl > 1)
			{
				System.out.println(BierAnzahl+" "+Wort+" Bier im Kuelschrank");
			}
			else if (BierAnzahl == 1)
			{
				Wort = "Flasche";
				System.out.println(BierAnzahl+" "+Wort+" Bier im Kuelschrank");
			}
			else
			{
				System.out.println("Kein Bier mehr im Kuelschrank");
			}
		}	
	}
}