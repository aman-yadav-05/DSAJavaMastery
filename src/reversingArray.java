import java.util.Arrays;
//this method is also known as two pointer method where we used start and end pointer
public class reversingArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println("Array before reversing:");
        System.out.println(Arrays.toString(arr));

//        swap(arr,1,3);
        //reversing the array
        reverse(arr);

        System.out.println("Arrays after reversing:");
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void swap(int[] arr, int index1, int index2){
        int temp=0;
        temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
