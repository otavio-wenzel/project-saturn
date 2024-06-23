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

    

    

}