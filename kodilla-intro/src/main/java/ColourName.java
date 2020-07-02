public class ColourName {
    public static void main(String[] args) {
        Colours literaKoloru = new Colours();
        String userChoise = UserDialogs.getLetter();
        Colours.Kolory kolor =  literaKoloru.letterChosen();
        System.out.println("Kolor na tę literę to" + kolor);
    }
}

