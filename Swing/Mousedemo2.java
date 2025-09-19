import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Mousedemo2 extends JFrame
implements MouseListener
{
    Container con;
    public Mousedemo2()
    {
        con=getContentPane();
        con.setLayout(new FlowLayout());
        con.addMouseListener(this);
    }
    public void mouseClicked(MouseEvent e)
    {
        if(e.getButton()==MouseEvent.BUTTON1)
        {
            con.setBackground(Color.red);
        }
        else if(e.getButton()==MouseEvent.BUTTON3)
        {
            con.setBackground(Color.blue);
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
    public static void main(String args[])
    {
        Mousedemo2 f=new Mousedemo2();
        f.setVisible(true);
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}