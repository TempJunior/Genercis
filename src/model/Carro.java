package model;

public abstract class Carro {
    private String modelo;
    private Double preco;
    private Integer ano;
    private Double motor;

    public Carro(String modelo, Double preco, Integer ano, Double motor) {
        this.modelo = modelo;
        this.preco = preco;
        this.ano = ano;
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Double getMotor() {
        return motor;
    }

    public void setMotor(Double motor) {
        this.motor = motor;
    }

    public abstract String getMarca();

}
