public class Colours {
    public enum Kolory {
        Zielony, /* Zielony */
        Bialy, /* Biały */
        Czerwony, /* Czerwony */
        Niebieski, /* Niebieski */
        Pomaranczowy, /* Pomarańczowy */
        Rozowy, /* Różowy */
    }
    public static Kolory letterChosen() {
        String letter = UserDialogs.getLetter();
        switch (letter) {
            case "Z":
                return Kolory.Zielony;
            case "B":
                return Kolory.Bialy;
                 // unreachable statement
            case "C":
                return Kolory.Czerwony;

            case "N":
                return Kolory.Niebieski;

            case "P":
                return Kolory.Pomaranczowy;

            case "R":
                return Kolory.Rozowy;

            default:
                System.out.println("Nie mam tej litery w bazie danych. Spróbuj wpisać inną.");
        }
        return null;
    }
}


