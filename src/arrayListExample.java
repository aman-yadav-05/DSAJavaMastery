import java.util.ArrayList;
import java.util.Scanner;

public class arrayListExample {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>(5);
        list.add(23);
        list.add(32);
        list.add(98);
        list.add(78);
        list.add(45);
        list.add(45);
//        System.out.println("enter the values is list:");
//        for (int i = 0; i < 10; i++) {
//            list.add(sc.nextInt());
//        }

        //checking if list contain specific value
        System.out.println(list.contains(23));

        //return first occurrence
        System.out.println(list.indexOf(45));

        //returns last occurrence
        System.out.println(list.lastIndexOf(45));
        System.out.println(list);

        //returns the size of list
        System.out.println("size of list is:"+list.size());
        ArrayList<Integer> list2= new ArrayList<>(4);
        list2.add(23);
        list2.add(23);
        list2.add(23);
        list2.add(23);
        list2.add(23);
        System.out.println(list2);

        //add all ads all the items from another collection
        System.out.println(list.addAll(list2));

        //clears all the element in the arraylist collection
        list2.clear();
        System.out.println(list);
        System.out.println(list2);
    }
}
