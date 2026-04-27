import java.util.Scanner;

public class MenuCuentaCredito {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int opcion;
		opcion = Integer.parseInt(teclado.nextLine());

		do {
			System.out.println("1. Ingresar dinero");
			System.out.println("2. Sacar dinero");
			System.out.println("3. Mostrar saldo y crédito");
			System.out.println("4. Salir");

			switch (opcion) {
			case 1:

				break;

			case 2:

				break;

			case 3:

				break;

			case 4:
				System.out.println("Saliendo del programa.");
				break;
			}
		} while (opcion != 4);

	}

}
