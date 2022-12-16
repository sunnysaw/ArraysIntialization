import java.util.Scanner;
/*
In this section we will see about how to initialize array and how they work in different cases:
 */
public class Arraysinitialize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array you want : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the value of array which is equal to :" + n);
        for (int i =0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            System.out.println("value of arrays are given below :" + arr[i]);
        }
        System.out.println();
        System.out.println("The value of copy array is given below :");
        System.out.println();
        // Now trying to copy of array
        int arr2 [] = arr;
        for (int i =0; i < arr.length; i++) {
            System.out.println("value of arrays are given below :" + arr2[i]);
        }
    }
}
