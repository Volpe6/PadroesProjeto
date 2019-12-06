package facede;

/**
 *
 * @author Drew
 */
public class ShapeMaker {
    
    private Shape circle;
    private Shape retangle;
    private Shape square;
    
    public ShapeMaker() {
        circle   = new Circle();
        retangle = new Rectangle();
        square   = new Square();
    }
    
    public void drawCircle(){
       circle.draw();
    }
    public void drawRectangle(){
       retangle.draw();
    }
    public void drawSquare(){
       square.draw();
    }
    
}
