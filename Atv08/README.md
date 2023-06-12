# Aluno 
João Eduardo Marques


# Curso 
## Tecnologia em Análise e Desenvolvimento de Sistemas - IPFR


# Código

```
import java.time.LocalDate;

public class Cliente {
    private int codigo;
    private String nome;
    private LocalDate dataNascimento;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    private String email;
    private String numeroCartaoCredito;
    
    // Construtor
    public Cliente(int codigo, String nome, LocalDate dataNascimento, String endereco, String cidade,
                   String estado, String cep, String email, String numeroCartaoCredito) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.email = email;
        this.numeroCartaoCredito = numeroCartaoCredito;
    }
    
    // Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroCartaoCredito() {
        return numeroCartaoCredito;
    }

    public void setNumeroCartaoCredito(String numeroCartaoCredito) {
        this.numeroCartaoCredito = numeroCartaoCredito;
    }

    // Método toString para exibir os detalhes do cliente
    @Override
    public String toString() {
        return "Cliente [codigo=" + codigo + ", nome=" + nome + ", dataNascimento=" + dataNascimento +
                ", endereco=" + endereco + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep +
                ", email=" + email + ", numeroCartaoCredito=" + numeroCartaoCredito + "]";
    }
}

-------------------------------------------------------------------------------------------------------------------------

import java.time.LocalDate;

public class CadastroDeClientes {
    public static void main(String[] args) {
        // Criando um objeto Cliente
        Cliente cliente = new Cliente();

        // Preenchendo os atributos do cliente
        cliente.setCodigo(1);
        cliente.setNome("João");
        cliente.setDataNascimento(LocalDate.of(1990, 5, 15));
        cliente.setEndereco("Rua A, 123");
        cliente.setCidade("São Paulo");
        cliente.setEstado("SP");
        cliente.setCep("01234-567");
        cliente.setEmail("joao@email.com");
        cliente.setNumeroCartaoCredito("1234-5678-9012-3456");

        // Exibindo os detalhes do cliente
        System.out.println("Detalhes do cliente:");
        System.out.println("Código: " + cliente.getCodigo());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Data de Nascimento: " + cliente.getDataNascimento());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Cidade: " + cliente.getCidade());
        System.out.println("Estado: " + cliente.getEstado());
        System.out.println("CEP: " + cliente.getCep());
        System.out.println("E-mail: " + cliente.getEmail());
        System.out.println("Número do Cartão de Crédito: " + cliente.getNumeroCartaoCredito());
    }
}


```
