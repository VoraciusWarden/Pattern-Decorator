package decorator;

import model.Carro;

public class PortaBicicletas extends CarroDecorator {
    
    Carro carro;

    public PortaBicicletas(Carro carro) {
        this.carro = carro;
    }

    @Override
    public String getDescription() {
        return carro.getDescription() + ", Portabicicletas x2 puestos";
    }

    @Override
    public double cost() {
        return 910000 + carro.cost();
    }   
    
}
