import java.util.Scanner;

public class InsertSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int arr [] = new int[size];
        System.out.println("Enter " + arr.length + " value: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your input array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }

        insertSort(arr);
        System.out.println("Your input array after sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void insertSort(int [] arr){
        for (int i = 1; i < arr.length; i++){
            int currentElement = arr[i];
            int j;
            for (j = i-1; j>=0 && arr[j] > currentElement ; j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = currentElement;
        }
    }
}
