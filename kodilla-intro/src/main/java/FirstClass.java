public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("600g", 1000, 2015);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();
        notebook.checkValue();


        Notebook heavyNotebook = new Notebook("2000g", 1500, 2019);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();
        heavyNotebook.checkValue();



        Notebook oldNotebook = new Notebook("1600g", 500, 2010);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();
        oldNotebook.checkValue();
    }
}