package library.example;

public class Livro {
    private String titulo;
    private String editora;
    private int paginas;
    private float preco;

    // Encapsulamento - getters & setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String t) {
        this.titulo = t;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String e) {
        this.editora = e;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        if (paginas > 0)
            this.paginas = paginas;
        else
            System.out.print("Número de páginas inválido");
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if (preco > 0)
            this.preco = preco;
        else
            System.out.println("O preço informado é inválido");
    }

    // Metodo construtor
    public Livro(String titulo, String editora, int paginas, float preco) {
        this.setTitulo(titulo);
        this.setEditora(editora);
        this.setPaginas(paginas);
        this.setPreco(preco);
    }
}
