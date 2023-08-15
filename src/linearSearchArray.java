import java.util.Scanner;
public class linearSearchArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={18,12,9,14,77,50};
        System.out.println(" Enter a number to search through the array:");
        int value=sc.nextInt();
        System.out.println(look(arr,value));

    }

    private static boolean look(int[] arr, int value) {
        boolean flag=false;
        for (int i :
                arr) {
            if (i == value) {
                flag = true;
                break;
            }
            }
        return flag;
    }
}
