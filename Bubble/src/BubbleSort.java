import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of list");
        int size = sc.nextInt();
        int [] list = new int[size];
        System.out.println("Enter " + list.length + " value: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }
        System.out.println("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }

        bubbleSort(list);
        System.out.println();
        System.out.println("Your input list after sort: ");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    static void bubbleSort(int [] arr){
        boolean check = true;
        for (int i = 1; i < arr.length && check; i++) {
            check = false;
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    check = true;
                }
            }
        }
    }


}
