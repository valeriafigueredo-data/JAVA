import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class estoque {
    private Map<String, mercadoria> mercadorias = new HashMap<String, mercadoria>();
    private Scanner scanner = new Scanner(System.in);

    public void incluirMercadoria() {
        System.out.print("Digite o nome da mercadoria: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o setor da mercadoria: ");
        String setor = scanner.nextLine();
        int quantidade = lerQuantidade();
        double preco = lerPreco();

        mercadoria mercadoria = new mercadoria(nome, setor, quantidade, preco);
        mercadorias.put(nome, mercadoria);
        System.out.println(nome + " foi incluído com sucesso!");
    }

    public void atualizarMercadoria() {
        System.out.print("Digite o nome da mercadoria: ");
        String nome = scanner.nextLine();
        if (mercadorias.containsKey(nome)) {
            System.out.print("Atual setor: ");
            String setor = scanner.nextLine();
            int quantidade = lerQuantidade();
            double preco = lerPreco();

            mercadoria mercadoria = mercadorias.get(nome);
            mercadoria.setSetor(setor);
            mercadoria.setQuantidade(quantidade);
            mercadoria.setPreco(preco);

            System.out.println(nome + " editado com sucesso!");
        } else {
            System.out.println("Mercadoria não encontrada");
        }
    }

    public void excluirMercadoria() {
        System.out.print("Digite o nome da mercadoria: ");
        String nome = scanner.nextLine();
        if (mercadorias.containsKey(nome)) {
            mercadorias.remove(nome);
            System.out.println(nome + " deletado com sucesso!");
        } else {
            System.out.println("Mercadoria não encontrada");
        }
    }

    public void consultarMercadoria() {
        System.out.print("Digite o nome da mercadoria: ");
        String nome = scanner.nextLine();
        if (mercadorias.containsKey(nome)) {
            System.out.println("Mercadoria encontrada: " + mercadorias.get(nome));
        } else {
            System.out.println("Mercadoria não encontrada");
        }
    }

    public void listaMercadoria() {
        if (mercadorias.isEmpty()) {
            System.out.println("O estoque está vazio.");
        } else {
            System.out.println("Itens no estoque:");
            for (mercadoria mercadoria : mercadorias.values()) {
                System.out.println(mercadoria);
            }
        }
    }

    private int lerQuantidade() {
        while (true) {
            System.out.print("Digite a quantidade: ");
            try {
                int quantidade = Integer.parseInt(scanner.nextLine());
                if (quantidade >= 0) {
                    return quantidade;
                } else {
                    System.out.println("Quantidade não pode ser negativa. Tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Digite um número inteiro.");
            }
        }
    }

    private double lerPreco() {
        while (true) {
            System.out.print("Digite o preço da mercadoria: R$ ");
            try {
                double preco = Double.parseDouble(scanner.nextLine());
                if (preco >= 0) {
                    return preco;
                } else {
                    System.out.println("Preço não pode ser negativo. Tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Digite um número válido.");
            }
        }
    }
}
