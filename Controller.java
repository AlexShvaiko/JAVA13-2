import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Controller implements IController{
    private IModel m_model;
    private IView  m_view;
    private  ArrayList<MyPanel>menu;
    private static final int  CONFIRM=0;
    private static final int UPDATE=1;
    private static final int DELETE=2;



    Controller(IModel model, IView view) {
        m_model = model;
        m_view = view;
        view.addOrderListener(new Listener());
        menu=model.getMenu();



    }

class Listener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        Iterator<MyPanel> it = menu.iterator();
        MyPanel temp;

        while(it.hasNext())
        {
            temp=it.next();
            if(temp.box.isSelected()&&!((String)temp.cb.getSelectedItem()).equals("0"))
            {
                m_model.orderUpdate(temp.name.getText()+" X "+temp.cb.getSelectedItem()+"\n",temp.cost*(Integer.parseInt((String) temp.cb.getSelectedItem())));
            }


        }
       int confrimation= m_model.orderConfirmation();
        if(confrimation==CONFIRM)
        {
            m_model.orderConfirmed();
        }
        if(confrimation==UPDATE||confrimation==JOptionPane.CLOSED_OPTION)
        {
            m_model.orderReset();
            return;
        }
        if(confrimation==DELETE)
        {
            m_model.orderReset();
            m_model.reset();

        }


    }

}}
