
package candle;

import java.awt.Color;

public class Candle {
    private Color color;
    private double height;
    public static final int pri = 2;
    private int price;
    public Color getColor() {
        return this.color;
    }
    public double getHeight() {
        return this.height;
    }
    public int getPrice() {
        return this.price;
    }
    public void setColor(Color color){
        this.color = color;
    }
    public void setHeight(double height){
        setPrice(height*pri);
        this.height = height;
    }
    protected void setPrice(double price){
        this.price = (int)price;
    }
    }

