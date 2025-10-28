package decorator;

import model.Carro;

public class Kit extends CarroDecorator {
    Carro carro;


    public Kit(Carro carro) {
        this.carro = carro;
    }

    @Override
    public String getDescription() {
        return carro.getDescription() + ", Kit de boton encendido + alarma + 2 controles tipo disparador";
    }

    @Override
    public double cost() {
        return 1500000 + carro.cost();
    }
    
}
