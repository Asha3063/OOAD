
package lab5;

import lab5.Triangle;
import lab5.Shape;
import lab5.Rectangle;

public class TestAbstract {
    public static void main(String[] args) {
        Shape r=new Rectangle(12,10);
        r.area();
        Shape t =new Triangle(4,5.2);
        r.area();
        
        
    }
    
}
