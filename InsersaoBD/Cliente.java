package InsersaoBD;

public class Cliente {
    private int codigo;
    private String nome;
    private int idade;
    private String profissao;
    private String cidade;
    private String estado;

    public Cliente(int codigo, String nome, int idade, String profissao, String cidade, String estado) {
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
        this.cidade = cidade;
        this.estado = estado;
    }
}
