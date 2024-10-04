
import java.util.Scanner;

public class ExB_mariaeduarda {

	public static void main(String[] args) {
		int i, tabuada, res;
		
		Scanner sc = new Scanner(System.in);
		tabuada = sc.nextInt();
		
		for (i=0; i<=10; i++) {
		res = tabuada * i;
		System.out.println(tabuada + " x " + i + " = " + res);
		}
		System.out.printf("\n");

	}

}