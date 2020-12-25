import java.util.Scanner;

public class PetyaAndStrings {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word1 = scan.next().toLowerCase();
		String word2 = scan.next().toLowerCase();
		int result = word1.compareTo(word2);
		
		if(result<0) {
			System.out.println(-1);
		}else if(result>0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
	
	}
}
