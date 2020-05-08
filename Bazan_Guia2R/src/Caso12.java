import java.util.Scanner;

public class Caso12 {

	public static void main(String[] args) {
		int n = 0;
		float sueldo,nsueldo;
		String empleado;
		
		System.out.println("Nombre del empleado: ");
		Scanner sc = new Scanner(System.in);
		empleado = sc.nextLine();
		
		System.out.println("Ingrese su nivel: ");
		n = sc.nextInt();
		
		System.out.println("Ingrese su sueldo: ");
		sueldo = sc.nextFloat();
		
		float inc = 0;
		
		switch(n){
			case 1:
				inc = 0.045f;break;
			case 2:
				inc = 0.06f;break;
			case 3:
				inc = 0.085f;break;
			case 4:
				inc = 0.11f;break;	
		}
		
		nsueldo = inc * sueldo;
		
		System.out.println("---------------------------");
		System.out.println("ResultaXdo");
		System.out.println("---------------------------");
		System.out.println("Empleado:	"+ empleado);
		System.out.println("Nivel:		"+ n);
		System.out.println("Sueldo: 	"+ 	sueldo);
		System.out.println("Incremento:	"+ inc);
		System.out.println("Nuevo sueldo:	"+ nsueldo);
		
		
	}

}
