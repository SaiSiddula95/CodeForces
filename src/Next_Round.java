import java.util.Scanner;

public class Next_Round {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();//#of participants
		int k = scan.nextInt();//#kth score+ to pass
		int[] scoreList = new int[n];
		int passingScore = 0;
		int result = 0;
		
		
		for(int i =0;i<n;i++) {
			scoreList[i] = scan.nextInt();
			if(i+1==k && scoreList[i]>=0) {
				passingScore = scoreList[i];//setting kth score as new passing Score is >0
				//result++;
			}
		
		}
		
		if(passingScore>=0) {
			for(int i = 0; i<n;i++) {
				if(scoreList[i]>=passingScore && scoreList[i]>0) {
					result++;
				}
			}
		}		
		System.out.println(result);		
		
	}
	
}
