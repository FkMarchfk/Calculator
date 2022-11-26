import java.util.Scanner; 

import java.io.IOException; 

public class Kalkulator {
	public static void main(String[] args) throws IOException, InterruptedException{

		double a, b, c;
		int e=0;
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();



		Scanner myObj = new Scanner(System.in);  

		System.out.println("Select a math operation to perform (+, -, /, *)");
		String d= myObj.nextLine(); 

		if ((d.equals("+")) || (d.equals("-")) || (d.equals("/")) || (d.equals("*"))){

			System.out.println("Enter the first number");
			a = myObj.nextDouble(); 

			System.out.println("Enter the second number");
			b = myObj.nextDouble();  

			switch (d){
				case "+":
					c=a+b;
					System.out.println("Addition result: " + a + " + " + b + " = " + c);
				break;
				case "-":
					c=a-b;
					System.out.println("Subtraction result: " + a + " - " + b + " = " + c);
				break;
				case "*":
					c=a*b;
					System.out.println("Multiplication result: " + a + " * " + b + " = " + c);
				break;

				case "/":
					if (b==0) {
						System.out.println("NO DIVINE BY ZERO DUDE!");
					}
					else {
						c=a/b;
						System.out.println("Division result: " + a + " / " + b + " = " + c);
					}
			}
		}

		else{
			System.out.println("NO MATHEMATICAL OPERATION WAS ENTERED!");
		}
	}
}
