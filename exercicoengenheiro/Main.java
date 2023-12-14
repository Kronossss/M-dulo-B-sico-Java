package exercicoengenheiro;

public class Main {
    public static void main(String[] args) {
    engenheiro eng1 = new engenheiro("1564544", "gilberto");
    engenheiro eng2 = new engenheiro("abcdariodaalegria", "igorcanario");


    Projeto proj1 = new Projeto(1,"bahia",1000, eng1);
    Projeto proj2 = new Projeto(2,"corinthians",5000000, eng2);



        System.out.println(proj1.mostraprojeto());
    }
}
