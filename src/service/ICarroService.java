package service;

import model.Carro;

import java.util.List;

public interface ICarroService<T extends Carro>{
    List<T> listarTodos();
    void adicionarCarro(T elemento);
}
