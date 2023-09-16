// Classe Carro que herda de Veiculo
public class Carro extends Veiculo {
    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void ligarMotor() {
        System.out.println("Ligando o motor do carro " + getMarca() + " " + getModelo());
        // Implemente o código específico para ligar o motor de um carro
    }
}

// Classe Moto que herda de Veiculo
public class Moto extends Veiculo {
    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void ligarMotor() {
        System.out.println("Ligando o motor da moto " + getMarca() + " " + getModelo());
        // Implemente o código específico para ligar o motor de uma moto
    }
}
