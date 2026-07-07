package src.Arrays;

public class RemoveDuplicates {

    //---- Removing Duplicates elements from sorted array------
    public static int Duplicates(int[] n) { 
        if( n.length == 0) {
            return 0;
        }
        int j = 1;    // we will take a varible 'j' initialized by 1 as the first element of a sorted array is sorted.
        for(int i = 1; i < n.length; i++) {
            if(n[i] != n[j-1]) {        // if the previous number is equal to current then we will make the current variable variable 'i' equal to the previous one 'j'
                n[j] = n[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,4,5,5,6};
        int k = Duplicates(nums);
        for(int i=0; i<k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
