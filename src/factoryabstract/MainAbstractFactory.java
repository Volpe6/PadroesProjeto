package factoryabstract;

/**
 *
 * @author Drew
 */
public class MainAbstractFactory {
    
    public static void main(String[] args) {
      //get rounded shape factory
      AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
      Shape shape1 = shapeFactory.getShape("RETANGULO");
      shape1.draw();
      Shape shape2 = shapeFactory.getShape("QUADRADO");
      shape2.draw();
      
      AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
      Shape shape3 = shapeFactory1.getShape("RETANGULO");
      shape3.draw();
      Shape shape4 = shapeFactory1.getShape("QUADRADO");
      shape4.draw();
    }
    
}
