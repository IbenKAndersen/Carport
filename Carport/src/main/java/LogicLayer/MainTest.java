package LogicLayer;

/**
 *
 * @author ibenk
 */
public class MainTest {
    
    public static void main(String[] args) {
    
        /* Test carport with height, length, width */
        Carport carport = new Carport(225, 400, 200);
        
        Calculator.getPosts(carport);
        //Calculator.getRoof(carport);
        
        
    }
    
}
