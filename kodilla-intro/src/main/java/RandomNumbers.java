import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class RandomNumbers {
    int Max = 0;
    int Min = 30;

    public RandomNumbers(){
        int sum = 0;
        while(sum < 5000) {
            Random randomNumber = new Random();
            int result = randomNumber.nextInt(31);
            sum = sum + result;

            if (result<Min){
                Min = result;
            }
            if (result>Max){
                Max = result;
            }

        }
        System.out.println("Najmniejsza wylosowana wartość to" + " " +Min );
        System.out.println("Najwieksza wylosowana wartość to" + " " +Max );
    }

    public static void main(String[] args) {
        new RandomNumbers();
    }
}
