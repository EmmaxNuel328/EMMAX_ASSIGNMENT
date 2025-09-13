import java.util.Scanner;
public class Hour{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter of Hours worked:");
int hour = input.nextInt();
System.out.print("Enter hourly rate:");
int rate = input.nextInt();
int totalpay = hour*rate;
System.out.println("total pay:"+ totalpay);
}
}