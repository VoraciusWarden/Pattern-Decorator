package decorator;

import model.Carro;

public class RinCatorce extends CarroDecorator {
    private final String type;
    private final double price;
    private final Carro carro;

    public RinCatorce(Carro carro) {
        this.carro = carro;
        this.type = "Rin 14 pulgadas";
        this.price = getCostByType(type);
    }

    public RinCatorce(Carro carro, double price, String type) {
        this.carro = carro;
        this.price = price;
        this.type = type;
    }

    private double getCostByType(String type) {
        return switch (type) {
            case "Rin en aluminio de 14 pulgadas negro mecanizado" -> 500000;
            case "Rin en aluminio de 14 pulgadas gris mecanizado" -> 500000;
            default -> 0;
        };
    }

    @Override
    public String getDescription(){
        return carro.getDescription() + ", " + type;
    }
    
    @Override
    public double cost() {
        return price + carro.cost();
    }
}
