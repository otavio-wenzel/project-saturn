public abstract class Personagem{
    protected String nome;
    protected int idade;
    protected String genero;
    protected Classes classe;
    protected String raca;
    
    protected int forca;
    protected int destreza;
    protected int constituicao;
    protected int inteligencia;
    protected int sabedoria;
    protected int carisma;

    public Personagem(){}

    public Personagem(String nome, int idade, String genero, Classes classe,
                    int forca, int destreza, int constituicao, int inteligencia,
                    int sabedoria, int carisma) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.classe = classe;
        this.forca = forca;
        this.destreza = destreza;
        this.constituicao = constituicao;
        this.inteligencia = inteligencia;
        this.sabedoria = sabedoria;
        this.carisma = carisma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getConstituicao() {
        return constituicao;
    }

    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getSabedoria() {
        return sabedoria;
    }

    public void setSabedoria(int sabedoria) {
        this.sabedoria = sabedoria;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }
    
    public Classes getClasse() {
        return classe;
    }

    public void setClasse(Classes classe) {
        this.classe = classe;
    }

    public void modificadorDeForca(){}
    public void modificadorDeDestreza(){}
    public void modificadorDeConstituicao(){}
    public void modificadorDeInteligencia(){}
    public void modificadorDeSabedoria(){}
    public void modificadorDeCarisma(){}

    public void aplicadorDeModificadores(){
        modificadorDeForca();
        modificadorDeDestreza();
        modificadorDeConstituicao();
        modificadorDeInteligencia();
        modificadorDeSabedoria();
        modificadorDeCarisma();
    }

    @Override
    public String toString() {
        return "Nome=" + nome + ", Idade=" + idade + ", Genero=" + genero + ", Raça=" + getClass().getSimpleName() +
                ", Classe=" + classe.getClass().getSimpleName() + ", Força=" + forca + ", Destreza=" + destreza +
                ", Constituição=" + constituicao + ", Inteligencia=" + inteligencia +
                ", Sabedoria=" + sabedoria + ", Carisma=" + carisma;
    }

    public String exibirIformacoesDoPersonagem() {
        aplicadorDeModificadores();
        return "\nNome: " + nome +
                "\nIdade: " + idade +
                "\nGenero: " + genero +
                "\nRaça: " + raca +
                "\nClasse: " + classe.getNomeDaClasse() +
                "\nForça: " + forca +
                "\nDestreza: " + destreza +
                "\nConstituiçao: " + constituicao +
                "\nInteligencia: " + inteligencia +
                "\nSabedoria: " + sabedoria +
                "\nCarisma: " + carisma;
    }

}