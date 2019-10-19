
public class Main {
	
	int e=0;
   
	public static void name(String nombre) {
		
		System.out.println("Nombre: " + nombre);
		
	}
	
	public int age(int n) {
		
		e= 2019-n;
		return e;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main c = new Main();
		name("MARIMAR");
		c.age(1998);
		System.out.println("Edad : " + c.e);
	}

}
