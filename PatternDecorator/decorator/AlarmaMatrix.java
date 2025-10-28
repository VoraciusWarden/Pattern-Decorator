package decorator;

import model.Carro;

public class AlarmaMatrix extends CarroDecorator {
    Carro carro;

    public AlarmaMatrix(Carro carro) {
        this.carro = carro;
    }

    @Override
    public String getDescription() {
        return carro.getDescription() + ", Alarma Matrix";
    }

    @Override
    public double cost() {
        return 205000 + carro.cost();
    }
    
}
