import java.util.Scanner;
public class Apenas_positivos {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double n1;
		
		do {
			System.out.print("Digite o valor positivo: ");
			n1 = sc.nextDouble();
			
		}while (n1 <= 0 );
		System.out.println("Valor positivo digitado " + n1);

		sc.close();
		
		
	}

}