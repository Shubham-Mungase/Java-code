import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Cal4 extends JFrame
{
	JLabel l1=new JLabel("Enter 1st No ");
	JLabel l2=new JLabel("Enter 2nd No ");
	JLabel l3=new JLabel("Result ");
	JTextField txfno=new JTextField(20);
	JTextField txsno=new JTextField(20);
	JTextField txres=new JTextField(20);
	JButton ba=new JButton("Add");
	JButton bs=new JButton("Sub");
	JButton bm=new JButton("Mul");
	JButton bd=new JButton("Div");
	public Cal4()
	{
		setLayout(new FlowLayout());
		add(l1);
		add(txfno);
		add(l2);
		add(txsno);
		add(l3);
		add(txres);
		add(ba);
		add(bs);
		add(bm);
		add(bd);
		ba.addActionListener(new Add());
		bs.addActionListener(new Sub());
		bm.addActionListener(new Mul());
		bd.addActionListener(new Div());
	}
	class Add implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			int a,b,c=0;
			a=Integer.parseInt(txfno.getText());
			b=Integer.parseInt(txsno.getText());
			c=a+b;
			txres.setText(Integer.toString(c));
		}
	}
	class Sub implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			int a,b,c=0;
			a=Integer.parseInt(txfno.getText());
			b=Integer.parseInt(txsno.getText());
			c=a-b;
			txres.setText(Integer.toString(c));
		}
	}
	class Mul implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			int a,b,c=0;
			a=Integer.parseInt(txfno.getText());
			b=Integer.parseInt(txsno.getText());
			c=a*b;
			txres.setText(Integer.toString(c));
		}
	}
	class Div implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			int a,b,c=0;
			a=Integer.parseInt(txfno.getText());
			b=Integer.parseInt(txsno.getText());
			c=a/b;
			txres.setText(Integer.toString(c));
		}
	}
	public static void main(String [] args)
	{
		Cal4 f= new Cal4();
		f.setVisible(true);
		f.setSize(300,300);
		f.setTitle("Calculator");
		f.setLocation(50,50);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
