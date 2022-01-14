import java.awt.event.ActionListener;
import java.util.ArrayList;

public interface IView {
    void addOrderListener(ActionListener mal) ;
     void setMenu(ArrayList<MyPanel> menu);
      void addPanel(BigPanel menu);

}
