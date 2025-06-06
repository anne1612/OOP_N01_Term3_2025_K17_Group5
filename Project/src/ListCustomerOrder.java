import java.util.*;

public class ListCustomerOrder {
    ArrayList<CustomerOrder> co = new ArrayList<CustomerOrder>();


    public ArrayList<CustomerOrder> addObject(CustomerOrder c) {


        co.add(c);

        return co;

    }


    public void displayList() {
        for (int i = 0; i < co.size(); i++) {

            System.out.println("User ID: " + co.get(i).userId);
            System.out.println("Order ID: " + co.get(i).orderId);

        }
    }

    public static void displayList(List<CustomerOrder> co) {
        for (int i = 0; i < co.size(); i++) {

            System.out.println("User ID: " + co.get(i).userId);
            System.out.println("Order ID: " + co.get(i).orderId);

        }
    }

    public void shortList() {


        List<CustomerOrder> list = co.subList(0, 2);

        ListCustomerOrder.displayList(list);


    }

    public ArrayList<CustomerOrder> filterCustomerOrderTradition(String keyword) {
        ArrayList<CustomerOrder> newList = new ArrayList<CustomerOrder>();

        for (CustomerOrder c : co) {
            if (c.orderId.contains(keyword) || c.userId.contains(keyword)) {
                newList.add(c);

            }
        }
        return newList;

    }
}
