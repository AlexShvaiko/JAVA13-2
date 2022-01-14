import javax.swing.*;
import java.awt.*;

public class HeaderPanel extends JPanel {
    JLabel name =new JLabel("Name") ;
    JLabel type =new JLabel("Type");
    JLabel costP = new JLabel("Cost");
    JLabel amount  = new JLabel("Amount ");
    private static final int COLS=4;
   public HeaderPanel ()
   {
       this.setVisible(true);
       this.setLayout(new GridLayout(1,COLS));
       JCheckBox c1=new  JCheckBox();
       c1.setVisible(false);
       this.add(c1);
       this.add(this.name);
       this.add(this.type);
       this.add(this.costP);
       this.add(amount);

   }
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        this.setVisible(true);




    }
}
