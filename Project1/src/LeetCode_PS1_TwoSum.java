import java.util.HashMap;
import java.util.Map;
public class LeetCode_PS1_TwoSum {
     public int[] twosum(int[] nums,int target)
     {
    	 Map<Integer,Integer> numtoIndex = new HashMap<>();  //Object
    	 for(int i=0;i<nums.length; i++)
    	 {
    		 int complement = target-nums[i];
    		 if(numtoIndex.containsKey(complement))
    		 {
    			 return new int[]
    					 {
    							 numtoIndex.get(complement),i
    					 };
    		 }
    			 numtoIndex.put(nums[i], i);
    		 }
    		 throw new IllegalArgumentException("No Solution exists");
    	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode_PS1_TwoSum solution = new LeetCode_PS1_TwoSum();
		int[] nums = {2,7,11,15}; //Example Input
		int target=9;
		try
		{
			int[] result =solution.twosum(nums, target);
			System.out.println("Indices: [" + result[0] + ","+ result[1]+"]");
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
		
     }

}
