import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class View extends JFrame implements IView{
    private IModel m_model;
    private ArrayList<MyPanel> menu;
    private JButton    order = new JButton("Order");
    private JPanel host=new JPanel();

View(IModel model)
{
    this.setVisible(true);
    m_model = model;
    GridLayout layout=new GridLayout();
    HeaderPanel hPanel=new HeaderPanel();
    JPanel host=new JPanel();
    BoxLayout layout1=new BoxLayout(host,BoxLayout.Y_AXIS);
    host.setLayout(layout1);
    this.add(host);
    this.setLayout(layout);
    host.add(hPanel);
    host.add(new BigPanel(model.getMenu()));
    host.add(order);
    this.pack();
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}

    public void addOrderListener(ActionListener mal) {
        order.addActionListener(mal);

    }
public void addPanel(BigPanel menu)
{
    this.add(menu);
}
    public void setMenu(ArrayList<MyPanel> menu) {
        this.menu = menu;
    }
}
