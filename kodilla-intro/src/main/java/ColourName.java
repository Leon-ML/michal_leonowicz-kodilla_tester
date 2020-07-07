public class ColourName {
    public static void main(String[] args) {
        Colours literaKoloru = new Colours();
        Colours.Kolory kolor =  literaKoloru.letterChosen();
        if (kolor != null){
            System.out.println("Kolor na tę literę to " + kolor);
        }
    }
}

