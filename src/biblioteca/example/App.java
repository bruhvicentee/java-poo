package biblioteca.example;

import java.time.LocalDate;

public class App {
    public static void main (String[] args) {

        Livro narnia = new Livro();

        narnia.titulo = "As Crõnicas de Nárnia";
        narnia.editora = "HarperCollins";
        narnia.dataPublicacao = LocalDate.of(2026, 2, 3);
        narnia.paginas = 768;
        narnia.capaDura = true;
        narnia.preco = 139.90f;


        Autor lewis = new Autor();

        lewis.nome = "Clive Staples Lewis";
        lewis.dataNascimento = LocalDate.of(1898, 11, 29);
        lewis.nacionalidade = "Britânico";

        narnia.autor = lewis;


        System.out.println( narnia.info() );
    }
}
