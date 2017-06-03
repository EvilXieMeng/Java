/**
 * 求解一个数组中指定的和，返回能求得这个和的两个数组值和下标值
 * @author xm
 *
 */
public class sum2 {
	public static void main(String[] args)
	{
		int[] ret;
		ret=new int[2];
		int[] nums = {2,7,11,15};
		ret=twoSum(nums,9);	
		
		if(ret[0]!=-1)
		{
			System.out.print("因为nums["+ret[0]+"]"+"+"+"nums["+ret[1]+"]"+"是"+nums[ret[0]]+"+"+nums[ret[1]]+"="+9);
		}
		else
		{
			System.out.print("没有匹配项");		
		}
	}
	
	public static int[] twoSum(int[] nums, int target) 
	{
	       //返回值是一个数组 
		int[] ret={-1,-1};
		boolean flag=false;
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if((nums[i]+nums[j])==target)
				{
					ret[0]=i;
					ret[1]=j;
					flag=true;
				}
				if(flag)
				{
					break;
				}
			}
			if(flag)
			{
				break;
			}
		}
		return ret;
	 }
}
