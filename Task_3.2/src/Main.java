import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[args.length];
        for (int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }
        System.out.print("base: ");
        for (int values : array) {
            System.out.print(values + ", ");
        }
        Arrays.sort(array);
        System.out.println(" ");
        System.out.print("asc: ");
        for (int values : array) {
            System.out.print(values + ", ");
        }

        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(" ");
        System.out.print("desc: ");
        for (int values : array) {
            System.out.print(values + ", ");
        }
        System.out.println(" ");
        System.out.print("inner: ");
        Integer[] arraySorted = new Integer[array.length];
        int left = 0;
        int right = array.length - 1;
        for (int i=0; i < array.length; i++) {
            if (i % 2 != 0){
                arraySorted[right] = array[i];
                right--;
            }
            else{
                arraySorted[left] = array[i];
                left++;
            }
        }
        for (int values : arraySorted) {
            System.out.print(values + ", ");
        }

    }
}