package model.persistence;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import model.entities.*;

public abstract class PersistenciaPersonagens {

    private static final String ARQUIVO = "personagens-do-usuario.txt";

    public static void salvarPersonagemNoArquivo (ArrayList<Personagem> listaPersonagens)  throws IOException {

        try (FileWriter fWriter = new FileWriter(ARQUIVO);
             BufferedWriter bWriter = new BufferedWriter(fWriter)) {

                for (Personagem tempPerson : listaPersonagens) {
                    fWriter.write(tempPerson + "\n");
                }
        }

    }

    public static void lerArquivo(ArrayList<Personagem> listaPersonagens) throws IOException {

        listaPersonagens.clear();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO))) {

            String linha;
            while ((linha = reader.readLine()) != null) {
                
                Personagem tempPerson = deserializarPersonagem(linha);

                listaPersonagens.add(tempPerson);
            }
        } catch (Exception e) {
            System.out.println("Erro ao desserializar personagem: " + e.getMessage());
        }

    }

    public static void criarArquivoSeNaoExistir() throws IOException {

        try {

            File arquivo = new File(ARQUIVO);

            if (!arquivo.exists()) {
                arquivo.createNewFile();
            }
        } finally {}

    }

    private static Personagem deserializarPersonagem(String linha) throws Exception {
        //Feita a leitura do documento para instaciar os personagens salvos no arquivo

        String[] partes = linha.split(",");

        String nome = partes[0].split("=")[1];
        int idade = Integer.parseInt(partes[1].split("=")[1]);
        String genero = partes[2].split("=")[1];
        String raca = partes[3].split("=")[1];
        String classeSalva = partes[4].split("=")[1];
        int forca = Integer.parseInt(partes[5].split("=")[1]);
        int destreza = Integer.parseInt(partes[6].split("=")[1]);
        int constituicao = Integer.parseInt(partes[7].split("=")[1]);
        int inteligencia = Integer.parseInt(partes[8].split("=")[1]);
        int sabedoria = Integer.parseInt(partes[9].split("=")[1]);
        int carisma = Integer.parseInt(partes[10].split("=")[1]);
    
        Classes classe = null;
        //verificação da classe original do personagem
        switch (classeSalva) {
            case "ClasseBarbaro":
                classe = new ClasseBarbaro();
                break;
            case "ClasseFeiticeiro":
                classe = new ClasseFeiticeiro();
                break;
            case "ClasseGerreiro":
                classe = new ClasseGuerreiro();
                break;
            case "ClasseRanger":
                classe = new ClasseRanger();
                break;
            default:
            throw new Exception("\nErro de Classe");
        }
    
        Personagem personagem = null;
        //Verificando a classe original do personagem para que seja instanciado corretamente
        switch (raca) {
            case "RacaAnao":
                personagem = new RacaAnao(nome, idade, genero, classe, forca, destreza, constituicao, inteligencia, sabedoria, carisma);
                break;
            case "RacaElfo":
                personagem = new RacaElfo(nome, idade, genero, classe, forca, destreza, constituicao, inteligencia, sabedoria, carisma);
                break;
            case "RacaHumano":
                personagem = new RacaHumano(nome, idade, genero, classe, forca, destreza, constituicao, inteligencia, sabedoria, carisma);
                break;
            default:
                throw new Exception("\nErro de Raça");
        }
    
        return personagem;
    }
    


}
