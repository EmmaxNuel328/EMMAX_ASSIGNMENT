import java.util.Scanner;
public class Array3{
public static void main(String[] args){
Scanner input = new Scanner(System.in); 
int[] scores = new int[12];
int add = 0;
int number = 0;
int average = 0;
	for(int counter = 1; counter <= 10; counter++ ){
	System.out.print("Enter number: ");
	number = input.nextInt();
	scores[counter] = number;
	add += number;
	average = add/10;
}


System.out.println("The sum is equal:"+add);
System.out.print("The Average is equal:"+ average);


}
}