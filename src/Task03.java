import java.util.Arrays;

public class Task03 {

    public void printArray(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }

    public void arraySort(String[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }

    public void arraySortCountWord(String[] arr) {
//        int [] array = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            array[i] = arr[i].length();
//        }
//        Arrays.sort(array);


    }


    public static void main(String[] args) {

        String[] arrayString = {"I am at home", "thi word so cool", "bed its best", "good or evil", "attention please", "zorro vs batman"};

        Task03 play = new Task03();

        play.printArray(arrayString);
        System.out.println();
        play.arraySort(arrayString);
        System.out.println();

    }
}
