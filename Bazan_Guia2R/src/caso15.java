import java.util.Scanner;

public class caso15 {

	public static void main(String[] args) {
		String cliente, producto,fpago, used = "";
		int cantidad, valor, importe;
		float desc= 0, total= 0;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre del cliente: ");
		cliente = sc.nextLine();
		
		System.out.println("Nombre de productor: ");
		producto = sc.nextLine();
		
		System.out.println("Cantidad del producto: ");
		cantidad = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Forma de pago: ");
		fpago = sc.nextLine();
		
		
		switch(producto) {
			case "TB": 
				producto = "Tablet";
				valor = 350;break;
			case "LT":
				producto = "Laptop";
				valor = 2300;break;
			case "MN":
				producto = "Monitor";
				valor = 850;break;
			case "IM": 
				producto = "Impresora";
				valor = 680;break;
			default:
				producto = "Desconocido";
				valor = 0;break;
		}
		
		importe = cantidad * valor;
		
		switch(fpago) {
			case "C1":
				fpago = "Contado";
				used = "Descuento";
				desc = importe * 0.05f;
				total = importe - desc;break;
			case "C2":
				fpago = "Credito";
				used = "Incremento";
				desc = importe * 0.12f;
				total = importe + desc;break;
		}
		
		System.out.println("---------------------------");
		System.out.println("Resultado");
		System.out.println("---------------------------");
		System.out.println("Cliente:			"+ cliente);
		System.out.println("Precio:				"+ valor);
		System.out.println("Cantidad:			"+ cantidad);
		System.out.println("Importe:			"+ importe);
		System.out.println("Forma de pago:			"+ fpago);
		System.out.println(used+":			"+ desc);
		System.out.println("Total a pagar:			"+ total);

	}

}
