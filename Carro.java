import java.util.*;

public class Carro {
    private String placa;
    private String proprietario;
    private String cor;
    private String modelo;
    private double kmRodado;

    public Carro(String placa, String proprietario, String cor, String modelo, double kmRodado) {
        this.placa = placa;
        this.proprietario = proprietario;
        this.cor = cor;
        this.modelo = modelo;
        this.kmRodado = kmRodado;
    }

    public String getPlaca() {
        return placa;
    }

    public String getProprietario() {
        return proprietario;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public double getKmRodado() {
        return kmRodado;
    }
}