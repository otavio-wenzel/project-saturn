public class RacaHumano extends Personagem {

    public RacaHumano(String nome, int idade, String genero, Classes classe, int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma) {
        super(nome, idade, genero, classe, forca, destreza, constituicao, inteligencia, sabedoria, carisma);
        this.raca = "Humano";
    }



    @Override
    public String exibirIformacoesDoPersonagem() {
        return super.exibirIformacoesDoPersonagem();
    }

}