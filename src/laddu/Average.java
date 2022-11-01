package laddu;
public class Average {

    public static void main(String[] args) {
        double[] numArray = { 4, 6, -4, 2, 3, 4 };
        double sum = 0.0;

        for (double num: numArray) {
           sum += num;
        }

        double average = sum / numArray.length;
        System.out.format("The average is: %.2f", average);
    }
}