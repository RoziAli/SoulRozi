import java.util.Scanner;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Test extends Frame
{
	int eq1, eq2;
	public int equation1(int y, int power_y, int sum)
	{
		double eq=sum/y;
		eq=Math.pow(eq, 1.0 / power_y);
		eq1=(int)Math.round(eq);
		return eq1;
	}
	public double equation2(int x, int power_x, int sum)
	{
		double eq=sum/x;
		eq=Math.pow(eq, 1.0 / power_x);
		eq2=(int)Math.round(eq);
		return eq2;
	}
	public Test()
	{
		super("graph");
		setSize(300, 400);
		setVisible(true);
		
		 addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e)
          {dispose(); System.exit(0);}
       }
     );
	}
	public void paint(Graphics g)
	{
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.blue);
		g2d.drawLine(0, eq1, eq2, 0);
	}
	public static void main(String args[])
	{
		int x, y, power_x, power_y, sum;
		System.out.println("Enter the x coordinate");
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		System.out.println("Enter the x power");
		Scanner sc1 = new Scanner(System.in);
		power_x=sc1.nextInt();
		System.out.println("Enter the y coordinate");
		Scanner sc2 = new Scanner(System.in);
		y=sc2.nextInt();
		System.out.println("Enter the y power");
		Scanner sc3 = new Scanner(System.in);
		power_y=sc3.nextInt();
		System.out.println("Enter the sum");
		Scanner sc4 = new Scanner(System.in);
		sum=sc4.nextInt();
		
		Test ob=new Test();
		System.out.println(ob.equation1(y, power_y, sum));
		System.out.print(ob.equation2(x, power_x, sum));
	}
}