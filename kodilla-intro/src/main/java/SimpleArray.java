public class SimpleArray {
    public static void main(String[] args) {
        String[] namesM = new String[] {"Paweł", "Artur", "Jan", "Aleksander", "Zenon", "Kazimierz"};
        String name2 = namesM[2];
        System.out.println(name2);
        int numberOfElements = namesM.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów.");
    }
}
