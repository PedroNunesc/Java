/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Aula01;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) { // Main: tudo funciona atráves desse comando
        String meuNome = "Pedro"; // Primeiro o tipo depois a variavel
        char minhaInicial = 'P'; // char: usado para apenas uma letra (Somente com aspas cumuns)
        int minhaIdade = 15; // int: usado para números inteiros
        double minhaAltura = 1.83; // double: usado para números com ponto
        float meuPeso = 1.93f; // mesma coisa que o double
        boolean souProfessor = false; // boolean: sim ou não
        
        System.out.println("Meu nome é" + meuNome + ",a inicial do meu nome é" + minhaInicial + ", minha idade é" + minhaIdade + ",minha altura é" + minhaAltura +", meu peso é"+ meuPeso + "e sou um professor?" + souProfessor);
        
        // System.out.println("Frase exemplo."); // Console.log do Java
    }
}

