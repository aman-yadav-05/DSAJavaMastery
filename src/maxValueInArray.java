import java.util.Scanner;

public class maxValueInArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of array:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }


        System.out.println(max(arr));
    }
    public static int max(int[] arr){
        int maxValue=Integer.MIN_VALUE;
        for (int num:
                arr) {
            if(maxValue<=num){
                maxValue=num;
            }
        }
        return maxValue;
    }
}
