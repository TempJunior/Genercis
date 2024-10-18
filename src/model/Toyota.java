package model;

public class Toyota extends Carro{

    public Toyota(String modelo, Double preco, Integer ano, Double motor){
        super(modelo, preco, ano, motor);
    }
    @Override
    public String getMarca() {
        return "Toyota";
    }
}
