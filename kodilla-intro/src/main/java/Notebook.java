public class Notebook {
    String weight;
    int price;
    int year;

    public Notebook(String weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");}
        else if (this.price <= 1000) {
                System.out.println("This price is good.");
            }
         else {
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight() {
        if (this.weight == "600g") {
            System.out.println("This notebook is light.");}
        else if (this.weight == "1600g") {
            System.out.println("This price is quite heavy.");
        }
        else {
            System.out.println("This notebook is very heavy.");
        }
    }
    public void checkYear() {
        if (this.year < 2014) {
            System.out.println("This notebook is very old.");}
        else if (this.year < 2018) {
            System.out.println("This notebook is quite new.");
        }
        else {
            System.out.println("This notebook is modern.");
        }
    }
    public void checkValue() {
        if (this.year >= 2016 && this.price <= 1500) {
            System.out.println("This notebook has good value");}
        else if (this.year > 2018 && this.price >= 1500) {
            System.out.println("This notebook has very good value.");
        }
        else {
            System.out.println("This notebook is waste of money.");
        }
    }
}
