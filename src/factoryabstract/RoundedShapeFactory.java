package factoryabstract;

/**
 *
 * @author Drew
 */
public class RoundedShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        
        switch(shapeType) {
            case "RETANGULO":
                return new RoundedRectangle();
            case "QUADRADO":
                return new RoundedSquare();
            default:
                return null;
        }
        
    }
    
}
