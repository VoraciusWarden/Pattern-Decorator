package decorator;

import model.Carro;

public class PernosdeSeguridad extends CarroDecorator {
    Carro carro;

    public PernosdeSeguridad(Carro carro) {
        this.carro = carro;
    }

    @Override
    public String getDescription() {
        return carro.getDescription() + ", Pernos de Seguridad";
    }

    @Override
    public double cost() {
        return 156100 + carro.cost();
    }
    
}
