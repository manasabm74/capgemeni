import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    public static int[] twoSum(int[] nums, int target) {
       // Your code here

		// int left =0 ;
		// int right = nums.length-1;

		// while(left<right){
		// 	int sum = nums[left] +nums[right];
		// 	if(sum == target){
		// 		return new int []{left +1,right+1};
		// 	}
		// 	else if(sum < target){
		// 		left++;
		// 	}else{
		// 	right --;
		// }
  //   }
		// return new int [] {};


        Map<Integer,Integer> map = new HashMap<>();

        for(int i =0; i< nums.length;i++){
            int compliment = target - nums[i];

            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment )+1,i +1};
            }

            map.put(nums[i],i);
        }

        return new int[]{};
        
	}
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
        long n = Long.parseLong(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        int[] arr = new int[(int)n];
        for(int i=0; i<n; i++)arr[i]=Integer.parseInt(inputLine[i]);
        int m = Integer.parseInt(br.readLine().trim());
        int[] ans = (twoSum(arr, m));
        System.out.println(ans[0] + " " + ans[1]);
	}
}



