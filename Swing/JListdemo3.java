import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class JListdemo3 extends JFrame implements ActionListener
{
    JButton b12=new JButton(">>");
    JButton b21=new JButton("<<");
    DefaultListModel model1=new DefaultListModel();
    JList ls1=new JList(model1);
    DefaultListModel model2=new DefaultListModel();
     JList ls2=new JList(model2);
    public JListdemo3()
    {
        JScrollPane js1 = new JScrollPane(ls1);
        JScrollPane js2 = new JScrollPane(ls2);
        setLayout(new FlowLayout());
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p1.add(js1);
        JPanel p3 = new JPanel();
        p3.setLayout(new FlowLayout());
        p3.add(js2);
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(2, 1));
        p2.add(b12);
        p2.add(b21);
        add(p1);
        add(p2);
        add(p3);
        b12.addActionListener(this);
        b21.addActionListener(this);
        model1.addElement("C");
        model1.addElement("Java");
        model1.addElement("Cpp");
        model1.addElement("PHP");
        model2.addElement("Mac os");
        model2.addElement("Linux");
        model2.addElement("Apple");
        model2.addElement("Windows");
        ls1.setFixedCellHeight(20);
        ls1.setFixedCellWidth(100);
        ls2.setFixedCellHeight(20);
        ls2.setFixedCellWidth(100);
        ls1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        ls2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }

     public void actionPerformed(ActionEvent e)
     {
         String str;
         if (e.getSource() == b12) {
             str = (String) ls1.getSelectedValue();
             model2.addElement("" + str);
         } else if (e.getSource() == b21) {
             str = (String) ls2.getSelectedValue();
             model1.addElement("" + str);
         }
     }
     public static void main(String[] args) {
         JListdemo3 f = new JListdemo3();
         f.setSize(3000,3000);
         f.setVisible(true);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }

}
