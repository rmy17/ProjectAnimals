public class Gestion
{
    public static void main (String [] arg)
    {
	while(true)
	    {
		printMenu();
		int ans = integerInput();
		switch(ans)
		    {
		    case 0 : System.out.println("Goodbye, see you soon !");break;
		    case 1 : addAnimal();break;
		    case 2 : Edit();break;
		    case 3 : Experimentation;break;
		    case 4 : Load;break;
	    }
    }
    
    public static void printMenu()
    {
	System.out.println(""
			   + "~~~Menu~~~\n"
			   + "\n"
			   + "1: Add animals\n"
			   + "2: Edit\n"
			   + "3: Experimentation\n"
			   + "4: Save\n"
			   + "5: Load\n"
			   + "6: Statistics\n"
			   + "7: Stress\n"
			   + "0: Exit\n");
	System.out.print("Choix : ");
	}
    
    public static int integerInput()
    {
	while(true)
	    {
		try {
		    BufferedReader buff = new BufferedReader
			(new InputStreamReader(System.in));
		    String chaine=buff.readLine();
		    int num = Integer.parseInt(chaine);
		    return num;
		}
		catch (NumberFormatException monexecption)
		    {
			System.out.println("vous devez saisir un nombre");
			System.out.println("recommencez");
		    }
		catch(IOException e )
		    {
			System.out.println("impossible de travailler" +e);
			return -1;
		    }	
	    }
    }

    public static String stringInput()
    {
	try
	    {
		BufferedReader buff = new BufferedReader
		    (new InputStreamReader(System.in));
		String chaine=buff.readLine();
		return chaine;
	    }
	catch(IOException e) {
	    System.out.println(" impossible de travailler" +e);
	    return null;
	}
    }
    
}
