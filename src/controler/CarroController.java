package controler;

import model.Carro;
import service.CarroService;
import service.ICarroService;

public class CarroController {
    private ICarroService<Carro> carroService = new CarroService<>();

    public void listarCarros(){
        for (Carro carro : carroService.listarTodos()) {
            System.out.println("Marca: " + carro.getMarca() + ", Modelo: " + carro.getModelo() + ", Ano: " + carro.getAno() + ", Motor: " + carro.getMotor());
        }
    }

    public void adicionaCarro(Carro carro){
        carroService.adicionarCarro(carro);
    }
}
