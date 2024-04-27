import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = s.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size ; i++){
            arr[i] = s.nextInt();
        }

        int oddcount = 0;
        for (int i = 0 ;i < size; i++){
            if(arr[i] % 2 != 0){
                oddcount++;
            }
        }
        int[] newArr = new int[oddcount];
        int j = 0;
        for (int i = 0; i < size; i++){
            if (arr[i] % 2 != 0){
                newArr[j] = arr[i];
                j++;
            }
        }
        System.out.println("Odd numbers are: "+ Arrays.toString(newArr));

        int evencount = 0;
        for (int i = 0 ;i < size; i++){
            if(arr[i] % 2 == 0){
                evencount++;
            }
        }
        int[] newArr2 = new int[evencount];
        int k= 0;
        for (int i = 0; i < size; i++){
            if (arr[i] % 2 == 0){
                newArr2[k] = arr[i];
                k++;
            }
        }
        System.out.println("Even numbers are: "+ Arrays.toString(newArr2));

    }
}