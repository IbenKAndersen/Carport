package LogicLayer;

import DataLayer.OrderMapper;

/**
 *
 * @author ibenk
 */
public class Calculator {

    private OrderMapper mapper;

    /**
     * This method returns the number of posts needed to make the input carport
     */
    public static int getPosts(Carport carport) {
        /* One side of the carport automatically has 1 post at each end */
        int auto = 2;
        
        int posts = carport.getLength()/100;
        
        return (auto + posts) * 2 ;
    }

    /**
     * This method returns the number of wooden boards needed to make the roof
     * of the input carport
     */
    public static int getRoof(Carport carport) {

        return 0;
    }

    /**
     * This method returns the number of wooden boards needed to make 1 side of
     * the input carport
     */
    public static int getSide(Carport carport) {

        return 0;
    }

}
