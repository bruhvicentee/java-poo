package fiap.example;

// Classe
public class Computador {

    // Atributos
    private String modelo;
    private String marca;
    private double preco;
    private int memoriaRam;
    private int espacoHD;
    private String processador;
    private boolean placaDeVideoDedicada;

    // Relacionamento entre Classes
    Fabricante fabricante;


    // Encapsulamento - getters & setters

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getEspacoHD() {
        return espacoHD;
    }

    public void setEspacoHD(int espacoHD) {
        this.espacoHD = espacoHD;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public boolean isPlacaDeVideoDedicada() {
        return placaDeVideoDedicada;
    }

    public void setPlacaDeVideoDedicada(boolean placaDeVideoDedicada) {
        this.placaDeVideoDedicada = placaDeVideoDedicada;
    }


    // Métodos Construtores

    public Computador() {
    } //construtor padrão - sem parâmetros (java cria automaticamente)

    public Computador (String modelo, String marca, double preco, int memoriaRam, int espacoHD, String processador, boolean placaDeVideoDedicada) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
        this.memoriaRam = memoriaRam;
        this.espacoHD = espacoHD;
        this.processador = processador;
        this.placaDeVideoDedicada = placaDeVideoDedicada;
    } //construtor com parâmetros


    // Métodos
    double calcularDesconto (double desconto) {
        return preco * desconto;
    }
}
