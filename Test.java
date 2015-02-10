import java.util.ArrayList;
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        
    }

    /**
     * 
     */
    public void test1()
    {
        StockManager stockManager = new StockManager();
        
        stockManager.addProduct(new Product(1,"peras"));
        stockManager.addProduct(new Product(2,"manzanas"));
        stockManager.addProduct(new Product(3,"platanos"));
        stockManager.addProduct(new Product(4,"naranjas"));
        
        stockManager.delivery(1,4);
        stockManager.delivery(2,1);
        stockManager.delivery(3,4);
        stockManager.delivery(4,2);
        
        stockManager.printProductDetailsBelowStock(3);
    }
}
