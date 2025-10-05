import java.util.Scanner;
public class Even{
public static void main(String... args){
Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = input.nextInt();
System.out.print(Kata.isEven(number));
}
}