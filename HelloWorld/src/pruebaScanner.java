import java.util.Scanner;

public class pruebaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("Escribe en pantalla:", keyboard);
		int numero = keyboard.nextInt();
		keyboard.close();
		System.out.printf("El triple es %d", numero *3).println();
	}

}
