package algorithms_2019_025;

/**
 * @author Humayun Kabir
 */
public class SelectionSort {
    public void Selection_Sort(){
        System.out.println("============== Selection Sort ==============");
        Input in = new Input();
        int arr[] = in.input_value();
        int min,temp,i,j,len=arr.length,pass=1;
        for(i=0;i<len-1;i++){
            min = i;
            for(j=i+1;j<len;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
            System.out.print("Pass "+pass+" => ");
            for(int k=0;k<len;k++){
                System.out.print(arr[k]+" ");
            }
            pass++;
            System.out.println("");
        }
        System.out.println("************************************************");
        System.out.print("After sorting the array: ");
            for(int k=0;k<len;k++){
                System.out.print(arr[k]+" ");
            }
        System.out.println("\n************************************************");
    }
}
