public class Mouse extends Animal
{
	int group;
	
	public Mouse(String nom, String sexe, int poids, int groupe) 
	{
		super(nom, sexe, poids);
		group = groupe;
		cptMouse++;
		num=cptMouse;
	}

	public void print() {
		System.out.println("Mouse #"+num+" "+name);
	}	
}
