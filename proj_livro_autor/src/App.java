import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Autor a1 = new Autor(null, null);
        Livro l1 = new Livro(null, null, null, 0);
        
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o nome do autor: ");
        a1.setNome(sc.nextLine());

        System.out.println("Digite a nacionalidade do autor: ");
        a1.setNacionalidade(sc.nextLine());

        System.out.println("Digite o titulo do livro: ");
        l1.setTitulo(sc.nextLine());

        System.out.println("Digite a editora do livro: ");
        l1.setEditora(sc.nextLine());

        System.out.println("Digite a ISBN do livro: ");
        l1.setISBN(sc.nextLine());

        System.out.println("Digite o preço do livro: ");
        l1.setPreco(sc.nextInt());

        l1.setAutor(a1.getNome());

        System.out.println("\nTitulo do livro: " + l1.getTitulo() + "\nEditora do livro: " +l1.getEditora()+ "\nISBN do livro: " +l1.getISBN()+ 
        "\nPreço do livro: " +l1.getPreco()+ "\nNome do autor do livro: " +a1.getNome()+ "\nNacionalidade do autor do livro: "+a1.getNacionalidade());
    }
}
