import java.util.Scanner;

public class TextInput {
    private Scanner input = new Scanner(System.in);

    public String getStringValue(String prompt) {
        String value = "";

        boolean exitMethod = false;
        do {
            System.out.print(prompt + ": ");
            try {
                value = input.nextLine();
                boolean empty = value.isEmpty();
                if (empty) {
                    throw new Exception("value canot be empty");
                }
               for (int i = 0; i < value.length(); i++) {
                    if (value.length() >= 50) {
                        throw new Exception("values not > 50");
                    }
                    boolean isLetter = Character.isLetter(value.charAt(i));
                    if (!isLetter) {
                        throw new Exception("no special charactors");
                    }
                }
                exitMethod = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
               // System.out.println("Input values should be max 50 characters. No special inputs");
            }
        } while (!exitMethod);
        return value;
    }
}
