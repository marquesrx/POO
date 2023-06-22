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
