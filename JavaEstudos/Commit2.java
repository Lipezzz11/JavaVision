public class Commit2 {
    public static void main(String[] args) {
        // obj User
        Info user = new Info();
        user.nome = "Ze Zinho";
        user.idade = 18;
        user.infor(); // chama o metodo

        // obj Wallet for user
        Wallet walletUser = new Wallet();
        System.out.println("Wallet info:");
        
        walletUser.setSaldo(1000.00); // definindo o saldo
        System.out.println("Saldo: R$ " + walletUser.getSaldo()); // print saldo

        walletUser.setCredits(50000.79); // a mesma mrd
        System.out.println("Credits: "+ walletUser.getCredits()); // print credits

        walletUser.setCoins(99);
        System.out.println("Coins: "+ walletUser.getCoins());
    }
}

class Info {
    String nome;
    int idade;

    void infor() {
        System.out.println("Olá " + nome + " de " + idade + " anos");
    }
}

class Wallet {
    private double saldo;
    private double credits;
    private int coins;

    // Setter (para definir valor)
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    // Getters (para retornar os valores)
    public double getSaldo() {
        return saldo;
    }

    public double getCredits() {
        return credits;
    }

    public double getCoins() {
        return coins;
    }
}