import java.util.Scanner;
public class EO{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
// Collect a number from a user,Then save it a variable.
System.out.print("Enter a Number");
int num = input.nextInt();
//check if number is even,Display even.
if(num%2 ==0){
System.out.println("Even");
}
//check if number is odd,display Odd.
if(num%2==1){
System.out.println("Odd");
}

}
}