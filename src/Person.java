public class Person {

    // [First Name] [Last Name] will retire in [# of years] with [bank balance] in
    // the bank, a vacation home in [location], and travel by //[mode of
    // transportation].
    private String FirstName; //
    private String LastName; //
    private int Age; //
    private int month; //
    private String siblings;
    private int color;

    public Person(String FirstName, String LastName, int Age, int month, String siblings,
            int color) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Age = Age;
        this.month = month;
        this.siblings = siblings;
        this.color = color;
    }
}
