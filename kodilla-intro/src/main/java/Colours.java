public class Colours {
    public enum Kolory {
        Z, /* Zielony */
        B, /* Biały */
        C, /* Czerwony */
        N, /* Niebieski */
        P, /* Pomarańczowy */
        R, /* Różowy */
    }
    public static Kolory letterChosen() {
        String letter = UserDialogs.getLetter();
        switch (letter) {
            case "Z":
                return Kolory.Z;
            case "B":
                return Kolory.B;
                break; // unreachable statement
            case "C":
                return Kolory.C;
                break;
            case "N":
                return Kolory.N;
                break;
            case "P":
                return Kolory.P;
                break;
            case "R":
                return Kolory.R;
                break;
            default:
                System.out.println("Nie mam tej litery w bazie danych. Spróbuj wpisać inną.");
        }
        return null;
    }
}


