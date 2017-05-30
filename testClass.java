/*
 * *测试类和类之间的调用
 * *猜想：设计一个游戏，一个类进行生成0～9之间的数字，然后进行猜测。如果有人猜对了就结束游戏
 * */
class guessNum
{
	//首先定义在这个类中的实例化变量
	private boolean flag=false;
	private int guessnumber;
	//定义方法
	public void startGame()
	{
		//设置自己猜设的数字
		guessnumber=(int)(Math.random()*10);
		System.out.println("您猜设的数字"+guessnumber);		
	}
	public int getNum()
	{
		return guessnumber;	//返回结果
	}
	
	public void setFlag(boolean vale)
	{
		flag=vale;
	}
	public boolean getFlag()
	{
		return flag;
	}
}
class RondNum
{
	//这个类主要生成一个随机数字
	private int Num;
	public int getNum()
	{
		Num=(int)((Math.random())*10);
		return Num;
	}
}
public class testClass {
	//测试类
	public static void main(String[] args)
	{
		
		//生成随机数字
		RondNum rnum=new RondNum();	//实例化一个类是如何进行实例化的
		int num=rnum.getNum();		//得到确切的值
		System.out.print("随机生成的数字是：");
		System.out.println(num);
		//然后实例化三个人出来进行猜数字
		guessNum person1=new guessNum();
		guessNum person2=new guessNum();
		guessNum person3=new guessNum();

	while(true)
	{
		person1.startGame();
		person2.startGame();
		person3.startGame();
		int perNum1=person1.getNum();
		int perNum2=person2.getNum();
		int perNum3=person3.getNum();
		
		if(perNum1==num)
		{
			person1.setFlag(true);
		}
		if(perNum2==num)
		{
			person2.setFlag(true);
		}
		if(perNum3==num)
		{
			person3.setFlag(true);
		}
		
		if(person1.getFlag()||person2.getFlag()||person3.getFlag())
		{
			//有人才出来了，结束游戏
			System.out.println("有人猜出来了");
			break;
		}
		else
		{
			System.out.println("再猜一次");
		}
	 }			
	}
}
