import java.util.Arrays;

public class swapingArrayValues {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println("Array before swapping:");
        System.out.println(Arrays.toString(arr));

        swap(arr,1,3);

        System.out.println("Arrays after swapping:");
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int index1, int index2){
        int temp=0;
        temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
