import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        estoque estoque = new estoque();
        Scanner scanner = new Scanner(System.in);

        System.out.println("            BEM VINDO AO COMÉRCIO FIGUEREDO              ");

        while (true) {
            exibirMenu();
            System.out.print("Selecione uma opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    estoque.incluirMercadoria();
                    break;
                case "2":
                    estoque.atualizarMercadoria();
                    break;
                case "3":
                    estoque.consultarMercadoria();
                    break;
                case "4":
                    estoque.listaMercadoria();
                    break;
                case "5":
                    System.out.println("Programa finalizado ...");
                    return;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println(" *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*= ");
        System.out.println("1. Incluir mercadoria no estoque");
        System.out.println("2. Atualizar mercadoria no estoque");
        System.out.println("3. Consultar mercadoria no estoque");
        System.out.println("4. Listagem de itens no estoque");
        System.out.println("5. Finalizar");
        System.out.println(" *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*= ");
    }
}