import java.util.Scanner;

public class watermelon {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		
		if(100>=w && w>=1) {//w is in range allowed
			if(w%2==0 && w !=2) {//divisible by 2 so even.
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}else{
			System.out.println("NO");			
		}		
	}	
}
