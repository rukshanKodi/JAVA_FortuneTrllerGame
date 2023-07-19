import java.util.Scanner;

public class NumberInput {
    private Scanner input = new Scanner(System.in);

    /////////////////////////////
    public int validateNumber(String prompt) {
        int value = 0;
        boolean exitMethod = false;
        do {
            System.out.print(prompt + ": ");
            try {
                String checkValue = input.nextLine();
                value = Integer.parseInt(checkValue);
                exitMethod = true;
            } catch (NumberFormatException ne) {
                System.out.println("Correction Required: Numbers Only");
            }
        } while (!exitMethod);
        return value;

    }

    public int getValidatedMonth(String prompt) {
        boolean exitMethod = false;
        int number;
        do {
            number = validateNumber(prompt);
            if (number > 0 && number <= 12) {
                exitMethod = true;
            } else {
                System.out.println("Correction Required: Month should between 1-12 ");
            }

        } while (!exitMethod);

        return number;

    }

    //////////////////////

    public int getValidatedAge(String prompt) {
        boolean exitMethod = false;
        int number;
        do {
            number = validateNumber(prompt);
            if (number >= 0 && number <= 130) {
                exitMethod = true;
            } else {
                System.out.println("Correction Required: age should between  0 to 130 ");
            }

        } while (!exitMethod);

        return number;

    }

    ///////////////////
    public int getValidatedSiblings(String prompt) {
        boolean exitMethod = false;
        int number;
        do {
            number = validateNumber(prompt);
            if (number <= 13) {
                exitMethod = true;

            } else {
                System.out.println("Correction Required: siblings ");
            }

        } while (!exitMethod);

        return number;

    }

        public int getValidatedColour(String prompt) {
        boolean exitMethod = false;
        int number;
        do {
            number = validateNumber(prompt);
            if (number <= 5) {
                exitMethod = true;

            } else {
                System.out.println("Correction Required: not in range ");
            }

        } while (!exitMethod);

        return number;

    }

}
