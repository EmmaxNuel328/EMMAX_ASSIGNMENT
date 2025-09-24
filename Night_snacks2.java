/*
collect three inputs from a user
save them in a variable respectively
then assign a variable to "Average" and store  the addition of all three inputs then divide  by 3 
using selection statement check if average is greater than or equal to 90 and less or equal 100 and print A
if false check if average  is greater or equal to 80 and less 90 and print B
if false check if average  is greater or equal to 70 and less 80 and print
C
if false check if average  is greater or equal to 60 and less 70 and print 
D
if false check if average  is greater or equal to 0 and less 60 and print E
*/
import java.util.Scanner;
public class Night_snacks2{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter First Score: ");
int first = input.nextInt();
System.out.print("Enter Second Score: ");
int second = input.nextInt();
System.out.print("Enter Third Score: ");
int third = input.nextInt();
int average = (first + second + third)/3;

if(average >= 90 && average <= 100){
System.out.print("Average: A"  + average);
}
if(average >= 80 && average < 90){
System.out.print("Average: B"  + average);
}
if(average >= 70 && average < 80){
System.out.print("Average: C"  + average);
}
if(average >= 60 && average < 70){
System.out.print("Average: D"  + average);
}
if(average >= 0 && average < 60){
System.out.print("Average: E"  + average);
if(average > 100 && average < 0){
System.out.print("Invalid score, You can't scam me");
}
}
}
}