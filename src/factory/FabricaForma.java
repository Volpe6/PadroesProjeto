package factory;

/**
 *
 * @author Drew
 */
public class FabricaForma {
    
    public static final String RETANGULO = "RETANGULO";
    public static final String QUADRADO  = "QUADRADO";
    public static final String CIRCULO   = "CIRCULO";
    
    public Forma getForma(String tipoForma) {
        if(tipoForma == null) {
            return null;
        }
        
        switch(tipoForma) {
            case RETANGULO:
                return new Retangulo();
            case QUADRADO:
                return new Quadrado();
            case CIRCULO:
                return new Circulo();
            default:
                return null;
        }
    }
    
}
