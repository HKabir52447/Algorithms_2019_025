package algorithms_2019_025;
import java.util.Scanner;

/**
 * @author Humayun Kabir
 */
public class Input {
    Scanner s = new Scanner(System.in);
    public int[] input_value(){
        System.out.print("Enter the size of array: ");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the value of array: ");
        for(int i=0;i<size;i++){
            System.out.print("arr["+i+"]=");
            arr[i] = s.nextInt();
        }
        System.out.println("************************************************");
        System.out.print("Orginal array: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        return arr;
    }
    
}
