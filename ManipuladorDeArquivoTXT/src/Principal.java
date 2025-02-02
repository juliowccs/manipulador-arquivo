import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        ManipuladorDeArquivo arquivo = new ManipuladorDeArquivo();
        Scanner input = new Scanner(System.in);
        int menu;

        do {
        	System.out.println("=================================");
        	System.out.println("============ Arquivo ============");
        	System.out.println("=================================");
            System.out.println("| 1. Inserir um nome no arquivo |");
            System.out.println("| 2. Exibir dados do arquivo    |");
            System.out.println("| 3. Apagar o arquivo           |");
            System.out.println("| 4. Sair                       |");
            System.out.println("=================================");
            System.out.print("Escolha a opção: ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Digite o nome que deseja inserir: ");
                    input.nextLine();
                    String nome = input.nextLine();
                    arquivo.inserirNome(nome);
                    break;
                case 2:
                	arquivo.exibirNomes();
                    break;
                case 3:
                	arquivo.apagarArquivo();
                    break;
                case 4:
                    System.out.println("Encerrado com sucesso!");
                    break;
                default:
                    System.out.println("Opção não reconhecida");
            }
        } while (menu != 4);

        input.close();
    }
}