package com.vibfft;

import java.util.Scanner;
import java.util.StringTokenizer;
import static java.lang.Long.parseLong;

public class SwitchExercise extends Exercise {

    ExType type;
    ExLevel level;

    SwitchExercise() {
        type = ExType.SWITCH;
        level = ExLevel.MEDIUM;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in).useDelimiter(" ");
        SwitchExercise o = new SwitchExercise();
        o.println(o.toString(o.type, o.level));

        String inputCalculate = s.nextLine();
        StringTokenizer st = new StringTokenizer(inputCalculate);

        long firstOperand = 0L;
        long secondOperand = 0L;
        String operator = "";
        while (st.hasMoreTokens()) {
            if (st.countTokens() == 3) {
                firstOperand = parseLong(st.nextToken().trim());
            } else if (st.countTokens() == 2) {
                operator = st.nextToken().trim();
            } else {
                secondOperand = parseLong(st.nextToken().trim());
            }
        }

//        String action = operator;
//        if (operator.equals("/") && (secondOperand == 0)) {
//            o.println("Divide by zero!");
//        } else {
//            switch (action) {
//                case "+" -> System.out.println(firstOperand + secondOperand);
//                case "-" -> System.out.println(firstOperand - secondOperand);
//                case "/" -> System.out.println(firstOperand / secondOperand);
//                case "*" -> System.out.println(firstOperand * secondOperand);
//                default -> System.out.println("Unknown operator!");
//            }
//        }
    }
}

//        int action = s.nextInt();
//        switch (action) {
//            case 1 -> System.out.println("move up");
//            case 2 -> System.out.println("move down");
//            case 3 -> System.out.println("move left");
//            case 4 -> System.out.println("move right");
//            case 0 -> System.out.println("do not move");
//            default -> System.out.println("error!");
//        }
//        int action = s.nextInt();
//        switch (action) {
//            case 1 -> System.out.println("You have chosen a square");
//            case 2 -> System.out.println("You have chosen a circle");
//            case 3 -> System.out.println("You have chosen a triangle");
//            case 4 -> System.out.println("You have chosen a rhombus");
//            default -> System.out.println("There is no such shape!");
//        }
//        String action = s.next();
//        switch (action) {
//            case "gryffindor" -> o.println("bravery");
//            case "hufflepuff" -> o.println("loyalty");
//            case "slytherin" -> o.println("cunning");
//            case "ravenclaw" -> o.println("intellect");
//            default -> o.println("not a valid house");
//        }
//    }
//}
