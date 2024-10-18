package model;

public class Honda extends Carro {

    public Honda(String modelo, Double preco, Integer ano, Double motor){
        super(modelo, preco, ano, motor);
    }

    @Override
    public String getMarca() {
        return "Honda";
    }
}
