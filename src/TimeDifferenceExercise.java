import java.util.Scanner;

public class TimeDifferenceExercise extends Exercise {

    ExType type;
    ExLevel level;

    TimeDifferenceExercise() {
        type = ExType.LOOP;
        level = ExLevel.EASY;
    }


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        TimeDifferenceExercise o = new TimeDifferenceExercise();
        System.out.println(o.toString(o.type, o.level));

        System.out.println("The program gets the input of six integers: " +
                "three defining the first moment of time in hours, minutes, " +
                "seconds, and the other three defining the second one.");
        System.out.println("Please enter six integers: ");

        String[] stringArray = new String [s.nextInt()];

        s.nextLine();
        for(int i = 0; i < stringArray.length; i++) {
            stringArray[i] = s.nextLine();
        }

        System.out.println("\nYou have entered: ");
        for(String str: stringArray) {
            System.out.println(str);
        }
    }
}
