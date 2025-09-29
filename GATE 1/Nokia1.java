import java.util.Scanner;
public class Nokia1{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

  System.out.println("1: Phone book"); 
  System.out.println("2: Messages");
  System.out.println("3: Chat");
  System.out.println("4: Call register");
  System.out.println("5: Tones");
  System.out.println("6: Settings");
  System.out.println("7: Call divert");
  System.out.println("8: Games");
  System.out.println("9: Calculator");
  System.out.println("10 Reminders");
  System.out.println("11: Clock");
  System.out.println("12: Profiles");
  System.out.println("13: SIM services");
  System.out.print("");
  int collect1 = input.nextInt();
  switch(collect1){
  case 1-> { 
  System.out.println("1.Search");
  System.out.println("2.Service Nos.");
  System.out.println("3.Add name");
  System.out.println("4.Erase");
  System.out.println("5.Edit");
  System.out.println("6.Assign tone");
  System.out.println("7.Send b'card");
  System.out.println("8.Options");
  System.out.println("9.Speed dials");
  System.out.println("10.Voice tags");
  System.out.print("");
				int collect2 = input.nextInt();

				if(collect2 ==8){
				System.out.println("1. Type of view");
				System.out.println("2. Memory status");
					System.out.print("");
					int collect3 = input.nextInt();
					if(collect3 == 1){
					System.out.println("Type of view");
					}
					 else if(collect3 == 2){
					 System.out.println("Memory status");
					 }
					 }
					 }
						case 2-> {
						String message = """
						1. Write messages
						2. Inbox
						3. Outbox 
						4. Picture messages
						5. Templates
						6. Smileys
						7. Message settings
						8. info service
						9. Voice mailbox number
						10. Service command editor
						""";
					  System.out.print(message);
					  int messageSettings = input.nextInt();
                                           
					  if(messageSettings == 7){
			        	  System.out.println("1.Set 1");
					  System.out.println("2.Common");
					  System.out.print("");
					  messageSettings = input.nextInt();
					  if(messageSettings == 1){
System.out.println("1. Message centre number");
System.out.println("2. Messages sent as");
System.out.println("3. Message validity");
System.out.print("");
messageSettings = input.nextInt();
if(messageSettings == 1){
System.out.println("Message centre number");
}
else if(messageSettings== 2){
System.out.println("Messages sent as");
}
else if(messageSettings == 3){
System.out.println("Message validity");
}
}
else if(messageSettings == 2){
System.out.println("1. Delivery reports");
System.out.println("2. Reply via same centre");
System.out.println("3. Character support");
messageSettings = input.nextInt();
if(messageSettings == 1){
System.out.println("Delivery reports");
}
else if(messageSettings == 2){
System.out.println("Reply via same centre");
}
else if(messageSettings == 3){
System.out.println("Character support");
}
}
}
}
case 3-> {
System.out.print("Chat");
}
case 4-> {
String callRegister = """ 
1. Missed calls
2. Received calls
3. Dialled numbers
4. Erase recent call lists
5. Show all call duration
6. Show call costs
7. Call cost settings
8. Prepaid credit
""";
System.out.print(callRegister);
int collect4 = input.nextInt();
if(collect4 == 5){
String duration = """ 
1. Last call duration
2. All calls' duration
3. Received calls' duration
4. Dialled calls' duration
5. Clear timers
"""; 
System.out.println(duration);
}
else if(collect4 == 6){
String costs = """ 
1. Last call cost
2. All calls' cost
3. Clear counters
""";
System.out.println(costs);
}
else if(collect4 == 7){
String settings = """ 
1. call cost settings
2. Show costs in
""";
System.out.println(settings);
}
}
case 5-> {
String tones = """ 
1. Ringing tone
2. Ringing volume
3. Incoming call alert
4. Composer
5. Messages alert tone
6. Keypad tones
7. Warning and game tones
8. Vibrating alert
9. Screen saver
""";
System.out.println(tones);
int collect5 = input.nextInt();
}
case 6-> {
String settings = """ 
1. call settings
2. phone settings
3. Security settings
4. Restore factory settings
""";
System.out.print(settings);
int collect6 = input.nextInt();
if(collect6 == 1){
System.out.println("1. Automatic redial");
System.out.println("2. Speed dialling");
System.out.println("3. Call waiting options");
System.out.println("4. Own number sending");
System.out.println("5. Phone line in use");
System.out.println("6. Automatic");
}
else if(collect6 == 2){
System.out.println("1. Language");
System.out.println("2. Cell info display");
System.out.println("3. Welcome note");
System.out.println("4. Network selection");
System.out.println("5. Lights");
System.out.println("6. Confirm SIM service actions");
}
else if(collect6 == 3){
System.out.println("1. PIN code request");
System.out.println("2. Call barring service");
System.out.println("3. Fixed dialling");
System.out.println("4. Closed user group");
System.out.println("5. Phone security");
System.out.println("6. Change access");
}
}
case 7-> {
System.out.println("Call divert");
}
case 8-> {
System.out.println("Games");
}
case 9-> {
System.out.println("Calculator");
}
case 10->{
System.out.println("Reminders");
}
case 11->{
System.out.println("1. Alarm clock");
System.out.println("2. Clock setting");
System.out.println("3. Date setting");
System.out.println("4. Stopwatch");
System.out.println("5. Countdown timer");
System.out.println("6. Auto update of date and time ");
System.out.print("");
int clock = input.nextInt();
if(clock == 1){
System.out.println("Alarm clock");
}
else if(clock == 2){
System.out.println("Clock settings");
}
else if(clock == 3){
System.out.println("Date setting");
}
else if(clock == 4){
System.out.println(" Stopwatch");
}
else if(clock == 5){
System.out.println("Countdown timer");
}
else if(clock == 6){
System.out.println("Auto updatedate and time");
}
}
case 12->{
System.out.println("Profiles");
}
case 13->{
System.out.println("SIM services");
}
}



}
}