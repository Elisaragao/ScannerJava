import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner DigNome = new Scanner(System.in);
        String nome;
        System.out.println("Digite o seu nome: ");
        nome = DigNome.nextLine();
        System.out.println("Seja bem-vindo(a), " + nome + "!");
}
}