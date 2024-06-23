public class Principal {
    public static void main(String[] args) {

        Classes barbaro = new ClasseBarbaro();
        Classes guerreiro = new ClasseGuerreiro();
        Classes ranger = new ClasseRanger();

        Personagem humano = new RacaHumano("Conan", 30, "Homem", barbaro, 15, 20, 12, 10, 12, 10);
        Personagem anao = new RacaAnao("Grom", 25, "Homem", guerreiro, 18, 15, 14, 8, 16, 23);
        Personagem elfo = new RacaElfo("Jeriff", 25, "Mulher", ranger, 18, 15, 14, 8, 16, 21);
        
        System.out.println(humano.exibirIformacoesDoPersonagem());
        System.out.println(anao.exibirIformacoesDoPersonagem());
        System.out.println(elfo.exibirIformacoesDoPersonagem());

    }
}
