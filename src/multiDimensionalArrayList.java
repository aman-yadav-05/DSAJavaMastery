import java.util.ArrayList;
import java.util.Scanner;

public class multiDimensionalArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //multidimensional arraylist
        ArrayList<ArrayList<Integer>> twoDim = new ArrayList<>();

        //initialising arraylist with 3 new list
        for (int i = 0; i < 3; i++) {
            twoDim.add(new ArrayList<>());
        }

        //entering values in arraylist with the help of .get() and .add() methods
        System.out.println("Enter values in list:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //getting list and adding
            twoDim.get(i).add(sc.nextInt());
            }
        }

        System.out.println(twoDim);
    }
}
