import java.util.Scanner;
public class Array8{
public static void main(String[] args){
Scanner input = new Scanner(System.in); 
int[] scores = new int[11];
int add = 0;
int number = 0;
	for(int counter = 1; counter <= 10; counter++ ){
	System.out.print("Enter number: ");
	number = input.nextInt();
	scores[counter] = number;
	add += number;
}

System.out.print("The sum is equal:"+add);

}
}