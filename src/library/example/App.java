package library.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main (String[] args) {

        List<Autor> autores = new ArrayList<>();

        // autor 1
        Autor autor1 = new Autor("Clive Staples Lewis", LocalDate.of(1898, 11, 29), "Britânico");

        Livro narnia = new Livro("As Crônicas de Nárnia", "HarperCollins", 768, 139.90f);

        Livro cristianismopurosimples = new Livro("Cristianismo Puro e Simples", "Thomas Nelson Brasil", 288, 34.08f);


        autor1.livros.add(narnia);
        autor1.livros.add(cristianismopurosimples);


        // autor 2
        Autor autor2 = new Autor("J. R. R. Tolkien", LocalDate.of(1892, 1, 3), "Britânico");

        Livro hobbit = new Livro("O Hobbit", "HarperCollins", 336, 49.78f);

        Livro senhordosaneis = new Livro("O Senhor dos Anéis: A Sociedade do Anel", "HarperCollins", 576, 49.78f);

        autor2.livros.add(hobbit);
        autor2.livros.add(senhordosaneis);


        // adicionando todos os elementos à lista
        autores.add(autor1);
        autores.add(autor2);

        for (Autor autor : autores) {
            System.out.println("Autor: " + autor.getNome());

            for (Livro livro : autor.livros) {
                System.out.println("- " + livro.getTitulo());
            }

            System.out.println("------------");
        }

    }
}
