//leetcode question
public class removeDuplicate {
    public static void main(String[] args) {
        int[] arr={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDup(arr));


    }


    private static int removeDup(int[] nums){
        int index=1;
        if(nums.length==1){
            return index;
        }
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=nums[i-1]){
                nums[index++]=nums[i];
            }
        }
        return index;
    }
}
