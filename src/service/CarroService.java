package service;

import model.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroService<T extends Carro> implements ICarroService<T>{
    List<T> carros = new ArrayList<>();
    @Override
    public List<T> listarTodos() {
        return carros;
    }

    @Override
    public void adicionarCarro(T elemento) {
        carros.add(elemento);
    }
}
