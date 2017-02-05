public abstract class Animal
{
	protected String name;
	protected String sex;
	protected float [] weight = new float [2]; // 2 elements table, start weight and end weight 
	protected String [] state = new String [5]; // 5 elements table, one for each day, dead or alive
	protected int num;
	public static int cptAnim; 
	public static int cptMonkey;
	public static int cptMouse;
	
	public Animal(String nom, String sexe, int poids)
	{
		name=nom;
		sex=sexe;
		weight[0]=poids;
		state[0]="A";
		cptAnim++;
		System.out.println("Animal added");
	}
	
	public abstract void print();
}
