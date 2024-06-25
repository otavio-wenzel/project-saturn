import java.io.IOException;

public class Sistema {

    private static void exibirMenu() {
        
        System.out.println("\nMENU DE PERSONAGENS");
        System.out.println("1) Criar");
        System.out.println("2) Buscar pelo Nome");
        System.out.println("3) Excluir");
        System.out.println("4) Listar todos os Personagens");
        System.out.println("0) Sair");
    }

    public static void executar() {

       try {
            GerenciadorDePersonagens.criarArquivoSeNaoExistir();
            GerenciadorDePersonagens.lerArquivo();
    
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

        while (true) {
            
            exibirMenu();
            int op = Console.lerInt("Informe uma opção");
            
            try {
                GerenciadorDePersonagens.verificarOpcaoDigitada(op);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }

    

}
