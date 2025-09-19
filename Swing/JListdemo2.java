import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JListdemo2 extends JFrame implements ActionListener {
    JButton b12 = new JButton();
    JButton b21 = new JButton();
    DefaultListModel model1 = new DefaultListModel();
    JList ls1 = new JList(model1);
    DefaultListModel model2 = new DefaultListModel();
    JList ls2 = new JList(model2);

    public JListdemo2()
    {
        JScrollPane js1 = new JScrollPane(ls1);
        JScrollPane js2 = new JScrollPane(ls2);
        setLayout(null);
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p1.add(js1);
        JPanel p3 = new JPanel();
        p3.setLayout(new FlowLayout());
        p3.add(js2);
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(2, 1, 10, 10));
        p2.add(b12);
        p2.add(b21);
        p1.setBounds(100, 100, 200, 300);
        add(p1);
        p2.setBounds(320, 150, 50, 80);
        add(p2);
        p3.setBounds(380, 100, 200, 300);
        add(p3);
        b12.addActionListener(this);
        b21.addActionListener(this);
        model1.addElement("C");
        model1.addElement("JAVA");
        model1.addElement("PHP");
        model1.addElement("Cpp");
        model2.addElement("VB");
        model2.addElement("MAC");
        model2.addElement("Windows");
        model2.addElement("Apple");
        ls1.setLayout(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        ls2.setLayout(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

    }

    public void addActionListener(ActionEvent e)
    {
        Object obj[];
        if (e.getSource() == b12) {
            obj = ls1.getSelectedValue();
            for (int i = 0; i < obj.length; i++) {
                model2.addElement("" + obj[i]);
            }
        } else if (e.getSource()) {
            obj = ls2.getSelectedValue();
            for (int i = 0; i < obj.length; i++) {
                model1.addElement("" + obj[i]);
            }
        }
    }
    public static void main(String[] args) {
        JListdemo2 f = new JListdemo2();
        f.setVisible(true);
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
