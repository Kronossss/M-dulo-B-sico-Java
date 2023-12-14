package exercicoengenheiro;

public class engenheiro {
    private String crea;
    private String nome;

    public engenheiro(String crea, String nome) {
        this.crea = crea;
        this.nome = nome;
    }

    public String mostraengenheiro(){
        return " Nome : "+ nome + "\t Crea : "+ crea;
    }



}
