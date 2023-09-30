package interfaces;

// 
public class Livro implements Comparable<Livro> {
    public String nome;
    public Double custo;
    public Livro(String nome, double custo){
        this.nome = nome;
        this.custo = custo;
    }
    @Override
    public int compareTo(Livro livro){

        int comp = nome.compareTo(livro.nome);
        if (comp < 0) {
            System.out.println (nome + "," + livro.nome);
        } else if (comp > 0) {
            System.out.println (livro.nome + "," + nome);
        }else{
            System.out.println ("Os nomes são iguais");
        }
        return 0;
        
        // if (Math.abs(custo - livro.custo) < 0.001){
        //     return 0;
        // }else if (custo > livro.custo){
        //     return 1;
        // }else{
        //     return -1;
        // }
    }
}
