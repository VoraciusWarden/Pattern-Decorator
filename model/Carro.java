package model;

public abstract class Carro {
     String description = "Carro Desconocido";

    public String getDescription(){
        return description;
    }
    public abstract double cost();
    
}
