public class searchInRange {
    public static void main(String[] args) {
        int start=1;
        int end=5;
        int target=3;
        int[] arr={18,12,-7,3,14,28};
        System.out.println(rangedSearch(arr,start,end,target));
    }

    private static boolean rangedSearch(int[] arr, int start, int end, int target) {
        if(arr.length==0){
            return false;
        }
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;

    }
}
