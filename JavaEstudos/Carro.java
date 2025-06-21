class Veiculo {
    String marca;
    String cor;
    int ano;

    public void ligar() {
        System.out.println("O carro está ligado");
    }

    public void acelerar() {
        System.out.println("O carro está acelerando");
    }
}

public class Carro {
    public static void main(String[] args) {
        // Cria um objeto da classe Carro
        Veiculo meuCarro = new Veiculo();

        // Atribui valores aos atributos (variaveis) do objeto
        meuCarro.marca = "Ford";
        meuCarro.cor = "Azul";
        meuCarro.ano = 2023;

        // Chama os métodos do objeto (tambem chamado de função)
        meuCarro.ligar();
        meuCarro.acelerar();

        // print aos valores que você atribuiu
        System.out.println("Marca: " + meuCarro.marca);
        System.out.println("Cor: " + meuCarro.cor);
        System.out.println("Ano: " + meuCarro.ano);
    }
}