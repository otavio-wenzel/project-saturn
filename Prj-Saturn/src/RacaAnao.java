public class RacaAnao extends Personagem {

    public RacaAnao(String nome, int idade, String genero, Classes classe, int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma) {
        super(nome, idade, genero, classe, forca, destreza, constituicao, inteligencia, sabedoria, carisma);
        this.raca = "Anão";
    }

    @Override
    public void modificadorDeConstituicao(){
        constituicao += 2;
    }

    @Override
    public void modificadorDeCarisma(){
        carisma -= 2;
    }

    @Override
    public String exibirIformacoesDoPersonagem() {
        return super.exibirIformacoesDoPersonagem();
    }

}