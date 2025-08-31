import java.util.*;
public class SomarDoisNumeros {
	public static Scanner sc = new Scanner(System.in);
	//integraçao eclipse e git//
	public static void main(String args[]) {
		int number1,number2,soma;
		System.out.println("Digite um numero");
		number1 = sc.nextInt();
		System.out.println("Digite o proximo numero");
		number2 = sc.nextInt();
		
		soma = number1+number2;
		
		System.out.println("Soma:"+soma);
	}
}
