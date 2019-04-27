package LogicLayer;

import DataLayer.OrderMapper;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ibena
 */
public class Calculator {

    private OrderMapper mapper;

    /**
     * This method returns the number of posts needed to make the input carport.
     * Calculates for 1 side and multiplies in the end.
     */
    public static int getPosts(Carport carport) {
        /* One side of the carport automatically has 1 post at each end */
        int auto = 2;

        /* Dividing by 100 gives the number of spaces, by substracting 1 you get
        the number of splitters/poles between the poles in the ends.
        Math.max makes sure that posts cannot be negative. */
        int posts = Math.max((carport.getLength() / 100) - 1,0);

        return (auto + posts) * 2;
    }

    /**
     * This method returns the number of wooden boards needed to make the roof
     * of the input carport.
     * For each post on 1 side there has to be on wooden board across the roof.
     */
    public static int getRoof(Carport carport) {
        int totalBoards;
        
        /* Defining the size of a wooden board, get numbers from database */
        int woodLength = 100; 
        int woodWidth = 10;       
        
        /* This if statement only runs if the carport has a pointy roof*/
        if (carport.hasPointyRoof()) {
            return 0;
        } else {
            /* How many wooden boards can fit in the width? */
            int boardsInWidth = carport.getWidth()/woodWidth;
            
            /* How many wooden boards can fit in the length? */
            int boardsInLength = carport.getLength()/woodLength;
            
            int rest = carport.getLength()%woodLength;
            
            /* The number of wooden boards on a flat roof using as little wood 
            as possible */
            if (rest == 0) {
                totalBoards = boardsInWidth*boardsInLength;
            } else {
                /* Making sure that you get a whole wood board even though you 
                might only need a fraction of it */
                double reuseBoards = (double) (rest*boardsInWidth)/woodLength;
                int rounded = (int) Math.ceil(reuseBoards);

                totalBoards = boardsInWidth*boardsInLength+rounded;
            }
            return totalBoards;
        }
    }

    /**
     * This method returns the number of wooden boards needed to make 1 side of
     * the input carport.
     */
    public static int getSide(Carport carport) {
        /* Defining the size of a wooden board */
        int woodLength = 100; 
        int woodWidth = 10; 
        
        
        
        return 0;
    }
    
    /**
     * This method returns the number of screws needed for 1 wooden board.
     */
    public static int getScrews(Carport carport) {
        
        return 0;
    }

    /**
     * This method returns a list of all material needed for the input carport.
     */
    public static List getAllMaterial(Carport carport) {
        List material = new ArrayList<>();
        
        
        
        return material;
    }
    
    /**
     * This method returns the total price of the input carport.
     * Material prices are in the database.
     */
    public static double getTotalPrice(Carport carport) {
        
        return 0;
    }
    
}
