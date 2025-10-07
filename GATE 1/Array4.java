import java.util.Scanner;
public class Array4{
public static void main(String[] args){
Scanner input = new Scanner(System.in); 
int[] scores = new int[11];
int add = 0;
int number = 0;
int average = 0;
	for(int counter = 0; counter < 10; counter++ ){
	System.out.print("Enter number: ");
	number = input.nextInt();
		if(counter % 2 == 0){
	scores[counter] = number;
	add += number;

	
}

}
System.out.println(add);

for(int counter = 1; counter <= 10; counter++ ){



}

}
}