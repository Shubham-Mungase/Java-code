import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Mousedemo1 extends JFrame
{
    JLabel tx=new JLabel("Mouse Clicked");
    public Mousedemo1()
    {
        setLayout(new FlowLayout());
        add(tx);
        addMouseListener(new M());
    }
    public class M implements MouseListener
    {
        public void mouseClicked(MouseEvent e)
        {
        if(e.getClickCount()==1)
        {
            tx.setText("Click no of time=1");
        }
        else if(e.getClickCount()==2)
        {
            tx.setText("Click no of Time =2");
        }
        }
    
    
    public void mousePressed(MouseEvent e)
    {

    }
    public void mouseReleased(MouseEvent e)
    {

    }
    public void mouseEntered(MouseEvent e)
    {

    }
    public void mouseExited(MouseEvent e)
    {

    }
    }
    public static void main(String args[])
    {
        Mousedemo1 f= new Mousedemo1();
        f.setVisible(true);
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}