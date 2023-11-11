public class MergeTwoArraysEx {
    public static int[] mergeTwoArr(int[] a, int[] b) {
        int[] newArr = new int[a.length + b.length];
        int finalIndx = 0;
        for (int i = 0; i < a.length; i++) {
            newArr[finalIndx] = a[i];
            finalIndx += 1;
        }
        for (int i = 0; i < b.length; i++) {
            newArr[finalIndx] = b[i];
            finalIndx += 1;
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {6, 7, 8, 9, 10, 11, 12};
        int[] mergedArray = mergeTwoArr(firstArray, secondArray);
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
}
