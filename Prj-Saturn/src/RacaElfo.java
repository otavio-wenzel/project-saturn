public class RacaElfo extends Personagem {

    public RacaElfo(){}

    public RacaElfo(String nome, int idade, String genero, Classes classe, int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma) {
        super(nome, idade, genero, classe, forca, destreza, constituicao, inteligencia, sabedoria, carisma);
        this.raca = "Elfo";
    }

    @Override
    public void modificadorDeDestreza(){
        destreza += 2;
    }

    @Override
    public void modificadorDeConstituicao(){
        constituicao -= 2;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String exibirIformacoesDoPersonagem() {
        return super.exibirIformacoesDoPersonagem();
    }
}