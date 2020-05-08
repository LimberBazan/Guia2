import java.util.Scanner;

public class caso13 {

	public static void main(String[] args) {
		int n1,n2,opc;
		float rpta = 0f;
		String oper = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el numero 1: ");
		n1 = sc.nextInt();
		System.out.println("Ingrese el numero 2: ");
		n2 = sc.nextInt();
		System.out.println("Ingrese el numero de operacion [1-6]: ");
		opc = sc.nextInt();
		
		switch(opc) {
			case 1:
				oper = "Suma";
				rpta = n1+n2;break;
			case 2:
				oper = "Resta";
				if (n1>n2) {
					rpta = n1- n2;
				}else {
					rpta = n2 - n1;
				}break;
			case 3:
				oper = "Multiplicacion";
				rpta = n1 * n2;break;
			case 4:
				oper = "Division";
				if(n2>0) {
					rpta=n1/n2;
				}else {
					System.out.println("No se puede dividir con 0");
				}
				break;
			case 5:
				oper = "Resto entero";
				if(n2>0) {
					rpta= n1%n2;
				}else {
					System.out.println("No se puede dividir con 0");
				}break;
			case 6:
				oper = "Promedio";
				rpta = (n1*n2)/2;break;
		}
		
		
		System.out.println("---------------------------");
		System.out.println("Resultado");
		System.out.println("---------------------------");
		System.out.println("Numero 1:"+ n1);
		System.out.println("Numero 2:"+ n2);
		System.out.println("Operacion:"+ oper);
		System.out.println("Resultado: " + rpta);

	}
}