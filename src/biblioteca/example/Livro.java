package biblioteca.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Livro {
    String titulo;
    String editora;
    LocalDate dataPublicacao;
    int paginas;
    boolean capaDura;
    float preco;

    Autor autor;


    public String info () {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String texto = """
        Título: %s
        Editora: %s
        Data de Publicação: %s
        N de Páginas: %d
        Capa Dura: %b
        Preço: R$ %.2f
        """.formatted(titulo, editora, dataPublicacao.format(formato), paginas, capaDura ? "Sim" : "Não", preco);

        return texto;
    }
}
