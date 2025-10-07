import java.util.Scanner;
public class Nokia1{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

String MainMenu = """
	MAIN MENU
1: Phone book 
2: Messages
3: Chat
4: Call register
5: Tones
6: Settings
7: Call divert
8: Games
9: Calculator
10: Reminders
11: Clock
12: Profiles
13: SIM services
""";
String search = """
	SEARCH
Search
0. Back
""";
String ServiceNos = """ 
	SERVICE NOS
Service Nos
0. Back
""";
String AddName = """
	ADD NAME
Add name
0. Back
""";
String erase = """
	ERASE
Erase
0. Back
""";
String edit = """
Edit
0. Back
""";
String AssignTone = """ 
	ASSIGN TONE
Assign tone
0. Back
""";
String SendBcard = """
	SEND B'CARD
Send b'card
0. Back
""";
String options = """
	OPTIONS
1. Type of view
2. Memory status
0. Back
""";
String SpeedDials = """
	SPEED DIALS
Speed dials
0. Back
""";
String VoiceTags = """
	VOICE TAGS
Voice tags
0. Back
""";
String messages = """
	MESSAGES
1. Write messages
2. Inbox
3. Outbox
4. Picture messages
5. Templates
6. Smileys
7. Message settings
8. Info service
9. Voice mailbox
10. Service command editor
""";
String WriteMessages = """
	WRITE MESSAGES
0. Back
""";
String inbox = """
	INBOX
inbox
0. Back
""";
String outbox = """
	OUTBOX
Outbox
0. Back
""";
String PictureMessage = """
	PICTURE MESSAGES
Picture message
0. Back
""";
String templates = """
	TEMPLATES
Templates
0. Back
""";
String smileys = """
	SMILEYS
Smiley
0. Back
""";
String Message_Settings = """
	SETTINGS
1. Set 1
2. Common
0. Back
""";
String set1 = """
	SET1
1. Message centre number
2. Message sent as
3. Message validity
0. Back
""";
String set2 = """
	COMMON
1. Delivery reports
2. Reply via same centre
3. character support
0. Back
""";
String InfoService = """
	INFO SERVICE
Info service 
0. Back
""";
String VoiceMailboxNumber = """
	VOICE MAILBOX NUMBER
Voice mailbox number
0. Back
""";
String ServiceCommandEditor = """
	SERVICE COMMAND EDITOR
Service command editor
""";
String chat = """
	CHAT
Chat
0. Back
""";

System.out.print(MainMenu);
System.out.print("");
String collect = input.next();
switch(collect){
case "1" -> {System.out.print(search);}
case "2" -> {System.out.print(ServiceNos);}
}



















}
}