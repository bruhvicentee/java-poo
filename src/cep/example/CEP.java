package cep.example;

public class CEP implements Validavel {
    private String numero;


    // Metodo Construtor
    public CEP(String numero) {
        if (validar(numero) == true)
            this.numero = numero;
        else
            throw new RuntimeException("CEP inválido");
    }

    @Override
    public boolean validar(String s) {
        return s.matches("[0-9]{5}-[0-9]{3}");
    }

    @Override
    public String toString() {
        return numero;
    }
}
