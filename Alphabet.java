import java.util.Scanner;
public class Alphabet{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter a letter");
char letter = input.next().charAt(0);
if(letter == 'A' || letter == 'E' || letter  == 'I' || letter == 'O' || letter == 'U' letter == 'a' || letter == 'e' || letter == 'i' || letter == 'i' || letter  == 'o' || letter == 'u'){
System.out.print("Vowel");

}
 else if(letter >='A' && letter <= 'Z' || letter >= 'a' && letter <= 'z'){
	System.out.print("Consonant");

}
else{
	System.out.print("Invalid");
}



}
}