package decorator;

import model.Carro;

public class RinTrece extends CarroDecorator {
    Carro carro;

    public RinTrece(Carro carro) {
        this.carro = carro;
    }

    @Override
    public String getDescription() {
        return carro.getDescription() + ", Rin en aluminio de 13\" ";
    }

    @Override
    public double cost() {
        return 350000 + carro.cost();
    }
    
}
