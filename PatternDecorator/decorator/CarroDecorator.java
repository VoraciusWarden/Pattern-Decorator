package decorator;

import model.Carro;

public abstract class CarroDecorator extends Carro {

    @Override
    public abstract String getDescription();

}