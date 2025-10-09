import java.util.Scanner;
public class Average{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int[] array = new int [6];
int number = 0;
for(int counter = 0; counter < array.length; counter++){
System.out.print("Enter a number: ");
number = input.nextInt();
array[counter] = number;
}
System.out.print(Cupcake.Average(array));
}
}