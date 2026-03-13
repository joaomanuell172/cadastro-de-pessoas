public class Main {
    public static void main(String[] args) {

        Funcionario func = new Funcionario("Ana Paula", 30, 5000.0);
        Cliente cli = new Cliente("Roberto Silva", 45, "10/01/2023");

        Pessoa p1 = func;
        Pessoa p2 = cli;

        System.out.println("--- Dados do Funcionário ---");
        p1.exibirDados(); 

        System.out.println("\n--- Dados do Cliente ---");
        p2.exibirDados(); 
    }
}
