package first;
import javax.swing.JOptionPane;
//这个应用是打印欢迎用Java
public class Welcome {
	public static void main(String[] args )
	{ 
	JOptionPane.showMessageDialog(null,	//一般为null
				     "welcome",//文本显示内容
				     "example",//对话框标题
				     JOptionPane.INFORMATION_MESSAGE);//参数
	}
}
