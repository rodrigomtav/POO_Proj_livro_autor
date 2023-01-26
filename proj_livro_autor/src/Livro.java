public class Livro {
    String titulo;
    String editora;
    String ISBN;
    String autor;
    int preco;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public Livro (String titulo, String editora, String ISBN, int preco){
        this.titulo = titulo;
        this.editora = editora;
        this.ISBN = ISBN;
        this.preco = preco;
    }

    void printaLivro(){
        System.out.println("\nTitulo: " + titulo + "\nEditora: " + editora + "\nISBN: " + ISBN + "\nAutor: " +autor+ "\nPreço: " +preco);
    }
}
