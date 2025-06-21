public class Commit1 {
    public static void main(String[] args) {
        InfoUsuario user = new InfoUsuario(); // Criar objeto
        user.nome = "Ze Zinho"; // Atribuir valores
        user.idade = 18;
        user.infor(); // Chamar os metodos
        user.verificadorDeIdade(); // Print: Maior de idade
    }
}

class InfoUsuario {
    String nome;
    int idade;

    void infor() {
        System.out.println("Olá " + nome + " de " + idade + " anos");
    }

    void verificadorDeIdade() {
        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }
    }
}
