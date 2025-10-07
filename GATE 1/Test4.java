import java.util.Scanner;
public class Test4{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter a year");
int year = input.nextInt();
System.out.print(Kata.isLeapYear(year));
}
}