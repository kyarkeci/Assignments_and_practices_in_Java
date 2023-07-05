import java.util.Scanner;

public class LearningMethods {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        start();


    }
    public static void menu(){
        String menu = "\u0001 List of menu functions\n" +
                "1. Phone book\n" +
                "2. Messages\n" +
                "3. Chat\n" +
                "4. Call register\n" +
                "5. Tones\n" +
                "6. Settings\n" +
                "7. Call divert\n" +
                "8. Games\n" +
                "9. Calculator\n" +
                "10.Reminders\n" +
                "11.Clock\n" +
                "12.Profiles\n" +
                "13.SIM services\n" +
                " Press 0 to exit";
        System.out.println(menu);
        System.out.println(":::");
        int number = scanner.nextInt();
        switch (number){
            case 0:
                //System.exit(0);
                System.out.println("Good bye!!!");
                break;
            case 1:
                printPhoneBookMenu();
                break;
            case 2:
                messages();
                break;
            default:
                System.out.println("invalid selection");
                menu();
                break;
            case 3:
                System.out.println("Chat");
                System.out.println(":::");
                scanner.nextInt();
                menu();
                break;
            case 4:
                callRegister();
                break;
            case 5:
                tones();
                break;
            case 6:
                settings();
                break;
            case 7:
                System.out.println("Call divert");
                System.out.println(":::");
                scanner.nextInt();
                menu();
                break;
            case 8:
                System.out.println("Games");
                System.out.println(":::");
                scanner.nextInt();
                menu();
                break;
            case 9:
                System.out.println("Calculator");
                System.out.println(":::");
                scanner.nextInt();
                menu();
                break;
            case 10:
                System.out.println("Reminders");
                System.out.println(":::");
                scanner.nextInt();
                menu();
                break;
            case 11:
                clock();
            case 12:
                System.out.println("Profiles");
                System.out.println(":::");
                scanner.nextInt();
                menu();
                break;
            case 13:
                System.out.println("SIM services");
                System.out.println(":::");
                scanner.nextInt();
                menu();
                break;

        }

    }
    public static void printPhoneBookMenu(){
        System.out.println(
                "1. Phone book\n" +
                "   1. Search\n" +
                "   2. Service Nos. 1\n" +
                "   3. Add name\n" +
                "   4. Erase\n" +
                "   5. Edit\n" +
                "   6. Assign tone\n" +
                "   7. Send b’card\n" +
                "   8. Options\n" +
                "   9. Speed dials\n" +
                "   10. Voice tags\n" +
                "   press 0 to go back "  );
        String[] phoneBook = {"1. Search","2. Service Nos.","3. Add name","4. Erase","5. Edit","6. Assign tone","7. Send b’card"," 8. Options\n\t1. Type of view\n\t2.Memory status",
                "9. Speed dials","10. Voice tags"};
        System.out.println(":::");
        int number = scanner.nextInt();
        switch (number){
            case 0:
                menu();
                break;
            case 1:
                System.out.println(phoneBook[0]);
                System.out.println(":::");
                scanner.nextInt();
                printPhoneBookMenu();
                break;
            case 2:
                System.out.println(phoneBook[1]);
                System.out.println(":::");
                scanner.nextInt();
                printPhoneBookMenu();
                break;
            case 3:
                System.out.println(phoneBook[2]);
                System.out.println(":::");
                scanner.nextInt();
                printPhoneBookMenu();
                break;
            case 4:
                System.out.println(phoneBook[3]);
                System.out.println(":::");
                scanner.nextInt();
                printPhoneBookMenu();
                break;
            case 5:
                System.out.println(phoneBook[4]);
                System.out.println(":::");
                scanner.nextInt();
                printPhoneBookMenu();
                break;
            case 6:
                System.out.println(phoneBook[5]);
                System.out.println(":::");
                scanner.nextInt();
                printPhoneBookMenu();
                break;
            case 7:
                System.out.println(phoneBook[6]);
                System.out.println(":::");
                scanner.nextInt();
                printPhoneBookMenu();
                break;
            case 8:
               phoneBook8();
                break;
            case 9:
                System.out.println(phoneBook[8]);
                System.out.println(":::");
                scanner.nextInt();
                printPhoneBookMenu();
                break;
            case 10:
                System.out.println(phoneBook[9]);
                System.out.println(":::");
                scanner.nextInt();
                printPhoneBookMenu();
                break;
            default:
                System.out.println("invalid option");
                printPhoneBookMenu();
                break;
        }




    }
    public static void phoneBook8(){
        System.out.println("8. Options\n\t1. Type of view\n\t2.Memory status");
        System.out.println(":::");
        int number = scanner.nextInt();
        String[] phoneBook8= {"1. Type of view","2. Memory status"};
        if (number == 1){
            System.out.println(phoneBook8[0]);
            System.out.println(":::");
            scanner.nextInt();
            phoneBook8();
        }
        if (number == 2){
            System.out.println(phoneBook8[1]);
            System.out.println(":::");
            scanner.nextInt();
            phoneBook8();
        }
        if (number == 0){
            printPhoneBookMenu();
        }
        if (number != 0 && number!=1&& number!=2){
            System.out.println("invalid option");
            phoneBook8();
        }
    }

    public static void messages(){
        System.out.println(
                "2. Messages\n" +
                        "   1. Write messages\n" +
                        "   2. Inbox\n" +
                        "   3. Outbox\n" +
                        "   4. Picture messages\n" +
                        "   5. Templates\n" +
                        "   6. Smileys\n" +
                        "   7. Message settings\n" +
                        "   8. Info service\n" +
                        "   9. Voice mailbox number\n" +
                        "   10.Service command editor");



        String[] messages = {"1. Write messages","2. Inbox","3. Outbox","4. Picture messages","5. Templates","6. Smileys",
                " 7. Message settings\n\t1. Set \n\t\t1. Message centre number\n\t\t2. Messages sent as\n\t\t3.Message validity\n\t2. Common\n\t\t1. Delivery reports\n\t\t2. Reply via same centre\n\t\t3. Character support",
                " 8. Info service","9. Speed dials","10. Voice tags"};
        System.out.println(":::");
        int number = scanner.nextInt();
        switch (number){
            case 0:
                menu();
                break;
            case 1:
                System.out.println(messages[0]);
                System.out.println(":::");
                scanner.nextInt();
                messages();
                break;
            case 2:
                System.out.println(messages[1]);
                System.out.println(":::");
                scanner.nextInt();
                messages();
                break;
            case 3:
                System.out.println(messages[2]);
                System.out.println(":::");
                scanner.nextInt();
                messages();
                break;
            case 4:
                System.out.println(messages[3]);
                System.out.println(":::");
                scanner.nextInt();
                messages();
                break;
            case 5:
                System.out.println(messages[4]);
                System.out.println(":::");
                scanner.nextInt();
                messages();
                break;
            case 6:
                System.out.println(messages[5]);
                System.out.println(":::");
                scanner.nextInt();
                messages();
                break;
            case 7:
                message7();
                break;
            case 8:
                System.out.println(messages[7]);
                System.out.println(":::");
                scanner.nextInt();
                messages();
                break;
            case 9:
                System.out.println(messages[8]);
                System.out.println(":::");
                scanner.nextInt();
                messages();
                break;
            case 10:
                System.out.println(messages[9]);
                System.out.println(":::");
                scanner.nextInt();
                messages();
                break;
            default:
                System.out.println("invalid option");
                messages();
                break;
        }


    }

    public static void message7(){
        System.out.println("Message settings\n\t1. Set \n\t\t1. Message centre number\n\t\t2. Messages sent as\n\t\t3.Message validity\n\t2. Common\n\t\t1. Delivery reports\n\t\t2. Reply via same centre\n\t\t3. Character support");
        System.out.println(":::");
        int number = scanner.nextInt();
        String[] message7= {"1. Set \n\t1. Message centre number\n\t2. Messages sent as\n\t3.Message validity","2. Common\n\t1. Delivery reports\n\t2. Reply via same centre\n\t3. Character support",};
        if (number == 1){
            message7i();
        }
        if (number == 2){
            message7ii();
        }
        if (number == 0){
            messages();
        }
        if (number != 0 && number!=1&& number!=2){
            System.out.println("invalid option");
            message7();
        }
    }

    public static void message7i(){
        System.out.println("1. Set \n\t1. Message centre number\n\t2. Messages sent as\n\t3.Message validity");
        String[] message7i = {"1. Message centre number","2. Messages sent as","3.Message validity"};
        System.out.println(":::");
        int number = scanner.nextInt();
        if (number == 1){
            System.out.println(message7i[0]);
            System.out.println(":::");
            scanner.nextInt();
            message7i();
        }
        if (number == 2){
            System.out.println(message7i[1]);
            System.out.println(":::");
            scanner.nextInt();
            message7i();
        }

        if (number == 3){
            System.out.println(message7i[2]);
            System.out.println(":::");
            scanner.nextInt();
            message7i();
        }
        if (number == 0){
            message7();
        }
        if (number != 0 && number!=1 && number!=2 && number!=3){
            System.out.println("invalid option");
            message7i();
        }

    }

    public static void message7ii(){
        System.out.println("2. Common\n\t1. Delivery reports\n\t2. Reply via same centre\n\t3. Character support");
        String[] message7ii = {"1. Delivery reports","2. Reply via same centre","3.Character support"};
        System.out.println(":::");
        int number = scanner.nextInt();
        if (number == 1){
            System.out.println(message7ii[0]);
            System.out.println(":::");
            scanner.nextInt();
            message7ii();
        }
        if (number == 2){
            System.out.println(message7ii[1]);
            System.out.println(":::");
            scanner.nextInt();
            message7ii();
        }

        if (number == 3){
            System.out.println(message7ii[2]);
            System.out.println(":::");
            scanner.nextInt();
            message7ii();
        }
        if (number == 0){
            message7();
        }
        if (number != 0 && number!=1 && number!=2 && number!=3){
            System.out.println("invalid option");
            message7ii();
        }

    }

    public static void callRegister() {
        System.out.println("4. Call register\n" +
                "1. Missed calls\n" +
                "2. Received calls\n" +
                "3. Dialled numbers\n" +
                "4. Erase recent call lists\n" +
                "5. Show call duration\n" +
                "6. Show call costs\n" +
                "7. Call cost settings\n" +
                "8. Prepaid credit");

        String[] callRegister = {"1. Missed calls", "2. Received calls", "3. Dialled numbers",
                "4. Erase recent call lists",
                "5. Show call duration \n\t1. Last call duration  \n\t2. All calls’ duration  \n\t3. Received calls’ duration  \n\t4. Dialled calls’ duration  \n\t5. Clear timers",
                "6. Smileys  \n\t1. Last call cost  \n\t2. All calls’ cost  \n\t3. Clear counters",
                "7. Call cost settings  \n\t1. Call cost limit  \n\t2. Show costs in",
                "8. Prepaid credit"};
        System.out.println(":::");
        int number = scanner.nextInt();
        switch (number) {
            case 0:
                menu();
                break;
            case 1:
                System.out.println(callRegister[0]);
                System.out.println(":::");
                scanner.nextInt();
                callRegister();
                break;
            case 2:
                System.out.println(callRegister[1]);
                System.out.println(":::");
                scanner.nextInt();
                callRegister();
                break;
            case 3:
                System.out.println(callRegister[2]);
                System.out.println(":::");
                scanner.nextInt();
                callRegister();
                break;
            case 4:
                System.out.println(callRegister[3]);
                System.out.println(":::");
                scanner.nextInt();
                callRegister();
                break;
            case 5:
                callRegister5();
                break;
            case 6:
                callRegister6();
                break;
            case 7:
                callRegister7();
                break;
            case 8:
                System.out.println(callRegister[7]);
                System.out.println(":::");
                scanner.nextInt();
                callRegister();
                break;
            default:
                System.out.println("invalid option");
                callRegister();
                break;
        }

    }

    public static void callRegister5(){
        System.out.println("5. Show call duration\n" +
                "   1. Last call duration\n" +
                "   2. All calls’ duration\n" +
                "   3. Received calls’ duration\n" +
                "   4. Dialled calls’ duration\n" +
                "   5. Clear timers\n");
        System.out.println(":::");
        int number = scanner.nextInt();
        String[] callRegister5= {"1. Last call duration","2. All calls’ duration","3. Received calls’ duration","4. Dialled calls’ duration","5. Clear timers"};
        if (number == 1){
            System.out.println(callRegister5[0]);
            System.out.println(":::");
            scanner.nextInt();
            callRegister5();
        }
        if (number == 2){
            System.out.println(callRegister5[1]);
            System.out.println(":::");
            scanner.nextInt();
            callRegister5();
        }
        if (number == 3){
            System.out.println(callRegister5[2]);
            System.out.println(":::");
            scanner.nextInt();
            callRegister5();
        }
        if (number == 4){
            System.out.println(callRegister5[3]);
            System.out.println(":::");
            scanner.nextInt();
            callRegister5();
        }
        if (number == 5){
            System.out.println(callRegister5[4]);
            System.out.println(":::");
            scanner.nextInt();
            callRegister5();
        }
        if (number == 0){
            callRegister();
        }
        if (number < 0 || number > 5){
            System.out.println("invalid option");
            callRegister5();
        }

    }

    public static void callRegister6(){
        System.out.println("6. Show call costs\n" +
                "   1. Last call cost\n" +
                "   2. All calls’ cost\n" +
                "   3. Clear counters\n" );
        System.out.println(":::");
        int number = scanner.nextInt();
        String[] callRegister6= {"1. Last call cost","2. All calls’ cost","3. Clear counters"};
        if (number == 1){
            System.out.println(callRegister6[0]);
            System.out.println(":::");
            scanner.nextInt();
            callRegister6();
        }
        if (number == 2){
            System.out.println(callRegister6[1]);
            System.out.println(":::");
            scanner.nextInt();
            callRegister6();
        }
        if (number == 3){
            System.out.println(callRegister6[2]);
            System.out.println(":::");
            scanner.nextInt();
            callRegister6();
        }

        if (number == 0){
            callRegister();
        }
        if (number < 0 || number > 3){
            System.out.println("invalid option");
            callRegister6();
        }

    }
    public static void callRegister7(){
        System.out.println("7. Call cost settings" +
                "                    \n\t 1. Call cost limit" +
                "                    \n\t 2. Show costs " );
        System.out.println(":::");
        int number = scanner.nextInt();
        String[] callRegister7= {"1. 1. Call cost limit","2. Show costs in"};
        if (number == 1){
            System.out.println(callRegister7[0]);
            System.out.println(":::");
            scanner.nextInt();
            callRegister7();
        }
        if (number == 2){
            System.out.println(callRegister7[1]);
            System.out.println(":::");
            scanner.nextInt();
            callRegister7();
        }

        if (number == 0){
            callRegister();
        }
        if (number < 0 || number > 2){
            System.out.println("invalid option");
            callRegister7();
        }

    }

    public static void tones(){
        System.out.println("5. Tones\n" +
                "1. Ringing tone\n" +
                "2. Ringing volume\n" +
                "3. Incoming call alert\n" +
                "4. Composer\n" +
                "5. Message alert tone\n" +
                "6. Keypad tones\n" +
                "7. Warning and game tones\n" +
                "8. Vibrating alert\n" +
                "9. Screen saver");

        String[] tones = {"1. Ringing tone","2. Ringing volume","3. Incoming call alert","4. Composer"
                ,"5. Message alert tone","6. Keypad tones","7. Warning and game tones"," 8. Vibrating alert",
                "9. Screen saver"};
        System.out.println(":::");
        int number = scanner.nextInt();
        switch (number){
            case 0:
                menu();
                break;
            case 1:
                System.out.println(tones[0]);
                System.out.println(":::");
                scanner.nextInt();
                tones();
                break;
            case 2:
                System.out.println(tones[1]);
                System.out.println(":::");
                scanner.nextInt();
                tones();
                break;
            case 3:
                System.out.println(tones[2]);
                System.out.println(":::");
                scanner.nextInt();
                tones();
                break;
            case 4:
                System.out.println(tones[3]);
                System.out.println(":::");
                scanner.nextInt();
                tones();
                break;
            case 5:
                System.out.println(tones[4]);
                System.out.println(":::");
                scanner.nextInt();
                tones();
                break;
            case 6:
                System.out.println(tones[5]);
                System.out.println(":::");
                scanner.nextInt();
                tones();
                break;
            case 7:
                System.out.println(tones[6]);
                System.out.println(":::");
                scanner.nextInt();
                tones();
                break;
            case 8:
                System.out.println(tones[7]);
                System.out.println(":::");
                scanner.nextInt();
                tones();
                break;
            case 9:
                System.out.println(tones[8]);
                System.out.println(":::");
                scanner.nextInt();
                tones();
                break;

            default:
                System.out.println("invalid option");
                tones();
                break;
        }

    }

    public static void settings(){
        System.out.println("6. Settings\n" +
                "1. Call settings\n" +
                "2. Phone settings\n" +
                "3. Security settings\n" +
                "4. Restore factory settings");

        String[] settings = {"1. Call setting \n\t1. Automatic redial \n\t2. Speed dialling \n\t3. Call waiting options " +
                "\n\t4. Own number sending \n\t5. Phone line in use   \n\t6. Automatic answer 1",
                "2. Phone settings\\n\" +\n" +
                        "                     1. Language" +
                        "                     2. Cell info display" +
                        "                     3. Welcome note" +
                        "                     4. Network selection" +
                        "                     5. Lights" +
                        "                     6. Confirm SIM service actions",
                "3. Security setting" +
                        "                     1. PIN code request" +
                        "                     2. Call barring service" +
                        "                     3. Fixed dialling" +
                        "                     4. Closed user group" +
                        "                     5. Phone security" +
                        "                     6. Change access codes",
                "4. Restore factory settings"};
        System.out.println(":::");
        int number = scanner.nextInt();
        switch (number) {
            case 0:
                menu();
                break;
            case 1:
                settings1();
                break;
            case 2:
                settings2();
                break;
            case 3:
               settings3();
                break;
            case 4:
                System.out.println(settings[3]);
                System.out.println(":::");
                scanner.nextInt();
                settings();
                break;
            default:
                System.out.println("invalid option");
                settings();
                break;
        }

    }

    public static void settings1(){
        System.out.println("1. Call settings" +
                "                  \n\t 1. Automatic redial" +
                "                  \n\t 2. Speed dialling" +
                "                  \n\t 3. Call waiting options" +
                "                  \n\t 4. Own number sending" +
                "                  \n\t 5. Phone line in use" +
                "                  \n\t 6. Automatic answer ");
        System.out.println(":::");
        int number = scanner.nextInt();
        String[] settings1= {"1. Automatic redial","2. Speed dialling","3. Call waiting options","4. Own number sending","5. Phone line in use","6. Automatic answer"};
        if (number == 1){
            System.out.println(settings1[0]);
            System.out.println(":::");
            scanner.nextInt();
            settings1();
        }
        if (number == 2){
            System.out.println(settings1[1]);
            System.out.println(":::");
            scanner.nextInt();
            settings1();
        }
        if (number == 3){
            System.out.println(settings1[2]);
            System.out.println(":::");
            scanner.nextInt();
            settings1();
        }
        if (number == 4){
            System.out.println(settings1[3]);
            System.out.println(":::");
            scanner.nextInt();
            settings1();
        }
        if (number == 5){
            System.out.println(settings1[4]);
            System.out.println(":::");
            scanner.nextInt();
            settings1();
        }
        if (number == 6){
            System.out.println(settings1[5]);
            System.out.println(":::");
            scanner.nextInt();
            settings1();
        }
        if (number == 0){
            settings();
        }
        if (number < 0 || number > 6){
            System.out.println("invalid option");
            settings1();
        }

    }

    public static void settings2(){
        System.out.println("2. Phone settings" +
                "                    \n\t 1. Language" +
                "                    \n\t 2. Cell info display" +
                "                    \n\t 3. Welcome note" +
                "                    \n\t 4. Network selection" +
                "                    \n\t 5. Lights" +
                "                    \n\t 6. Confirm SIM service actions");
        System.out.println(":::");
        int number = scanner.nextInt();
        String[] settings2= {"1. Language","2. Cell info display","3. Welcome note","4. Network selection","5. Lights 2","6. Confirm SIM service actions"};
        if (number == 1){
            System.out.println(settings2[0]);
            System.out.println(":::");
            scanner.nextInt();
            settings2();
        }
        if (number == 2){
            System.out.println(settings2[1]);
            System.out.println(":::");
            scanner.nextInt();
            settings2();
        }
        if (number == 3){
            System.out.println(settings2[2]);
            System.out.println(":::");
            scanner.nextInt();
            settings2();
        }
        if (number == 4){
            System.out.println(settings2[3]);
            System.out.println(":::");
            scanner.nextInt();
            settings2();
        }
        if (number == 5){
            System.out.println(settings2[4]);
            System.out.println(":::");
            scanner.nextInt();
            settings2();
        }
        if (number == 6){
            System.out.println(settings2[5]);
            System.out.println(":::");
            scanner.nextInt();
            settings2();
        }
        if (number == 0){
            settings();
        }
        if (number < 0 || number > 6){
            System.out.println("invalid option");
            settings2();
        }

    }

    public static void settings3(){
        System.out.println("3. Security settings" +
                "                    \n\t 1. PIN code request" +
                "                    \n\t 2. Call barring service" +
                "                    \n\t 3. Fixed dialling" +
                "                    \n\t 4. Closed user group" +
                "                    \n\t 5. Phone security" +
                "                    \n\t 6. Change access codes");
        System.out.println(":::");
        int number = scanner.nextInt();
        String[] settings3= {"1. PIN code request","2. Call barring service","3. Fixed dialling","4. Closed user group","5. Phone security","6. Change access codes"};
        if (number == 1){
            System.out.println(settings3[0]);
            System.out.println(":::");
            scanner.nextInt();
            settings3();
        }
        if (number == 2){
            System.out.println(settings3[1]);
            System.out.println(":::");
            scanner.nextInt();
            settings3();
        }
        if (number == 3){
            System.out.println(settings3[2]);
            System.out.println(":::");
            scanner.nextInt();
            settings3();
        }
        if (number == 4){
            System.out.println(settings3[3]);
            System.out.println(":::");
            scanner.nextInt();
            settings3();
        }
        if (number == 5){
            System.out.println(settings3[4]);
            System.out.println(":::");
            scanner.nextInt();
            settings3();
        }
        if (number == 6){
            System.out.println(settings3[5]);
            System.out.println(":::");
            scanner.nextInt();
            settings3();
        }
        if (number == 0){
            settings();
        }
        if (number < 0 || number > 6){
            System.out.println("invalid option");
            settings3();
        }

    }

    public static void clock(){
        System.out.println("11. Clock\n" +
                "1. Alarm clock\n" +
                "2. Clock settings\n" +
                "3. Date setting\n" +
                "4. Stopwatch\n" +
                "5. Countdown timer\n" +
                "6. Auto update of date and time");

        String[] clock = {"1. Alarm clock","2. Clock settings","3. Date setting","4. Stopwatch",
                "5. Countdown timer","6. Auto update of date and time"};
        System.out.println(":::");
        int number = scanner.nextInt();
        switch (number){
            case 0:
                menu();
                break;
            case 1:
                System.out.println(clock[0]);
                System.out.println(":::");
                scanner.nextInt();
                clock();
                break;
            case 2:
                System.out.println(clock[1]);
                System.out.println(":::");
                scanner.nextInt();
                clock();
                break;
            case 3:
                System.out.println(clock[2]);
                System.out.println(":::");
                scanner.nextInt();
                clock();
                break;
            case 4:
                System.out.println(clock[3]);
                System.out.println(":::");
                scanner.nextInt();
                clock();
                break;
            case 5:
                System.out.println(clock[4]);
                System.out.println(":::");
                scanner.nextInt();
                clock();
                break;
            case 6:
                System.out.println(clock[5]);
                System.out.println(":::");
                scanner.nextInt();
                clock();
                break;


            default:
                System.out.println("invalid option");
                clock();
                break;
        }

    }

    public static void start(){
        System.out.println("welcome!!!");
        System.out.println("press 0 for Menu");
        System.out.print(":::");
        int number = scanner.nextInt();
        if (number == 0){
            menu();
        }
        else {
            System.out.println("invalid selection");
            error();
        }

    }
    public static void error(){
        System.out.println("press 0 for Menu");
        System.out.print(":::");
        int number = scanner.nextInt();
        if (number == 0){
            menu();
        }
        else {
            System.out.println("invalid selection");
            error();
        }

    }

}
