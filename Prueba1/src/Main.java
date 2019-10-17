
public class Main {
	
	int s=0;
   
	public static void salida(String nombre) {
		
		System.out.println("Hola esto es una prueba: " + nombre);
		
	}
	
	public int antes(int n) {
		
		s= n+2;
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main c = new Main();
		salida("MARIMAR");
		c.antes(2);
		System.out.println("Suma :" + c.s);
	}

}
