package decorator;

import model.Carro;

public class MalladeCarga extends CarroDecorator {
    Carro carro;

    public MalladeCarga(Carro carro) {
        this.carro = carro;
    }

    @Override
    public String getDescription() {
        return carro.getDescription() + ", Malla de Carga";
    }

    @Override
    public double cost() {
        return 110000 + carro.cost();
    }
}
