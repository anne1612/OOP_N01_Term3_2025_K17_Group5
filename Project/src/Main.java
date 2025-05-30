/*import TestUser;
import TestProduct;
import TestOrder;
import TestPayment;*/

import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args) /*throws Exception*/ 
    {
        TestProduct.main(new String[0]);
        
        TestPayment.main();
        TestTime.test();
        TestUser.test();

        TestUser us = new TestUser();
        us.testEdit();
 
        TestUser.testRegisterUser();


    }
}