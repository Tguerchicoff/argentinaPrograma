package Ejercicios;
import java.util.Scanner;


public class Ejercicio2 {
	Scanner input = new Scanner(System.in);
	
	private boolean cantIngresos(double cantidad) {
		boolean es = cantidad < 489083;
		return es;
	}
	
	private boolean cantVehiculos(int cant) {
		boolean es = cant <= 3;
		return es;
	}
	
	private boolean cantInmbuebles(int cant) {
		boolean es = cant <= 3;
		return es;
	}
	
	private boolean tieneLujo(String tiene) {
		boolean lujo = true;
		if(tiene == "N" ) {
			lujo = false;
		}
		
		return lujo;
	}
	
	public void consultor() {
		boolean ok = true;
		System.out.println("Ingrese sus ingresos mensuales: ");
		double ingresos = input.nextDouble();
		ok = cantIngresos(ingresos);
		if(ok) {
			System.out.println("Ingrese la cantidad de vehiculos que posee con 5 o menos años de antiguedad");
			int cantidad = input.nextInt();
			ok = cantVehiculos(cantidad);
		}	else if(ok) {
			System.out.println("Ingrese la cantidad de inmuebles que posee:");
			int cantidad = input.nextInt();
			ok = cantInmbuebles(cantidad);
		}	else if(ok) {
			System.out.println("Tiene usted cosas lujosas? S/N");
			ok = tieneLujo(input.next());
		}
		
	if(ok) {
		System.out.println(	"Usted no tiene ingresos altos");
	}else {
		System.out.println(	"Usted tiene ingresos altos");
	}
	}
}
