import java.awt.*;
import javax.swing.*;
public class GridLayoutdemo extends JFrame
{
    JButton b1=new JButton("First");
    JButton b2=new JButton("Second");
    JButton b3=new JButton("3");
    JButton b4=new JButton("4");
    JButton b5=new JButton("5");
    JButton b6=new JButton("6");
    public GridLayoutdemo()
    {
        setLayout(new GridLayout(3,2,10,10));
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
    }
    public static void main(String [] args)
    {
        GridLayoutdemo obj=new GridLayoutdemo();
        obj.setVisible(true);
        obj.setSize(500,500);
    }
}