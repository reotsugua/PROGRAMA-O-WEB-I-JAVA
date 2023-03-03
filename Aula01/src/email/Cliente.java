package email;

public class Cliente {
    private String nome;
    private String endereco;
    private ServicoEmail servicoEmail;

    public Cliente(String nome, String endereco, ServicoEmail servicoEmail) {
        this.nome = nome;
        this.endereco = endereco;
        this.servicoEmail = servicoEmail;
    }

    public void enviaEmail(String endereco, String conteudo){
        this.servicoEmail.enviarEmail(endereco, conteudo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ServicoEmail getServicoEmail() {
        return servicoEmail;
    }

    public void setServicoEmail(ServicoEmail servicoEmail) {
        this.servicoEmail = servicoEmail;
    }
}
