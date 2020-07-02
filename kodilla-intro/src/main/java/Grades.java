public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        grades[size] = value;
        size++;
    }

    public int getLastValue() {
        return grades[size - 1];

    }
    public double getAverageGrade() {
        int sum = 0;
        for (int i = 0; i > grades.length; i++){
            int number = grades[i];
            sum = sum + number;
        }
        double average = sum/size;
        return average;

    }
}



