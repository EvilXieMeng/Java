
public class Array {
	private static int count=0;
		
	public static void main(String[] args)
	{
		int[] arrayRefVal=new int[10];	//定义数组的方式
		System.out.println("判断是否是空"+isEmpty(arrayRefVal));
		for(int i=0;i<arrayRefVal.length;i++)
		{
			push(arrayRefVal,i);	//将0~9元素入栈
		}
		System.out.println("判断是否是空"+isEmpty(arrayRefVal));
		
		System.out.println("入栈数组元素");
		for(int i=0;i<arrayRefVal.length;i++)
		{
			System.out.print(arrayRefVal[i]+" ");
		}
		
		System.out.println("栈顶元素"+peek(arrayRefVal));
		
		System.out.println("出栈元素");
		for(int i=0;i<arrayRefVal.length;i++)
		{
			System.out.print(pop(arrayRefVal)+" "); 
		}
		System.out.println("堆栈元素个数"+getSize(arrayRefVal));
	}
	//堆栈元素入栈
	public static int push(int[] val,int a)
	{
		if(count<val.length)
		{
			//元素入栈
			val[count++]=a;
			return 1;
		}
		else
		{
			return 0;
		}
	}
	//堆栈元素出栈
	public static int pop(int[] val)
	{
		if(count>0)
		{
			int popVal=val[--count];
			return popVal;
		}
		else
		{
			return -1;
		}
	}
	//得到数组大小
	public static int getSize(int[] val)
	{
		return count;
	}
	//判断堆栈是否为空
	public static boolean isEmpty(int[] val)
	{
		return count==0;
	}	
	//返回最上面的值
	public static int peek(int[] val)
	{
		int top=count-1;
		return val[top];
	}	
}
