import java.util.ArrayList;

public class Dice {

    //set variables
    int sides;
    ArrayList<Integer> numbers = new ArrayList<>();

    //get # of sides on a die
    public int getSides() {
        return sides;
    }

    //set the # of sides on a die
    public void setSides(int sides){
        this.sides = sides;
    }

    //get the numbers on the die
    public void getnumbers(){
       for(int x = 0; x < numbers.size(); x++){
           System.out.println(numbers.get(x));
       }
    }

    //set the numbers on the die that exists
    public void setNumbers(int sides) {

        //intiailize count
        int count = 0;

        //loops through a die x and gives the sides of the die in Arraylist numbers
        //where count = index and sides is the # added
        // a d4 arraylist will be [4, 3, 2, 1]
        // a d100 arraylist will be [100, 90, 80, 70, 60, 50, 40, 30, 20, 10]
        if (sides == 4) {
            while (sides != 0) {
                numbers.add(count, sides);
                sides--;
                count++;
            }
        } else if (sides == 6) {
            while (sides != 0) {
                numbers.add(count, sides);
                sides--;
                count++;
            }
        } else if (sides == 8) {
            while (sides != 0) {
                numbers.add(count, sides);
                sides--;
                count++;
            }
        } else if (sides == 10) {
            while (sides != 0) {
                numbers.add(count, sides);
                sides--;
                count++;
            }
        }else if(sides == 12){
            while (sides != 0) {
                numbers.add(count, sides);
                sides--;
                count++;
            }
        }else if(sides == 20){
            while (sides != 0) {
                numbers.add(count, sides);
                sides--;
                count++;
            }
        }else if(sides == 100){
            while(sides != 0){
                numbers.add(count, sides);
                sides -= 10;
                count ++;
            }
        }else{
            System.out.println("Invalid Die");
            System.exit(-1);
        }
    }

    //default constructor
    Dice(){
        sides = 0;
        numbers = null;
    }

    //constructor with sides
    Dice(int sides){
        setNumbers(sides);
        this.sides = sides;
    }
}
