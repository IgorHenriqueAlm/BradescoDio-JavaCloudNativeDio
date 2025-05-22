public class SistemaDeCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("marcos", "3242342324");
        
        marcos.setEndereco("Pinheiro Machado");

        System.out.println(marcos.getCpf() +" - "+ marcos.getNome());
    }
}
