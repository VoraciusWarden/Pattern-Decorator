import decorator.*;
import model.*;

public class Test {
    public static void main(String[] args) {

        // *Este es el primer pedido:*

        Carro pedido1 = new VibrantMT();

        pedido1 = new AlarmaMatrix(pedido1);
        pedido1 = new MalladeCarga(pedido1);
        pedido1 = new TapeteTresPiezas(pedido1);

        System.out.println("Pedido 1: Vibrant MT");
        System.out.println("Descripción: " + pedido1.getDescription());
        System.out.println("Costo total: " + "$" + (long)pedido1.cost()); 
        


        // *Pedido 2:*
        Carro pedido2 = new ZenithMT();
        
        pedido2 = new SensordeParqueo(pedido2);
        pedido2 = new RinTrece(pedido2);

        System.out.println("Pedido 2: Zenith MT");
        System.out.println("Descripción: " + pedido2.getDescription());
        System.out.println("Costo total: " + "$" + (long)pedido2.cost());

        // *Pedido 3:*
        Carro pedido3 = new ZenithAT();
    
        pedido3 = new PernosdeSeguridad(pedido3);
        pedido3 = new AlarmaMatrix(pedido3);
        pedido3 = new Kit(pedido3);

        System.out.println("Pedido 3: Zenith AT");
        System.out.println("Descripción: " + pedido3.getDescription());
        System.out.println("Costo total: " + "$" + (long)pedido3.cost());

        // *Pedido 4:*

        Carro pedido4 = new GTLineAT();
        
        pedido4 = new Kit(pedido4);
        pedido4 = new TirodeArrastre(pedido4);

        System.out.println("Pedido 4: GT Line AT");
        System.out.println("Descripción: " + pedido4.getDescription());
        System.out.println("Costo total: " + "$" + (long)pedido4.cost());
    }
}