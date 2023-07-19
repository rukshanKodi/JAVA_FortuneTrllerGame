
public class App {

    public static void main(String[] args) throws Exception {

        NumberInput nInput = new NumberInput();
        TextInput tinput = new TextInput();
System.out.println("welcome to the fortune teller"+"\n");
        String validatedFirstname = tinput.getStringValue("enter your first name: ");
        String validatedLastname = tinput.getStringValue("enter your last name: ");
        int validatedAge = nInput.getValidatedAge("Enter your age");
        int validatedMonth = nInput.getValidatedMonth("Enter your month of birthday");
        int validatedSibling = nInput.getValidatedSiblings("Enter number of siblings");
        int validatedColor = nInput.getValidatedColour(
                "select your favorite color" + "\n" + "0 - red" + "\n" + "1 - orange" + "\n" + "2 - yellow" + "\n"
                        + "3 - green" + "\n" + "4 - blue" + "\n" + "5 - indigo" + "\n" + "6 - violet");

        Fortune fout = new Fortune();
        System.out.println("________________________Your fortune_______________________"+"\n");
        System.out.println(validatedFirstname + " " + validatedLastname + " " + "will retire in "
                + fout.RetirementTeller(validatedAge) + " years " + "with " + fout.financeTeller(validatedMonth)
                + " in the bank , a vacation home in " + fout.vacationTeller(validatedSibling) + ", and travel by "
                + fout.transportationTeller(validatedColor));
                System.out.print("___________________________________________________________"+"\n"+"\n");

    }
}
