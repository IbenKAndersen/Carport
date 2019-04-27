/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicLayer;

/**
 *
 * @author Benjamin
 */
public class Carport {
    
    private final int height; //measured in centimeters.
    private final int length; //measured in centimeters.
    private final int width; //measured in centimeters.
    private final boolean toolshed; //false when toolshed is not opted
    private final String details; //details on carport

    public Carport(int height, int length, int width, boolean toolshed, String details) {
        this.height = height;
        this.length = length;
        this.width = width;
        this.toolshed = toolshed;
        this.details = details;
    }
    
    public Carport(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
        toolshed = false;
        details = "";
    }

    public int getHeight() {
        return height;
    }
    
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
    
    
    public String getDetails() {
        return details;
    }


    public boolean hasToolshed() {
        return toolshed;
    }

    @Override
    public String toString() {
        return "Carport{" + "toolshed=" + toolshed + ", details=" + details;
    }
    
}
