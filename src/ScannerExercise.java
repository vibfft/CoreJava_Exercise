import java.util.Scanner;

public class ScannerExercise extends Exercise {

    ExType type;
    ExLevel level;

    public ScannerExercise() {
        type = ExType.LOOP;
        level = ExLevel.EASY;
    }

    private int formulateEvaluate(int number) {
        return (((number + 1) * number + 2) * number + 3);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ScannerExercise o = new ScannerExercise();
        System.out.println(o.toString(o.type, o.level));

        System.out.println(o.formulateEvaluate(s.nextInt()));
    }
}
