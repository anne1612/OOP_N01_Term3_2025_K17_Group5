import java.util.ArrayList;
import java.util.List;

public class CustomerOrder 
{

    public String userId;
    public String orderId;

    CustomerOrder(String userId, String orderId) 
    {
        this.userId = userId;
        this.orderId = orderId;
    }

    public void displayCustomerOrder() 
    {

        System.out.println(userId);
    }

}