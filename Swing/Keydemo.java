import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Keydemo extends JFrame
implements KeyListener
{
    JTextField tx=new JTextField(100);
    public Keydemo()
    {
        setLayout(new FlowLayout());
        add(tx);
        tx.addKeyListener(this);

    }
    public void keyTyped(KeyEvent e)
    {
        tx.setText("Key Typed="+e.getKeyChar());
    }
    public void keyPressed(KeyEvent e1)
    {
        tx.setText("Key Pressed ="+e1.getKeyChar());
    }
    public void keyReleased(KeyEvent e2)
    {
      //  tx.setText("Key Realesed ="+e2.getKeyChar());
    }
    public static void main(String args[])
    {
        Keydemo f=new Keydemo();
        f.setVisible(true);
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}