import java.util.Random;

public class Roll{

    //set variables
    Random random = new Random();
    int numberRolled;

    //roll a given dice
    public Roll(Dice dice){
        numberRolled = dice.numbers.get(random.nextInt(dice.numbers.size()));
        System.out.println(numberRolled);
    }

    //roll 2 given dice and add the results
    public static int Add(Dice dice1, Dice dice2) {
        Roll roll1 = new Roll(dice1);
        Roll roll2 = new Roll(dice2);

        //check for a 100 rolled on a d100 and a 10 on a d10
        if (roll1.numberRolled == 10 && roll2.numberRolled == 100 && dice1.getSides() == 10 && dice2.getSides() == 100) {
            return 100;
        } else if (roll2.numberRolled == 10 && roll1.numberRolled == 100 && dice2.getSides() == 10 && dice1.getSides() == 100){
            return 100;
        }else{
            return roll1.numberRolled + roll2.numberRolled;
        }
    }
}

