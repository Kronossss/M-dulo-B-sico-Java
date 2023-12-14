package exercicoengenheiro;

public class Projeto {
    private int cod;
    private String nome;
    private float orcamento;

    private engenheiro eng_resp;

    public Projeto(int cod, String nome, int orcamento) {
        this.cod = cod;
        this.nome = nome;
        this.orcamento = orcamento;
    }

    public Projeto(int cod, String nome) {
        this.cod = cod;
        this.nome = nome;
    }

    public Projeto(int cod, String nome, float orcamento, engenheiro eng_resp) {
        this.cod = cod;
        this.nome = nome;
        this.orcamento = orcamento;
        this.eng_resp = eng_resp;
    }

    public String mostraprojeto(){
        return "Nome : "+ nome + "\tcodigo : "+ cod + "\torcamento : " + orcamento + "\tengenheiro responsável : "+ eng_resp.mostraengenheiro();
    }
}

