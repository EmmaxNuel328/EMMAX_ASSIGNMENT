import java.util.Scanner;
public class Age{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter your Age");
int age = input.nextInt();
if(age>=0 && age<=12){
System.out.println("child");
}
if(age>=13 && age<=19){
System.out.println("teen");
}
if(age>=20 && age<=59){
System.out.println("adult");
}
if(age>=60){
System.out.println("senior");
}

}
}