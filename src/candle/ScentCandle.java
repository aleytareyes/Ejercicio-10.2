
package candle;

public class ScentCandle extends Candle{
    
    public static final int pri = 3;
    private String scent;

    public String getScent() {
        return this.scent;
    }
    public void setScent(String scent) {
        this.scent= scent;
    }
    
    public void setHeight(double Height){
        super.setHeight(height);
        setPrice(height* ScentCandle.pri);
    }
    
}
