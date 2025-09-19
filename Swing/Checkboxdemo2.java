import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Checkboxdemo2 extends JFrame implements ActionListener
{
	JCheckBox ch1=new JCheckBox("Java",true);
	JCheckBox ch2=new JCheckBox("Adv Java",true);
	JCheckBox ch3=new JCheckBox("Php",true);
	JTextField tx =new JTextField(20);
	public Checkboxdemo2()
	{
		Container con= getContentPane();
		con.setLayout(new FlowLayout());
		con.add(tx);
		con.add(ch1);
		con.add(ch2);
		con.add(ch3);
		ch1.addActionListener(this);
		ch2.addActionListener(this);
		ch3.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		String str="";
		if(ch1.isSelected())
			str=str+ch1.getLabel();
		if(ch2.isSelected())
			str=str+ch2.getLabel();
		if(ch3.isSelected())
			str=str+ch3.getLabel();		
		tx.setText(str);		
	}
		public static void main(String [] args)
	{
		Checkboxdemo2 f= new Checkboxdemo2();
		f.setVisible(true);
		f.setSize(300,300);
		f.setTitle("CheckBox2");
		f.setLocation(50,50);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
