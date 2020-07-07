public class Application {
    String name;
    double age;
    int height;

    public Application(String name, double age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public boolean validateAge() {
        if (this.age > 30) {
            return true;
        } else {
            return false;
        }

    }

    public boolean validateHeight() {
        if (this.height > 160) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validateName() {
        if (name != null) {
            return true;
        } else {
            return false;
        }
    }

    public void run() {
        if (validateHeight() && validateAge() && validateName()) {
            System.out.println("User is taller than 160 and younger than 30");
        }

    }
}




