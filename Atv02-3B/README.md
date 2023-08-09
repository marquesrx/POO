
# Aluno 
João Eduardo Marques


# Curso 
## Tecnologia em Análise e Desenvolvimento de Sistemas - IPFR


# Código

```
class Pessoa {
    protected String nome;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
}

class PessoaFisica extends Pessoa {
    private String rg;
    
    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public String getRg() {
        return rg;
    }
}

class PessoaJuridica extends Pessoa {
    private String cnpj;
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public String getCnpj() {
        return cnpj;
    }
}

class Funcionario extends PessoaFisica {
    private String cartao;
    
    public void setCartao(String cartao) {
        this.cartao = cartao;
    }
    
    public String getCartao() {
        return cartao;
    }
}


public class TestClassStructure {
    public static void main(String[] args) {
        // Testando a classe Pessoa
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        System.out.println("Nome da pessoa: " + pessoa.getNome());

        // Testando a classe PessoaFisica
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Maria");
        pessoaFisica.setRg("123456789");
        System.out.println("Nome da pessoa física: " + pessoaFisica.getNome());
        System.out.println("RG da pessoa física: " + pessoaFisica.getRg());

        // Testando a classe PessoaJuridica
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Empresa ABC");
        pessoaJuridica.setCnpj("987654321");
        System.out.println("Nome da pessoa jurídica: " + pessoaJuridica.getNome());
        System.out.println("CNPJ da pessoa jurídica: " + pessoaJuridica.getCnpj());

        // Testando a classe Funcionario
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Pedro");
        funcionario.setRg("987654321");
        funcionario.setCartao("123");
        System.out.println("Nome do funcionário: " + funcionario.getNome());
        System.out.println("RG do funcionário: " + funcionario.getRg());
        System.out.println("Cartão do funcionário: " + funcionario.getCartao());
    }
}


```
