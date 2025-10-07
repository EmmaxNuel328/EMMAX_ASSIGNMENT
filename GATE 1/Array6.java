import java.util.Scanner;
public class Array6{
public static void main(String[] args){
Scanner input = new Scanner(System.in); 
int[] scores = new int[11];
int add = 0;
int number = 0;
int average = 0;
	for(int counter = 1; counter <= 10; counter++ ){
	System.out.print("Enter number: ");
	number = input.nextInt();
	scores[counter] = number;
	if(scores[counter] % 2 == 0){
	add += number;
	average += add/10;

}

}
System.out.print("The sum of even is equal:"+add);
System.out.print("The average of even is equal:"+ average);

}
}