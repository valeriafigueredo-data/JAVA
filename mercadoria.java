public class mercadoria {
    private String nome;
    private String setor;
    private int quantidade;
    private double preco;
    private double total;

    public mercadoria(String nome, String setor, int quantidade, double preco) {
        this.nome = nome;
        this.setor = setor;
        this.quantidade = quantidade;
        this.preco = preco;
        this.total = quantidade * preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        this.total = quantidade * preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
        this.total = quantidade * preco;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Setor: " + setor + ", Quantidade: " + quantidade + ", Preço: R$ " + String.format("%.2f", preco) + ", Total: R$ " + String.format("%.2f", total);
    }
}
