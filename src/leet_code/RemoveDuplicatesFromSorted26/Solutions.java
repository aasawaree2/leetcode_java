package leet_code.RemoveDuplicatesFromSorted26;

public class Solutions {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=1){
            return nums.length;
        }
        int i=0,j;
        for(i=0,j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i+=1;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args){
        Solutions solutions = new Solutions();
        System.out.println(solutions.removeDuplicates(new int[] {1,2,3,4,5}));
    }
}