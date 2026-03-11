package arrayexamples;
public class FindSecondMin {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60};

        int min = arr[0];
        int secondMin = Integer.MAX_VALUE;


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min && arr[i] < secondMin) {
                secondMin = arr[i];
            }
        }

        
        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("No second minimum exists");
        } else {
            System.out.println("Second minimum value: " + secondMin);
        }
    }
}