import java.util.Scanner;
public class Largest{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter first number");
int first = input.nextInt();
System.out.print("Enter second number");
int second = input.nextInt();
System.out.print("Enter third number");
int third = input.nextInt();

int largest = first;
if(second > first){
  largest = second;
}
if(third > first){
 largest = third;
}
System.out.println("Largest number is " +largest);



}
}
