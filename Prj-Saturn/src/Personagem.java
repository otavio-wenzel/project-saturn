public abstract class Personagem{
    protected String nome;
    protected int idade;
    protected String genero;
    
    protected int forca;
    protected int destreza;
    protected int constituicao;
    protected int inteligencia;
    protected int sabedoria;
    protected int carisma;

    public Personagem(String nome, int idade, String genero, int forca, int constituicao,
                      int destreza, int carisma, int inteligencia) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.forca = forca;
        this.constituicao = constituicao;
        this.destreza = destreza;
        this.carisma = carisma;
        this.inteligencia = inteligencia;
    }

    

}