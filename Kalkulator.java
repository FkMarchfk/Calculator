import java.util.Scanner; // Importuje zmienne wprowadzone przez użytkownika do programu
import java.io.IOException; 

public class Kalkulator {
	public static void main(String[] args) throws IOException, InterruptedException{

		double a, b, c;
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); // Czyszczenie okna cmd


		Scanner myObj = new Scanner(System.in);  // Utworzenie obiektu Skanera 
		System.out.println("Enter the first number");
		a = myObj.nextDouble();  // Zapisanie zmiennej od użytkownika

		System.out.println("Enter the second number");
		b = myObj.nextDouble();  // Zapisanie zmiennej od użytkownika
		
		c=a+b;
		System.out.println("Addition result: " + a + " + " + b + " = " + c);
		c=a-b;
		System.out.println("Subtraction result: " + a + " - " + b + " = " + c);
		c=a*b;
		System.out.println("Multiplication result: " + a + " * " + b + " = " + c);

		if (b==0) {
			System.out.println("NO DIVINE BY ZERO DUDE!");
		}
		else {
		c=a/b;
		System.out.println("Division result: " + a + " / " + b + " = " + c);
		}
	}
}