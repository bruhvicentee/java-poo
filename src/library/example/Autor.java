package library.example;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Autor {
    private String nome;
    private LocalDate dataNascimento;
    private String nacionalidade;

    // Encapsulamento - getters & setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    List<Livro> livros = new ArrayList<>();

    public Autor(String nome, LocalDate dataNascimento, String nacionalidade) {
        this.setNome(nome);
        this.setDataNascimento(dataNascimento);
        this.setNacionalidade(nacionalidade);
    }

}
