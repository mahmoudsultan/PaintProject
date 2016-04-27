/**
 * Created by Tarek Alqaddy on 4/27/2016.
 */
public class Rectangle extends Polygons{
    double width;
    double height;
    public Rectangle(double width,double height){
        super(4);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
