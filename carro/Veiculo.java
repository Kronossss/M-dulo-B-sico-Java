package carro;

public class Veiculo {
    private String modelo;
    private String cor;
    private int ano;

    public Veiculo(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }



    public String toString(){
        return ("Modelo : " + modelo + "\n Cor : " + cor + "\n Ano : " + ano);

    }


}
