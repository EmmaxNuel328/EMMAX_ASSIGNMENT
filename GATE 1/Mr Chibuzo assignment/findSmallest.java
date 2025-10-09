import java.util.Scanner;
public class findSmallest{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int [] array = new int[5];
int collect = 0;
int index = 1;
while( index < array.length){
System.out.print("Enter a number: ");
collect = input.nextInt();
array[index] = collect;
}
System.out.print(Kata.findSmallest(array[index]))
}

}