package decorator;

import model.Carro;

public class SensordeParqueo extends CarroDecorator {
    Carro carro;

    public SensordeParqueo(Carro carro) {
        this.carro = carro;
    }

    @Override
    public String getDescription() {
        return carro.getDescription() + ", Sensor de Parqueo";
    }

    @Override
    public double cost() {
        return 150000 + carro.cost();
    }
    
}
