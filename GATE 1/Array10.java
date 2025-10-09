import java.util.Scanner;
public class Array10{
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
	if(number <= 100){
	add += number;
	average += add/10;
	continue;
	
	


}
}

System.out.print("The sum is equal:"+average);

}
}