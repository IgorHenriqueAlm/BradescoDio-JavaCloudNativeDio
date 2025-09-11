public abstract class Usuario {
    private String nome;
    private String email;
    private String senha;
    private final boolean administrador;
    private boolean logado;

    protected Usuario(String nome, String email, String senha, boolean administrador) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = administrador;
        this.logado = false;
    }

    // Métodos comuns
    public void realizarLogin(String email, String senha) {
        if (this.email.equals(email) && this.senha.equals(senha)) {
            this.logado = true;
            System.out.println(nome + " logado com sucesso.");
        } else {
            System.out.println("Credenciais inválidas.");
        }
    }

    public void realizarLogoff() {
        this.logado = false;
        System.out.println(nome + " realizou logoff.");
    }

    public void alterarDados(String novoNome, String novoEmail) {
        this.nome = novoNome;
        this.email = novoEmail;
        System.out.println("Dados alterados com sucesso.");
    }

    public void alterarSenha(String senhaAtual, String novaSenha) {
        if (this.senha.equals(senhaAtual)) {
            this.senha = novaSenha;
            System.out.println("Senha alterada com sucesso.");
        } else {
            System.out.println("Senha atual incorreta.");
        }
    }

    // Getters
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public boolean isAdministrador() { return administrador; }
    public boolean isLogado() { return logado; }
}
