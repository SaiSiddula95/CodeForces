import java.util.Scanner;

public class BoyOrGirl {
	private static int counter;
	private static int stringLength;
	
	public static void main(String[] args) {
//		String s = "hellho";
//		char c = 'h';
		
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println("String is: "+ s);
		
		stringLength = s.length();

		while(stringLength>0) {
			stringCheckAndRemove(s,s.charAt(0));			
		}
		
//		
//		System.out.println("String Length: "+stringLength);
		if(counter%2==0) {//Even
			System.out.println("Counter: "+counter);
			System.out.println("CHAT WITH HER!");
		}else{
			System.out.println("Counter: "+counter);
			System.out.println("IGNORE HIM!");
		}
		
		
	}
	
	private static void stringCheckAndRemove(String s,char c) {
		counter++;		
		
		while(s.indexOf(c)!=-1) {
			s = s.substring(0, s.indexOf(c))+s.substring(s.indexOf(c)+1,s.length());
			stringLength -= 1;
		}
		
	}
}
