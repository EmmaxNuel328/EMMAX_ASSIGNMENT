import java.util.Scanner;
public class Temperature{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter Temperature in Celsius");
int temp = input.nextInt();
if(temp<0){
System.out.println("Freezing");
}
if(temp>=0 && temp <= 15){
System.out.println("Cold");
}
if(temp>=16 && temp >= 25){
System.out.println("warm");
}
if(temp>25){
System.out.println("Hot");
}

}
}