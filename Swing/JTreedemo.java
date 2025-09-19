import java.awt.*;
import java.swing.*;
import java.swing.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.*;
public class JTreedemo extends JFrame implements TreeSelectionListener
{
    JTree tr;
    JLabel l1;

    public JTreedemo()
    {
        DefaultMutableTreeNode top = new DefaultMutableTreeNode("Course");
        DefaultMutableTreeNode th = new DefaultMutableTreeNode("Hardware");
        DefaultMutableTreeNode th1 = new DefaultMutableTreeNode("Os");
        DefaultMutableTreeNode th2 = new DefaultMutableTreeNode("nt");
        DefaultMutableTreeNode ts = new DefaultMutableTreeNode("Software");
        DefaultMutableTreeNode ts1= new DefaultMutableTreeNode("C");
        DefaultMutableTreeNode ts2 = new DefaultMutableTreeNode("Cpp");
        top.add(th);
        top.add(ts);
        th.add(th1);
        th.add(th2);
        ts.add(ts1);
        ts.add(ts2);
        tr = new JTree(top);
        JScrollPane jsc = new JScrollPane(tr);
        Container con = getContentPane();
        con.setLayout(new FlowLayout());
        con.add(jsc);
        l1 = new JLabel();
        con.add(l1); 
        tr.addTreeSelectionListener(this);
        tr.addTreeSelectionListener(new TreeSelectionListener() {
            public void valueChanged(TreeSelectionEvent e)
            {
                l1.setText(""+getPath());
            }
        });
        public void valueChanged name() {
            
        }(TreeSelectionEvent e) {

            l1.setText(""+e.getPath());
        }


    }
    public static void main(String[] args) {
        JTreedemo f = new JTreedemo();
        f.setVisible(true);
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}