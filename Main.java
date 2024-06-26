 
public class Main {
	public static void main(String[] args) {
		int n = 5;
		
		System.out.println("First : =>");
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print("\t" + i);
			}
			System.out.println();
		}

		System.out.println("Second : =>");
		for(int i=n; i>=1; i--){
			for(int j=1; j<=i; j++){
				System.out.print("\t" + i);
			}
			System.out.println();
		}

		System.out.println("Third : =>");
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print("\t"+j);
			}
			System.out.println();
		}

		System.out.println("Fourth : =>");
		for(int i=n; i>=1; i--){
			for(int j=n; j>=i; j--){
				System.out.print("\t"+j);
			}
			System.out.println();
		}
	}
} 