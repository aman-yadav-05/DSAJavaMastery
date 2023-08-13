import java.util.Arrays;
import java.util.Scanner;

public class arrayTwoDimension {
    public static void main(String[] args) {
        //initialising a two dim array
        Scanner sc= new Scanner(System.in);
        int[][] numbers= new int[3][2];

        System.out.println("enter array values:");
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                numbers[row][col]=sc.nextInt();
            }
        }
        System.out.println("output array:");
//        for (int[] number : numbers) {
//            for (int i : number) {
//                System.out.print(i + " ");
//            }
//                System.out.println();
//        }

        for (int[] number:
        numbers){
            System.out.println(Arrays.toString(number));
        }
    }
}
