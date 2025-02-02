import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManipuladorDeArquivo {

    public void inserirNome(String nome) {
        try {
            File arquivo = new File("extensao.txt");
            if (!arquivo.exists()) {
                arquivo.createNewFile();
            }
            FileWriter escritor = new FileWriter(arquivo, true);
            escritor.write(nome + "\n");
            escritor.close();
            System.out.println("Nome inserido com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao inserir o nome.");
        }
    }

    public void exibirNomes() {
        try {
            File arquivo = new File("extensao.txt");
            if (!arquivo.exists()) {
                System.out.println("O arquivo não existe.");
                return;
            }
            Scanner input = new Scanner(arquivo);
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
            input.close();
        } catch (IOException e) {
            System.out.println("Erro ao exibir os nomes do arquivo.");
        }
    }

    public void apagarArquivo() {
        File arquivo = new File("extensao.txt");
        if (!arquivo.exists()) {
            System.out.println("O arquivo não existe.");
            return;
        }
        if (arquivo.delete()) {
            System.out.println("Arquivo apagado com sucesso!");
        } else {
            System.out.println("Erro ao apagar o arquivo.");
        }
    }
}