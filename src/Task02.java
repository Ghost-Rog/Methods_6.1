import java.util.Arrays;

public class Task02 {


    public void print(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void print(String [] strings){
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }
    }

    public void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void print(float[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[] arrayIntOne = {1, 2, 3, 4, 5};

        String[] arrayString = {"hello", "one", "two", "two"};

        int[][] arrayIntTwo =
                {{1, 2, 3, 4}, {5, 6, 7, 8}, {2,3,4,5}, {6,2,5,2}};



        float[][] arrayFloat = {{1,2 , 3,2},
                {1,2 , 2,3}};




        Task02 go = new Task02();
        go.print(arrayIntOne);
        System.out.println();
        go.print(arrayString);
        System.out.println();
        go.print(arrayIntTwo);
        System.out.println();
        go.print(arrayFloat);

    }
}
