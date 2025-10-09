import java.util.Scanner;
public class PizzaWahala{
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);

String menu = """
	ORDER WHAT YOU CAN AFFORD
|``````````````````````````````````````````````````````````|
|  PIZZA TYPE       | 	NUMBER OF SLICES | PRICE PER BOX   |	
|``````````````````````````````````````````````````````````|
| SAPA              |	4		 | 2,500           |
|``````````````````````````````````````````````````````````|
| SMALL MONEY       |   6                | 2,900           |
|``````````````````````````````````````````````````````````|
|BIG BOYS           |   8                | 4,000           |
|``````````````````````````````````````````````````````````|
|ODOGWU             |   12               | 5,200           |
````````````````````````````````````````````````````````````
""";
System.out.print(menu);
System.out.print("Enter pizza type: ");
String pizzaType = input.next().toLowerCase();
switch(pizzaType){
case "sapa" -> {
System.out.print("Enter number of guest: ");
int guest = input.nextInt();
int slices = 4;
int box = guest/slices;
int price = box * 2500;

if(guest%slices != 0){
box = box + 1;
slices = slices * box;
price = box * 2500;
int remainder = slices - guest;
System.out.println("number of box(es) of pizza = " + box + " and no of remainder  = " + remainder  + " " + "It cost #" + price );
}
else{
System.out.print("number of box(es) of pizza = " + box + " " + price);
}
}
case "smallmoney" -> {
System.out.print("Enter number of guest: ");
int guest = input.nextInt();
int slices = 6;
int box = guest/slices;

int price = box * 2900;
if(guest%slices != 0){
box = box + 1;
slices = slices * box;
price = box * 2900;
int remainder = slices - guest;
System.out.println("number of box(es) of pizza = " + box + " and no of remainder  = " + remainder  + " " + "It cost #" + price );
}
else{
System.out.print("number of box(es) of pizza = " + box + " " + price);
}
}
case "bigboys" -> {
System.out.print("Enter number of guest: ");
int guest = input.nextInt();
int slices = 8;
int box = guest/slices;

int price = box * 4000;
if(guest%slices != 0){
box = box + 1;
slices = slices * box;
price = box * 4000;
int remainder = slices - guest;
System.out.println("number of box(es) of pizza = " + box + " and no of remainder  = " + remainder  + " " + "It cost #" + price );
}
else{
System.out.print("number of box(es) of pizza = " + box + " " + price);
}
}

case "odogwu" -> {
System.out.print("Enter number of guest: ");
int guest = input.nextInt();
int slices = 12;
int box = guest/slices;

int price = box * 5200;
if(guest%slices != 0){
box = box + 1;
slices = slices * box;
price = box * 5200;
int remainder = slices - guest;
System.out.println("number of box(es) of pizza = " + box + " and no of remainder  = " + remainder  + " " + "It cost #" + price );
}
else{
System.out.print("number of box(es) of pizza = " + box + " " + price);
}
}


}



}
}