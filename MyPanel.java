import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    private JTextField m_totalTf    = new JTextField();
    JLabel name ;
    JLabel type ;
    JLabel costP ;
    float cost;
    JCheckBox box;
    JComboBox cb;



        public MyPanel(String name1,String type,String cost)
        {
           this.setLayout(new GridLayout(1,5));
           box=new JCheckBox();
            String nums[]={"0","1","2","3","4","5","6","7","8","9","10"};
            cb=new JComboBox(nums);
            this.setVisible(true);
            this.cost=Integer.parseInt(cost);
            this.name=new JLabel(name1);
            this.type=new JLabel(type);
            this.costP=new JLabel(cost);
            this.add(box);
            this.add(this.name);
            this.add(this.type);
            this.add(this.costP);
            this.add(cb);


        }


        protected void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            this.setVisible(true);


    }
}
