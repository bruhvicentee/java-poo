package fiap.example;

public class App {
    public static void main (String[] args) {

        Computador pc = new Computador();

        pc.setModelo("G5");
        pc.setMarca("Dell");
        pc.setEspacoHD(256);
        pc.setMemoriaRam(8);
        pc.setPlacaDeVideoDedicada(true);
        pc.setProcessador("i7");
        pc.setPreco(5200.50);

        Fabricante dell = new Fabricante();
        dell.setNome("Dell Computadores");
        dell.setEndereco("Rua Tarará 702");

        pc.fabricante = dell;


        double desconto = pc.calcularDesconto(0.1);
        double valorFinal = pc.getPreco() - desconto;
        System.out.println("Valor com desconto: " + valorFinal);



        Computador note = new Computador("Macbook Pro", "Apple", 19999.99, 12, 512, "M4 Pro", true);

        Fabricante fabricante = new Fabricante("Apple", "Av Paulista 712");
        note.fabricante = fabricante;

    }
}
