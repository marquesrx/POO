# Aluno 
João Eduardo Marques


# Curso 
## Tecnologia em Análise e Desenvolvimento de Sistemas - IPFR


# Código

```
public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    // Construtor
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

```

# Teste classe Pessoa

```
public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 25, 1.75);

        System.out.println("Dados da pessoa:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Altura: " + pessoa.getAltura());

        pessoa.setNome("Maria");
        pessoa.setIdade(30);
        pessoa.setAltura(1.60);

        System.out.println("\nDados atualizados da pessoa:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Altura: " + pessoa.getAltura());
    }
}


```
