/*import TestUser;
import TestProduct;
import TestOrder;
import TestPayment;*/

public class Main 
{
    public static void main(String[] args) /*throws Exception*/ 
    {
        TestUser.test();
        TestProduct.main(new String[0]);
        TestOrder.main();
        TestPayment.main();
        TestTime.test();
    }
}