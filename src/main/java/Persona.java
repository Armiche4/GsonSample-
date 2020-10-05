
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Persona {

	

	private String Nombre;
	private String Apellidos;
	private int Edad ;
	
	Persona(String n, String p, int e ){
		Nombre=n;
		Apellidos=p;
		Edad=e;
		
	}
	
	Persona(){
		anadir();
	}
	
	public void anadir() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nombre");
		Nombre = scanner.nextLine();
		System.out.print("Apellidos");
		Apellidos = scanner.nextLine();
		System.out.print("Edad");
		Edad = scanner.nextInt();	
		
		scanner.close();
	Persona p = new Persona (Nombre, Apellidos, Edad);	
jason(p);				
		
	}
	public void jason (Persona p) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
	}
	
}



