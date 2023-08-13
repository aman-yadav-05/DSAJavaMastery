import java.util.Arrays;
import java.util.Scanner;
public class arrayPractice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int size=sc.nextInt();
        int[] nums=new int[size];
        for (int i = 0; i <size; i++) {
            nums[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(nums));
    }
}
