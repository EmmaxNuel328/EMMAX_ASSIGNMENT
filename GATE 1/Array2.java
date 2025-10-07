import java.util.Scanner;
public class Array2{
public static void main(String[] args){
Scanner input = new Scanner(System.in); 
int[] scores = new int[12];
int average = 0;
int number = 0;
	for(int counter = 1; counter <= 10; counter++ ){
	System.out.print("Enter number: ");
	number = input.nextInt();
	scores[counter] = number;
	average += number/10;
}


System.out.print("The Average is equal:"+ average);


}
}