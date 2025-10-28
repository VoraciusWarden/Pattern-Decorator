package decorator;

import model.Carro;

public class TirodeArrastre extends CarroDecorator {
    Carro carro;

    public TirodeArrastre(Carro carro) {
        this.carro = carro;
    }

    @Override
    public String getDescription() {
        return carro.getDescription() + ", Tirode de Arrastre";
    }

    @Override
    public double cost() {
        return 810000 + carro.cost();
    }
    
}
