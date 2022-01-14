import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Order {
    private String order;
    private float total;
    private String customerName;

    public Order(String order, float total, String customerName) {
        this.order = order;
        this.total = total;
        this.customerName = customerName;
    }

    public Order() {
        this.order = "";
        this.total = 0;
        this.customerName = "";
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = this.order + order;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = this.total + total;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return
                order + "\n" +
                        " total=" + total;
    }

    public void openFile() {

        try {
            PrintWriter order = new PrintWriter(this.customerName+".txt", "UTF-8");
            order.print(this);
            order.close();

        } catch (IOException e) {
        }
    }
}