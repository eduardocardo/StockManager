import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<Product>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {
        int cont = 0;
        boolean findProduct = false;        // producto no encontrado
        while((cont < stock.size()) && (findProduct == false))  
        {
            Product product = stock.get(cont);
            if(product.getID() == id)
            {
                product.increaseQuantity(amount);
                findProduct = true;
            }
            cont++;
        }
    }
    
    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {
        Product producto = null;
        int cont = 0;
        while(cont < stock.size() && (producto == null) )  //recorremos toda la coleccion de productos
        {
            Product item = stock.get(cont);
            if(item.getID()==id)  // si el id de algun producto coincide con el introducido por parametro
            {
                producto = item ; //almacenamos ese producto en la variable local
            }
            cont++;                       
        }
        return producto ;
    }
    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
        int producto = 0;  
        int cont = 0;
        boolean findProduct = false;    //no encuentra el producto
        while(cont< stock.size() && findProduct == false)      //recorremos la coleccion de objetos 
        {
            Product item = stock.get(cont);   
            if(item.getID()==id)       //si la id de un objeto coincide con la id metida por parametro
            {
                producto = item.getQuantity(); // guardamoso en la variable local la cantida de esa objeto
                findProduct = true;
            }
            cont++;
        }
        return producto;
    }

    /**
     * Print details of all the products.
     */
    public void printProductDetails()
    {
        for(Product product : stock)   //recorremos toda la coleccion
        {
            System.out.println(product.toString());  //imprimimos los detalles de cada objeto de la coleccion
        }
    }
    
    /**
     * Metodo que imprime por pantalla los detalles de los productos cuya cantidad en stock
     * sea menor del parametro que le introducimos
     */
    public void printProductDetailsBelowStock(int amount)
    {
        for(Product product : stock)   //recorremos la coleccion de objetos
        {
            if(product.getQuantity()<amount)  //comprobamos que la cantidad de un objeto sea menor que el parametro
            {
                System.out.println(product.toString());   //imprimimos los detalles
            }
        }
    }
}
