import java.util.Scanner;

public class Tram {
	private static int maximumCapacity = 0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfStops = scan.nextInt();
		int numberOfPeople = 0;//initially 0 people in tram
		int[] exitingPassengers = new int[numberOfStops];
		int[] passengersEntering = new int[numberOfStops];
		
		for(int i =0;i<numberOfStops;i++) {
			exitingPassengers[i] = scan.nextInt();
			passengersEntering[i] = scan.nextInt();
		}
		
		for(int i = 0; i<numberOfStops;i++) {
			
			if(i==0) {//First iteration, so can't 
				numberOfPeople += passengersEntering[i];
				maxCap(numberOfPeople);
				//System.out.println(numberOfPeople);
			}else if(i==numberOfStops-1) {//last stop
				numberOfPeople = 0;
				//System.out.println("Final Stop: " + numberOfPeople);
			}else {//logic for stops inbetween last and first				
				if(peopleChecker(numberOfPeople - exitingPassengers[i])) {
					//System.out.println(exitingPassengers[i] + " amount of people are exiting");
					numberOfPeople = 0;
					numberOfPeople += passengersEntering[i];
					//System.out.println(passengersEntering[i] + " amount of people are entering");
				}else {
					numberOfPeople = numberOfPeople - exitingPassengers[i];
					//System.out.println(exitingPassengers[i] + " amount of people are exiting");
					numberOfPeople += passengersEntering[i];
					//System.out.println(passengersEntering[i] + " amount of people are entering");
				}
				maxCap(numberOfPeople);
				//System.out.println(numberOfPeople);
			}
			
		}
		System.out.println(maximumCapacity);
		scan.close();
	}
	
	private static boolean peopleChecker(int value) {
		if(value<0) {
			return true;
		}
		return false;
	}
	
	private static void maxCap(int numberOfPeople) {
		if(numberOfPeople>maximumCapacity) {
			maximumCapacity = numberOfPeople;
		}
	}
	
}
