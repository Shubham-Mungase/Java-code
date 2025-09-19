import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Mousedemo3 extends JFrame
{
    JLabel tx=new JLabel("Mouse clicked");
    public Mousedemo3()
    {
        setLayout(new FlowLayout());
        add(tx);
        addMouseListener(new M());
    }
    /*public class M implements MouseListener
    {
        public void mouseClicked(MouseEvent e)
        {
            if(e.getClickCount()==1)
            {
                tx.setText("Click no times=1");
            }
            else if(e.getClickCount()==2)
            {
            	tx.setText("Click no times=2");
            	
            }
            
        }
        public void mousePressed(MouseEvent e)
        {}
        public void mouseReleased(MouseEvent e)
        {}
        public void mouseEntered(MouseEvent e)
        {}
        public void mouseExited(MouseEvent e)
        {}
    }*/
    public class M extends MouseAdapter
    {
    		public void mouseClicked(MouseEvent e)
    		{
    			if(e.getClickCount()==1)
    			{
    				tx.setText("Click no of =1");
    			}
    			else if(e.getClickCount()==2)
    			{
    				tx.setText("Click no of =2");
    			}		
    		}
    }
    
    public static void main(String [] args)
    {
   		Mousedemo3 f= new Mousedemo3();
   		f.setVisible(true);
   		f.setSize(300,300);
   		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
