import java.io.IOException;
import java.util.ArrayList;

public class GerenciadorDePersonagens {

    private static ArrayList<Personagem> listaPersonagens = ListaDePersonagens.getListaDePersonagens();

    private static void criarPersonagem() {

        System.out.println("\nCRIAÇÃO DE NOVO PERSONAGEM");
        Personagem opRaca = escolherRaca();
        String nome = Console.lerString("Nome");
        int idade = Console.lerInt("Idade");
        String genero = Console.lerString("Gênero");
        Classes opcaoClasse = escolherClasse();
        int forca = Console.lerInt("Força");
        int destreza = Console.lerInt("Destreza");
        int constituicao = Console.lerInt("Constituição");
        int inteligencia = Console.lerInt("Inteliencia");
        int sabedoria = Console.lerInt("Sabedoria");
        int carisma = Console.lerInt("Carisma");

        Personagem person = null;

        if(opRaca instanceof RacaAnao){
            person = new RacaAnao(nome, idade, genero, opcaoClasse, forca, destreza, constituicao, inteligencia, sabedoria, carisma);
        } else if (opRaca instanceof RacaElfo){
            person = new RacaElfo(nome, idade, genero, opcaoClasse, forca, destreza, constituicao, inteligencia, sabedoria, carisma);
        } else if (opRaca instanceof RacaHumano){
            person = new RacaHumano(nome, idade, genero, opcaoClasse, forca, destreza, constituicao, inteligencia, sabedoria, carisma);
        }

        try {

            ListaDePersonagens.salvarPersonagem(person);
            PersistenciaPersonagens.salvarPersonagemNoArquivo(listaPersonagens);
            System.out.println("\nO personagem foi criado com sucesso!\n");

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }

    private static void buscarPersonagem() {

        try {
            ListaDePersonagens.verificarListaVazia();

            System.out.println("\nBuscar Personagem:");
            String nome = Console.lerString("Informe o nome do Personagem");
            
            Personagem tempPerson = ListaDePersonagens.buscarPersonagem(nome);

            System.out.println("\nPersonagem localizado:");
            System.out.println(tempPerson.exibirIformacoesDoPersonagem());

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

    }

    private static void excluirPersonagem() {
        
        try {
            
            ListaDePersonagens.verificarListaVazia();
       
            System.out.println("\nExcluir Personagem:");
            String nome = Console.lerString("Informe o nome do Personagem");

            Personagem tempPerson = ListaDePersonagens.buscarPersonagem(nome);

            ListaDePersonagens.deletarPersonagem(tempPerson);
            PersistenciaPersonagens.salvarPersonagemNoArquivo(listaPersonagens);

            System.out.println("\nO Personagem " + tempPerson.getNome() + " foi excluído com sucesso!");

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

    }

    private static void listarPersonagens() {

        try {

            ListaDePersonagens.verificarListaVazia();

            System.out.println("\nPersonagens Criados:");
            for (Personagem tempPerson : listaPersonagens) {
                
                System.out.println(tempPerson.exibirIformacoesDoPersonagem());
            }

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }

    public static void verificarOpcaoDigitada(int op) throws Exception {

        switch (op) {
            case 1:
                criarPersonagem();
                break;

            case 2:
                buscarPersonagem();
                break;

            case 3:
                excluirPersonagem();
                break;

            case 4:
                listarPersonagens();
                break;

            case 0:
                System.exit(0);
            default:
                throw new Exception("\nOpção inválida. Digite novamente\n");
        }

    }

    
    public static Personagem escolherRaca() {
        Personagem raca = null;
        boolean escolhaValida = false;
        
        while (!escolhaValida) {
            System.out.println("\nRaças de Personagem" +
                    "\n1) Anão" +
                    "\n2) Elfo" +
                    "\n3) Humano");
            int op = Console.lerInt("\nEscolha uma Raça");
            
            switch (op) {
                case 1:
                    raca = new RacaAnao();
                    escolhaValida = true;
                    break;
                case 2:
                    raca = new RacaElfo();
                    escolhaValida = true;
                    break;
                case 3:
                    raca = new RacaHumano();
                    escolhaValida = true;
                    break;
                default:
                    System.out.println("\nOpção inválida. Digite novamente\n");
            }
        }
        return raca;
    }

    public static Classes escolherClasse() {
        Classes classe = null;
        boolean escolhaValida = false;
        
        while (!escolhaValida) {
            System.out.println("\nClasses de Personagem" +
                    "\n1) Bárbaro" +
                    "\n2) Feiticeiro" +
                    "\n3) Guerreiro" +
                    "\n4) Ranger");
            int op = Console.lerInt("\nEscolha uma classe");
            
            switch (op) {
                case 1:
                classe = new ClasseBarbaro();
                escolhaValida = true;
                break;
                case 2:
                classe = new ClasseFeiticeiro();
                escolhaValida = true;
                break;
                case 3:
                classe = new ClasseGuerreiro();
                escolhaValida = true;
                break;
                case 4:
                classe = new ClasseRanger();
                escolhaValida = true;
                break;
                default:
                System.out.println("\nOpção inválida. Digite novamente\n");
            }
        }
        return classe;
    }
    
    public static void criarArquivoSeNaoExistir() throws IOException {
        PersistenciaPersonagens.criarArquivoSeNaoExistir();
    }
    
    public static void lerArquivo() throws IOException {
        PersistenciaPersonagens.lerArquivo(listaPersonagens);
    }
}
