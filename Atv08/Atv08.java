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
    
    @Override
    public String toString() {
        return "Cliente [codigo=" + codigo + ", nome=" + nome + ", dataNascimento=" + dataNascimento +
                ", endereco=" + endereco + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep +
                ", email=" + email + ", numeroCartaoCredito=" + numeroCartaoCredito + "]";
    }
   
}
