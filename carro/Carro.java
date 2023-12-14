package carro;

import java.time.temporal.Temporal;

public class Carro extends Veiculo {
    private int portas;
    private boolean temPorta=false;


    public Carro(String modelo, String cor, int ano, int portas) {
        super(modelo, cor, ano);
        this.portas = portas;
        this.temPorta=true;
    }

    public Carro(String modelo, String cor, int ano) {
        super(modelo, cor, ano);

    }
    public String toString(){
        if(temPorta){
            return super.toString() + "\n Número de Portas : "+ portas;
        }
        else
            return super.toString();
    }

    public void exibirInformacoes() {
        System.out.println(this.toString());

    }


}
