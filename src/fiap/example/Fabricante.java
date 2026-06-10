package fiap.example;

public class Fabricante {
    private String nome;
    private String endereco;


    // Encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    //Métodos Contrutores

    public Fabricante () {
    } //Contrutor padrão - sem parâmetros (java cria automaticamente)

    public Fabricante (String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    } //Contrutor com parâmetros
}
