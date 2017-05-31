/*
 * 对while和for进行测试
 */
public class while_for {
	public static void main(String[] args)
	{
		//求100以内的奇数和偶数和
		//while实现100奇数字
		int i=1;
		int sum=0;
		while(i<=100)
		{
			if(i%2 != 0)
			{
				//如果是奇数
				sum+=i;
			}
			i++;
		}
		System.out.println("while求100以内的奇数是："+sum);
		//while求100以内的偶数
		i=1;
		sum=0;
		while(i<=100)
		{
			if(i%2==0)
			{
				sum+=i;
			}
			i++;
		}
		System.out.println("while求100以内偶数是："+sum);
		i=1;
		sum=0;
		int odd_sum=0;
		//for循环求奇偶数
		for(i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				//100以内的偶数
				odd_sum+=i;
			}
			else
			{
				sum+=i;
			}
		}
		System.out.println("for求100以内的奇数："+sum);
		System.out.println("for求100以内的偶数："+odd_sum);
		
		/*
		 *求1+1+2+1+2+3+...+1+2+3+..+100 
		 */
		sum=0;
		for(i = 1;i<=100;i++)
		{
			for(int j=i;j>0;j--)
			{
				sum+=j;
			}
		}
		System.out.println("求和的结果是："+sum);
		
		/*
		 * 求阶层1！+2！+3！+...100!
		 */
		odd_sum=0;
		for(i=1;i<=10;i++)
		{
			sum=1;	//注意这个位置
			for(int j=i;j>0;j--)
			{
				sum*=j;
			}
			odd_sum+=sum;
		}
		System.out.println("求出来的结果是"+odd_sum);
	}
}
