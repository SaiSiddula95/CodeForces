import java.util.Scanner;
import java.lang.Object;

public class WordCapitalization {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String w = scan.next();
		//char[] list = new char[w.length()];
		char[] list = w.toCharArray();
		String result = "";
		
		for(int i = 0; i<list.length;i++) {
			if(i==0) {
				result += Character.toUpperCase(w.charAt(i));
				//list[i] = Character.toUpperCase(list[i]);
			}else {
				result += w.charAt(i);
			}
		}
		System.out.println(result);	
	}
}
