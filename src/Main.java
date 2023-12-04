import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Int Array
        Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

//        String Array
        String[] alphabetic = {"One", "Two", "Three", "Four", "Five", "Six", "", "Eight", "Nine", "Zero"};

        boolean play = true;
        String invalid = "Invalid Input";

//        Makes the link to the Translator class getting the value in the Arrays; numeric & alphabetic

        Translator link = new Translator(numeric, alphabetic);
        Scanner scanner = new Scanner(System.in);

//        Creates a loop so that you keep trying other input numbers
        while (play) {
            System.out.println(" ");
            System.out.println("Type 'X' To Stop Or Type 'V' To Translate Number");
            String input = scanner.nextLine();
            if (input.equals("x") | input.equals("X")) {
                play = false;
            } else if (input.equals("v") | input.equals("V")) {
                System.out.println("Type A Number Between 0 And 9");
                int number = scanner.nextInt();
                if (number<10){
                    String result = link.translate(number);
                    System.out.println("The Translation Of " + number + " = " + result);
                } else {
                    System.out.println(invalid);
                }
            }

        }
    }
}