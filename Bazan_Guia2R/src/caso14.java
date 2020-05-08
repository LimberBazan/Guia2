import java.util.Scanner;

public class caso14 {

	public static void main(String[] args) {
		String carr,turno;
		float sueldo = 0, desc = 0f, total;
		float dolar = 3.33f;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre su carrera [DS, RC, DG]: ");
		carr = sc.nextLine();
		
		System.out.println("Turno [M, T, N]: ");
		turno = sc.nextLine();
		
		
		switch(carr){
			case "DS":
				sueldo = 1500f;break;
			case "RC":
				sueldo = 1400f;break;
			case "DG":
				sueldo = 1300f;break;
		}
		
		switch(turno){
			case "M":
				turno = "Mañana";
				desc = 0.1f;break;
			case "T":
				turno = "Tarde";
				desc = 0.2f;break;
			case "N":
				turno = "Noche";
				desc = 0.15f;break;
		}
		total = sueldo * desc;
		total = sueldo - total;
		dolar = total / dolar;
		
		
		System.out.println("---------------------------");
		System.out.println("Resultado");
		System.out.println("---------------------------");
		System.out.println("Monto:			"+ sueldo);
		System.out.println("Turno:			"+ turno);
		System.out.println("Descuento: 		"+ 	desc);
		System.out.println("Total a pagar:	"+ total);
		System.out.println("Cambio a dolar:	"+ dolar);
		
	}

}
