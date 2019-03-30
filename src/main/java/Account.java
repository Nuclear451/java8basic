import java.util.Arrays;
import java.util.Calendar;
/**
 * Created by Nuclear on 28.07.2018.
 */
public class Account {
    static int[] rotLeft(int[] a, int d) {

        for (int i = 0; i < d; i++){
            leftShift(a);
        }
        return a;
    }

    private static void leftShift(int[] arr){
        int prev = arr[arr.length - 1];
        for (int i = arr.length - 2; i >=0; i--){
            int temp = arr[i];
            arr[i] = prev;
            prev = temp;
        }
        arr[arr.length - 1] = prev;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(rotLeft(arr, 4)));
    }
}
