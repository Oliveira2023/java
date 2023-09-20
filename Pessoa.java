public class Pessoa {
    private int idade;
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        if (idade <1 || idade > 100){
            System.out.println("Idade inválida");
        }else{
            this.idade = idade;
        }
        
    }
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        // pessoa.setIdade(20);
        // System.out.println(pessoa.getIdade());
        // pessoa.idade = 32;
        pessoa.setIdade(12);
        System.out.println(pessoa.getIdade());
    }
}
