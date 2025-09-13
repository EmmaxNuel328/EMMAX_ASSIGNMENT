import java.util.Scanner;
public class GradeLetter{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter Grade letter:");
char grade = input.next().charAt(0);
if(grade == 'A'){
System.out.println("Pass");
}
if(grade == 'B'){
System.out.println("Pass");
}
if(grade =='C'){
System.out.println("Pass");
}
if(grade == 'D'){
System.out.println("Pass");
}
if(grade == 'E'){
System.out.println("Fail");
}
if(grade == 'F'){
System.out.println("Fail");
}

}
}