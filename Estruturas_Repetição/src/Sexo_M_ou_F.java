import java.util.Scanner;
public class Sexo_M_ou_F {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n1,n2;
		
		do {
		System.out.println("Digite o valor 1: ");
		n1 = sc.nextInt();
		System.out.println("Digite o valor 2: ");
		n2 = sc.nextInt();
		
		if(n2 <= n1)
			System.out.println("TENTE NOVAMENTE\n");
		}
		
		while(n2 <= n1);
			System.out.println("Os valores são " + n1 + " e " + n2);
		
		sc.close();
		
		
	}

}