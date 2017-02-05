public class Monkey extends Animal
{
	
	public Monkey(String nom, String sexe, int poids) 
	{
		super(nom, sexe, poids);
		cptMonkey++;
		num=cptMonkey;
	}

	public void print() {
		System.out.println("Monkey #"+num+" "+name);
	}
	
}
