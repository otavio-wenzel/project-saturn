package controller;
import java.util.ArrayList;

import model.entities.Personagem;

public abstract class ListaDePersonagens {

    private static ArrayList<Personagem> listaDePersonagens = new ArrayList<>();

    public static void salvarPersonagem(Personagem person) {
        listaDePersonagens.add(person);
    }

    public static ArrayList<Personagem> getListaDePersonagens() {
        return listaDePersonagens;
    }

    public static void verificarListaVazia() throws Exception {
        
        if (listaDePersonagens.isEmpty()) {
            throw new Exception("\nATENÇÃO: Não há personagens salvos.\n");
        }
    }

    public static Personagem buscarPersonagem(String nome) throws Exception {

       for (Personagem tempPersonagem : listaDePersonagens) {
            if (tempPersonagem.getNome().contains(nome)) {
                return tempPersonagem;
            }
       }

       throw new Exception("\nO personagem " + nome + " não foi localizado.\n");
    }

    public static void deletarPersonagem(Personagem person) {
        listaDePersonagens.remove(person);
    }



}
