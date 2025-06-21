public class Somar2 {

    public int somar(int num1, int num2) {  // metodo ou função
        return num1 + num2;
    }

    public static void main(String[] args) {
        Somar2 minhaCalculadora = new Somar2(); // Criar um objeto
        int resultado = minhaCalculadora.somar(5, 3); // passar argumentos (definir os valores que vão ser somados)
        System.out.println("Resultado: " + resultado); // Resultado: 8
    }
} 
// Outra versão de codigo (Metodo)