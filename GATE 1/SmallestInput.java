import java.util.Scanner;
public class SmallestInput{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int [] array = new int [5];
	
for(int index = 0; index < array.length; index++){
System.out.print("Enter a number: ");
int collect = input.nextInt();
array[index] = collect;
}
System.out.print(Cupcake.findSmallest(array));
}
}

