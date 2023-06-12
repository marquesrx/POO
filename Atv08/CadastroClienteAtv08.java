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
