package factoryabstract;

/**
 *
 * @author Drew
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        
        switch(shapeType) {
            case "RETANGULO":
                return new Rectangle();
            case "QUADRADO":
                return new Square();
            default:
                return null;
        }
        
    }
    
}
