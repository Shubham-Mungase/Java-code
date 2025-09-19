import java.awt.*;
import javax.swing.*;
public class Gridbaglayout extends JFrame
{
    JButton ba=new JButton("Add");
    JButton bs=new JButton("Sub");
    JButton bm=new JButton("Mul");
    JButton bd=new JButton("Div");
    public Gridbaglayout()
    {
        GridBagLayout gridbag=new GridBagLayout();
        GridBagConstraints c=new GridBagConstraints();
        setLayout(gridbag);
        c.fill=GridBagConstraints.HORIZONTAL;
        c.weightx=0.5;
        c.gridx=0;
        c.gridy=0;
        gridbag.setConstraints(ba,c);
        add(ba);
        c.gridx=1;
        c.gridy=0;
        gridbag.setConstraints(bs,c);
        add(bs);
        c.gridx=2;
        c.gridy=0;
        gridbag.setConstraints(bm,c);
        add(bm);
        c.ipady=40;
        c.weightx=0.0;
        c.gridwidth=2;
        c.gridx=0;
        c.gridy=1;
        gridbag.setConstraints(bd,c);
        add(bd);
        JButton bequ=new JButton("Equal");
        c.ipady=0;
        c.weighty=1.0;
        c.anchor=GridBagConstraints.EAST;
        c.insets=new Insets(10,0,0,10);
        c.gridx=1;
        c.gridwidth=2;
        c.gridy=2;
        gridbag.setConstraints(bequ,c);
        add(bequ);

    }
    public static void main(String [] args)
    {
        Gridbaglayout obj=new Gridbaglayout();
        obj.setVisible(true);
        obj.setSize(1000,1000);
    }
}
