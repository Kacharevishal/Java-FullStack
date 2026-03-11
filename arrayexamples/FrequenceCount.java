package arrayexamples;

public class FrequenceCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 3, 1, 5, 2};

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (!alreadyCounted) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                System.out.println(arr[i] + " occurs " + count + " times");
            }
        }
    }
}
