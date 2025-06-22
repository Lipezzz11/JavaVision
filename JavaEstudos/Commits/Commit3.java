public class Commit3 {
    public static void main(String[] args) {
        System.out.println("==== SISTEMA DE CRÉDITOS ====\n");

        // Criando usuários
        Info user1 = new Info("Zezinho", 18);
        Info user2 = new Info("Lipe", 18);

        System.out.println("-- Usuários --");
        user1.exibirInfo();
        user2.exibirInfo();

        // Criando carteiras
        Wallet carteira1 = new Wallet(user1.getNome());
        Wallet carteira2 = new Wallet(user2.getNome());

        System.out.println("\n-- Operações Iniciais --");
        carteira1.depositar(1000.00);
        carteira1.sacar(250.00);
        carteira1.transferirPara(carteira2, 500.00);

        // Exibindo saldos finais
        System.out.println("\n-- Saldos Finais --");
        carteira1.exibirCredits();
        carteira2.exibirCredits();

        System.out.println("\n==== FIM DO SISTEMA ====");
    }
}

// Classe Info do usuário
class Info {
    private String nome;
    private int idade;

    public Info(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirInfo() {
        System.out.println("  > " + nome + ", " + idade + " anos");
    }

    public String getNome() {
        return nome;
    }
}

// Classe Wallet (carteira)
class Wallet {
    private String dono;
    private double credits;

    public Wallet(String dono) {
        this.dono = dono;
        this.credits = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            credits += valor;
            System.out.println("  [✓] " + dono + " depositou " + format(valor) + " credits.");
        } else {
            System.out.println("  [X] Depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && credits >= valor) {
            credits -= valor;
            System.out.println("  [✓] " + dono + " sacou " + format(valor) + " credits.");
        } else {
            System.out.println("  [X] " + dono + ": saldo insuficiente para saque.");
        }
    }

    public void transferirPara(Wallet destino, double valor) {
        if (valor > 0 && credits >= valor) {
            credits -= valor;
            destino.credits += valor;
            System.out.println("  [✓] " + dono + " transferiu " + format(valor) + " credits para " + destino.dono + ".");
        } else {
            System.out.println("  [X] Transferência falhou: saldo insuficiente.");
        }
    }

    public void exibirCredits() {
        System.out.println("  - " + dono + ": " + format(credits) + " credits");
    }

    private String format(double valor) {
        return String.format("%.2f", valor);
    }

    public double getCredits() {
        return credits;
    }
}
