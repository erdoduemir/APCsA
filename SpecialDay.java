	import java.util.Scanner;
public class SpecialDay {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter month: ");
		int month = input.nextInt();
		System.out.println("Enter day: ");
		int day = input.nextInt();
		if((month < 2) || (month  == 2 && day < 18)){
			System.out.println("Before");
		}
		else if(month == 2 && day ==18){
			System.out.println("Special");
		}
		else if(month > 2){
			System.out.println("After");
		}
		else if(month == 2 && day > 18){
			System.out.println("Before");
		}
	}

}
