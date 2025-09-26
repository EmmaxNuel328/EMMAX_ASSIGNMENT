public class TaskEight{
public static void main(String[] args){
int number = 0;
int sum = 0;
int num1 = 0;
int num2 = 0;
while(num1 < 4){
number++;
if(number % 4 == 0)
System.out.println((number)+(number*number)+(number*number*number)+(number*number*number*number)+(number*number*number*number*number));
if(number % 8 == 0)
System.out.println((number)+(number*number)+(number*number*number)+(number*number*number*number)+(number*number*number*number*number));

}
}
}