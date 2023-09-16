// Classe abstrata Veiculo
public abstract class Veiculo {
    private String marca;
    private String modelo;

    // Construtor
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
