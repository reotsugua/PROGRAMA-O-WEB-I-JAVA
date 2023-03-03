package email;

public interface ServicoEmail {

    public void enviarEmail (String endereco, String conteudo);
    public void removerEmail(int id);
}
