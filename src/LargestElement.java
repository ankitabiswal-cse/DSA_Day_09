public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {34, 67, 89, 56, 34, 56};

        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest :" + largest);
    }
}
