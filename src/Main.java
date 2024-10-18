import controler.CarroController;
import model.Honda;
import model.Toyota;

public class Main {
    public static void main(String[] args) {
        CarroController controller = new CarroController();

        controller.adicionaCarro(new Honda("Civic coupe",200.000, 2024, 2.0));
        controller.adicionaCarro(new Toyota("Etios",400.000, 2022, 1.8));

        controller.listarCarros();
    }
}