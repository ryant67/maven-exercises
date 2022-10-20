import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Stringutil {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Something: ");
        String input = scan.nextLine();
        boolean isNumber = StringUtils.isNumeric(input);
        String swapCase = StringUtils.swapCase(input);
        String reverseString = StringUtils.reverse(input);

        System.out.println("Is a number? " + isNumber);
        System.out.println("Flipped Case: " + swapCase);
        System.out.println("Reversed: " + reverseString);
    }

}
