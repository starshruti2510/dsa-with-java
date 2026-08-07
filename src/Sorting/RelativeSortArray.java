package src.Sorting;

public class RelativeSortArray {
    public static void print(int[] nums) {
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int length = 0;
        for(int i=0; i<arr1.length; i++) {
            length = Math.max(length, arr1[i]);
        }

        int[] countfreq = new int[length+1];
        for(int i=0; i<arr1.length; i++) {
            countfreq[arr1[i]]++;
        }

        int[] ans = new int[arr1.length];
        int index = 0;
        for(int i=0; i<arr2.length; i++) {
            while(countfreq[arr2[i]] > 0) {
                ans[index] = arr2[i];
                index++;
                countfreq[arr2[i]]--;
            }
        }

        for(int i=0; i<countfreq.length; i++) {
            while(countfreq[i] > 0) {
                ans[index] = i;
                index++;
                countfreq[i]--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        print(arr1);
        print(arr2);
        int[] a = relativeSortArray(arr1, arr2);
        print(a);
    }
}
