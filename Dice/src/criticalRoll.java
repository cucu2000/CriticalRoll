import java.io.IOException;
import java.util.Scanner;

public class criticalRoll {

    public static void main(String [] args) throws IOException {

       //set variables
        Scanner scanner = new Scanner(System.in);
        boolean test1 = false;
        boolean test2 = false;
        String input1 = "";
        String input2 = "";

        //select critical roll type
        System.out.println("Critical Hit or Miss?");

        while(!test1) {
             input1 = scanner.nextLine();
            if(input1.equalsIgnoreCase("hit")){
                test1 = true;
            }else if(input1.equalsIgnoreCase("miss")){
                test1 = true;
            }else{
                System.out.println("Invalid Input");
                System.out.println(" ");
            }
        }

        System.out.println("Magic or Melee");

        while(!test2) {
             input2 = scanner.nextLine();
            if(input2.equalsIgnoreCase("magic")){
                test2 = true;
            }else if(input2.equalsIgnoreCase("melee")){
                test2 = true;
            }else{
                System.out.println("Invalid Input");
                System.out.println(" ");
            }
        }

        //roll a d100 and a d10
        Dice d100 = new Dice(100);
        Dice d10 = new Dice(10);

        int numberRolled = Roll.Add(d100, d10);

        //get the event from Key
        if(input1.equalsIgnoreCase("hit")){
            if(input2.equalsIgnoreCase("magic")){
               Key.returnEvent(numberRolled, "hit magic");
            }else if(input2.equalsIgnoreCase("melee")){
                Key.returnEvent(numberRolled, "hit melee");
            }
        }else if(input1.equalsIgnoreCase("miss")){
            if(input2.equalsIgnoreCase("magic")){
                Key.returnEvent(numberRolled, "miss magic");
            }else if(input2.equalsIgnoreCase("melee")){
                Key.returnEvent(numberRolled, "miss melee");
            }
        }
    }
}
