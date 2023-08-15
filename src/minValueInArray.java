public class minValueInArray {
    public static void main(String[] args) {
        int[] arr={1,2,34,5,12,-1,1234,-13,-12,323,-2323};
        System.out.println(minNum(arr));
    }

    private static int minNum(int[] arr) {
        int min=Integer.MAX_VALUE;
        for(int i:arr){
            if(i<min){
                min=i;
            }
        }
        return min;
    }
}
