
public class Fortune {
     public int validatedAge;

     public int RetirementTeller(int validatedAge) {
          // System.out.println("aaa" + validatedAge);
          int retirementAge = 0;
          if ((validatedAge % 2) == 0) {
               retirementAge = 14;
          } else {
               retirementAge = 12;
          }
          return retirementAge;

          //
     }

     public String financeTeller(int validatedMonth) {
          String bankB = "";
          if ((validatedMonth <= 4)) {
               bankB = "$256,000.76";
          } else if (validatedMonth <= 8) {
               bankB = "$3,687,105.42";
          } else if (validatedMonth <= 12) {
               bankB = "$86.23";
          } else {
               bankB = "$0.00";
          }
          return bankB;
     }

     public String vacationTeller(int validatedSibling) {
          String location = "";
          if ((validatedSibling == 0)) {
               location = "Boca Raton, FL";
          } else if (validatedSibling == 1) {
               location = "Nassau, Bahamas";
          } else if (validatedSibling == 2) {
               location = "Ponta Negra, Brazil";
          } else if (validatedSibling == 3) {
               location = "Portland, Oregon";
          } else if (validatedSibling > 3) {
               location = "Baton Rouge, LA";
          } else {
               location = "Chernobyl, Ukraine";
          }
          return location;
     }

     public String transportationTeller(int validatedColor) {
          String location = "";
          if ((validatedColor == 0)) {
               location = "Maserati";
          } else if (validatedColor == 1) {
               location = "stallion";
          } else if (validatedColor == 2) {
               location = "chariot";
          } else if (validatedColor == 3) {
               location = "taxi";
          } else if (validatedColor == 4) {
               location = "rickshaw";
          } else if (validatedColor == 5) {
               location = "motor scooter";
          } else {
               location = "flying saucer";
          }
          return location;
     }
}