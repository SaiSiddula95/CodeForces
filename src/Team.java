import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Team {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int result = 0;
		for(int i = 0; i<n+1; i++) {
			int checker = 0;
			String s = scan.nextLine();
			Pattern p = Pattern.compile("1");
			Matcher m = p.matcher(s);
			while(m.find()) {
				checker++;
			}
			if(checker>=2) {
				result++;
			}
		}
		System.out.println(result);
	}	
}
