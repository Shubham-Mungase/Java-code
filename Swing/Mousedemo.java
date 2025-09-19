import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Mousedemo extends JFrame
implements MouseListener ,MouseMotionListener
{
    Container con;
    public Mousedemo()
    {
        con=getContentPane();
        con.setLayout(new FlowLayout());
        con.addMouseListener(this);
        con.addMouseMotionListener(this);
    }
    public void mouseClicked(MouseEvent e)
    {
        con.setBackground(Color.red);
    }
    public void mousePressed(MouseEvent e2)
    {
       con.setBackground(Color.yellow);
    }
    public void mouseReleased(MouseEvent e3)
    {
        con.setBackground(Color.green);
    }
    public void mouseEntered(MouseEvent e4)
    {
        con.setBackground(Color.blue);
    }
    public void mouseExited(MouseEvent e5)
    {
        con.setBackground(Color.orange);
    }
    public void mouseMoved(MouseEvent e5)
    {
       // con.setBackground(Color.gray);
    }
    public void mouseDragged(MouseEvent e6)
    {
        con.setBackground(Color.pink);
    }
    public static void main(String args[])
    {
        Mousedemo f=new Mousedemo();
        f.setVisible(true);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}