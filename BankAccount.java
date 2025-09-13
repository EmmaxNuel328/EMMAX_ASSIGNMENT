import java.util.Scanner;
public class BankAccount{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter back account balance:");
int balance = input.nextInt();
if(balance <100){
System.out.println("Low");
}
if(balance >=100 && balance <= 1000){
System.out.println("Medium");
}
if(balance >1000){
System.out.println("High");
}
}
}