public class ExD_mariaeduarda {
    public static void main(String[] args) {
		int i, res = 0;
		
		for(i=0; i<=500; i++) {
			if(i%2 == 0) {
				res += i;
			}
		}
		System.out.println("A soma dos números pares é: " + res);

	}
}
