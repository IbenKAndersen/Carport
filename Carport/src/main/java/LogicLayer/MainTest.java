package LogicLayer;

/**
 *
 * @author ibenk
 */
public class MainTest {
    
    public static void main(String[] args) {
    
        /* Test carport with height, length, width */
        Carport carport = new Carport(230, 420, 170);
        
        //This works
        //System.out.println(Calculator.getPosts(carport));
        
        //This works
        System.out.println(Calculator.getRoof(carport));
        
        
    }
    
}
