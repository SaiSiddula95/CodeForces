import java.util.Scanner;

public class StonesOnTheTable {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfStones = scan.nextInt();
		String pattern = scan.next().toLowerCase();
		int result = 0;
		
		for(int i = 0; i<pattern.length()-1;i++) {
			if(pattern.charAt(i)!=pattern.charAt(i+1)) {
				continue;
			}else {
				result++;
			}
		}
		
		System.out.println(result);
	}
}
