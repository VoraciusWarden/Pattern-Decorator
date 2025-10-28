package decorator;

import model.Carro;

public class TapeteTresPiezas extends CarroDecorator {
    
    Carro carro;

    public TapeteTresPiezas(Carro carro) {
        this.carro = carro;
    }

    @Override
    public String getDescription() {
        return carro.getDescription() + ", Tapete Tres Piezas";
    }

    @Override
    public double cost() {
        return 92000 + carro.cost();
    }
    
}
