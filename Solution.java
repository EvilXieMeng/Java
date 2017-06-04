
class ListNode 
{
    int val;
    ListNode next;
    ListNode(int x) 	//这个是已经创建好了的
    { 
    	val = x; 
    }
}

public class Solution {
	public static void main(String[] args)
	{
		ListNode l1,l2;
		ListNode ret;
		l1= new ListNode(2);
		
		l2= new ListNode(8);
		l2.next=new ListNode(9);
		l2.next.next=new ListNode(9);
		l2.next.next.next=new ListNode(9);
		ret=addTwoNumbers(l1, l2);
		while(ret!=null)
		{
			System.out.print(" "+ret.val);
			ret=ret.next;
		}
	}

	    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	    	ListNode l3;        //这个是为了准备插入的节点
	    	ListNode retList;
	    	ListNode pointList;
	    	//首先实现一个节点
	    	int flag=0;
	    	retList = new ListNode(-1);
	    	pointList=retList;		//没有意义，仅仅是为了初始化
	    	while(l1!=null&&l2!=null)
	    	{
	        	int result=0;
	        	if(flag==1)
	        	{
	    		    result=l1.val+l2.val+1;	//两个数字相加
	    		    flag=0;
	        	}
	        	else
	        	{
	        	    result=l1.val+l2.val;
	        	}
	    		if(result>=10)
	    		{
	    			flag=1;
	    			result%=10;
	    		}
	    		l3 = new ListNode(result);	//求到了两个链表的数据
	    		//将两个链表的数据链接到一起
	    		if(retList.val<0)
	    		{
	    			retList=l3;		//这个地方虽然指定了，但是retList.next也是空
	    			pointList=l3;	//工作节点也要指向这里
	    		}
	    		else
	    		{
	    			pointList.next=l3;
	    			pointList=pointList.next;
	    		}
	    		l1=l1.next;
	    		l2=l2.next;
	    	}
		    if(l1==null)   
		    {
		    	//如果是l1先遍历完全
		    	pointList.next=l2;
		    }
		    if(l2==null)
		    {
		    	pointList.next=l1;
		    }
		    //上面是链接上了
		    while(flag==1)
		    {
		    	if(pointList.next!=null)
		    	{
		    		pointList=pointList.next;
		    		pointList.val++;
		    		if(pointList.val>=10)
		    		{
		    			pointList.val%=10;
		    		}
		    		else
		    		{
		    			flag=0;
		    		}
		    	}
		    	else
		    	{
		    		l3=new ListNode(1);
		    		pointList.next=l3;
		    		flag=0;
		    	}
		    }
	    	return retList;
	    }
}
