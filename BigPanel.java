import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class BigPanel extends JPanel {
    public BigPanel(ArrayList<MyPanel> menu){
        this.setVisible(true);
        BoxLayout layout=new BoxLayout(this,BoxLayout.Y_AXIS);
        this.setLayout(layout);

        Iterator<MyPanel> it = menu.iterator();

        while(it.hasNext())
        {
            this.add(it.next());

        }



    }
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        this.setVisible(true);


    }

}
