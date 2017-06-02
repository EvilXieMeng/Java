public class bubble
{
	public static void main(String[] args)
	{
		int i,j;
		int[] myarray;
		myarray= new int[10];
		for(i=0;i<10;i++)
		{
			myarray[i]=myarray.length-i;;
		}
		System.out.println("打印输入的数据");
		for(i=0;i<myarray.length;i++)
		{
			System.out.print(myarray[i]+" ");
		}
		//使用冒泡排序进行排序
		for(i=0;i<myarray.length;i++)	//这是总共排序了10次
		{
			for(j= 0;j<myarray.length-1-i;j++)	//每一次都是从0开始
			{
				if(myarray[j]>myarray[j+1])
				{
					int temp = myarray[j+1];
					myarray[j+1]= myarray[j];
					myarray[j]=temp;
				}
			}
		}
		for(int k=0;k<myarray.length;k++)
		{
			System.out.print(" "+myarray[k]);
		}
	}
}
