public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    public void exibirDados() {
        System.out.println("--- Dados da Pessoa ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade + " anos");
    }
}
