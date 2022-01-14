import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Model implements IModel{
    private ArrayList<MyPanel> menu=new ArrayList<MyPanel>();
    private Order lastOrder=new Order();
    private static final int LENGTH =20;

    public Order getLastOrder() {
        return lastOrder;
    }


    Model()
    {
        readMenu();

    }
    public void readMenu() {


        try {
            Scanner input = new Scanner(new File("menu.txt"));
            while (input.hasNext()) {

                String st1 = input.next();
                String st2 = input.next();
                String st3 = input.next();
                this.menu.add(new MyPanel(st1, st2, st3));

            }
            input.close();
        } catch (Exception e) {
        }




    }
    public int orderConfirmation()
    {
        Object[] options={"Confirm","Update","Delete"};
       int temp=JOptionPane.showOptionDialog(null, "Please confirm your order\n"+lastOrder,
                "Order",
                JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, options, options[0]);
                return temp;

    }
    public void orderConfirmed()
    {
        lastOrder.setCustomerName(JOptionPane.showInputDialog("Please enter your name"));
        lastOrder.openFile();
        lastOrder=new Order();
        reset();

    }
    public void orderReset()
    {
        lastOrder=new Order();
    }
    public void reset()
    {
        Iterator<MyPanel> it = menu.iterator();

        while(it.hasNext())
        {
            MyPanel temp=it.next();
            temp.box.setSelected(false);
            temp.cb.setSelectedItem("0");

        }


    }
    public void orderUpdate(String s,float num)
    {
        lastOrder.setOrder(s);
        lastOrder.setTotal(num);

    }

    public ArrayList<MyPanel> getMenu() {
        return menu;
    }
}


