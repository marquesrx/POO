// Classe abstrata Veiculo
public abstract class Veiculo {
    private String marca;
    private String modelo;

    // Construtor que inicializa marca e modelo
    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método abstrato para ligar o motor
    public abstract void ligarMotor();

    // Getters e setters para marca e modelo
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

// Criando um objeto Carro
Carro meuCarro = new Carro("Toyota", "Corolla");

// Criando um objeto Moto
Moto minhaMoto = new Moto("Honda", "CBR");

