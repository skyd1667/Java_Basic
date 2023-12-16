public class intArrOrganizerEx {
    public static void main(String[] args) {
        int[] numbers = {10, 99, 203, 2, 3, 502, 17, 1029, 6};
        int[] arr = numbers;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println("Changed array order: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
