package V14BinarySearch.questions;

public class bb {
    public static void main(String[] args) {

        int[] aray3 = {1,2,2,3,3};
        System.out.println(singleNonDuplicate(aray3));
    }

    public static int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }

        int start = 0;
        int end = n-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid == 0 && nums[0] != nums[1]){
                return nums[mid];
            }
            if(nums[mid] == n - 1 && n-1 != n-2){
                return nums[mid];
            }
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                return nums[mid];
            }

            if(mid%2 == 0){
                if(nums[mid] == nums[mid-1]){
                    end = mid - 1;
                }
                else{
                    start = mid+1;
                }
            }else{
                if(nums[mid] == nums[mid-1]){
                    start = mid+1;
                }
                else{
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

}
