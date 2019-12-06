package factory;

/**
 *
 * @author Drew
 */
public class MainForma {
    
    public static void main(String[] args) {
        FabricaForma oFab = new FabricaForma();
        
        Forma circulo = oFab.getForma(FabricaForma.CIRCULO);
        Forma quForma = oFab.getForma(FabricaForma.QUADRADO);
        Forma reForma = oFab.getForma(FabricaForma.RETANGULO);
        
        circulo.draw();
        quForma.draw();
        reForma.draw();
    }
    
}
