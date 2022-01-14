import java.util.ArrayList;

public interface IModel {
    ArrayList<MyPanel> getMenu();
    void orderUpdate(String s,float num);
   int orderConfirmation();
    void orderConfirmed();
    void orderReset();
    void reset();
}
