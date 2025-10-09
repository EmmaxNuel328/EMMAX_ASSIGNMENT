public class Cupcake{
	public static int findSmallest(int[] integer){
		int smallest = integer[0];
		
		for (int index = 0; index < integer.length;index++ ){
			if(integer[index] < smallest){
				smallest = integer[index];
		}
		}
return smallest;
}

public static  double Average(int[] number){
	int integer = number.length-1;
	int add = 0; 

	while(integer >= 0){
		add += number[integer];
		integer--;
}
double average = add/ number.length;

return average;

}
public static int CountOccurence(int number[], int number1){
	//number1  = number;
	int add  = 0;

	for (int index = 0; index < number.length; index++){
		if(number1 == number[index]){
			add += 1;
}
}
return add;
}


}