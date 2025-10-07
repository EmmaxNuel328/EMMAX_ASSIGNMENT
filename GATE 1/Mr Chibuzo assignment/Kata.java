public class Kata{
public static boolean isEven(int number){
int numbers = number;
if(numbers % 2 == 0){
return true;
}
else{
return false;
}
}
public static int Subtract(int numbers,int integers){
int number1 = numbers;
int number2 = integers;
int number3 = -1;
if(number1 >= number2){
return number3*(number1-number2);
}
else{
return number3*(number1-number2);
}
}
public static float Divide(int number, int numbers){
float first = number;
float second = numbers;
if(second == 0){
return 0;
}
else{
return first/second;
}
}
public static int Factor(int number){
int one = number;
int count = 1;
int sum = 0;
for(count = 1;count <= one ;count++){
if(one%count==0){
sum = sum + 1;
}
}
return sum;
}
public static int SquareOf(int number1){
int integer = number1;
return integer*integer;
}
public static boolean isSquare(int square){
int integers = square;
int count = 1;
int sum = 0;
	for(count = 1;count <= integers ;count++){
	if(integers%count==0)
	sum = sum + 1;
	}

if(sum%2!=0)
return true;
else
return false;



}  
}
