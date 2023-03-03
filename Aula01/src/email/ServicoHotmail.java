package email;

public class ServicoHotmail implements ServicoEmail{
    @Override
    public void enviarEmail(String endereco, String conteudo) {
        System.out.println("Enviando e-mail para " + endereco);
        System.out.println("Conteúdo e-mail: " + conteudo);
        System.out.println("Enviando...");
        System.out.println("Hotmail enviou seu e-mail com sucesso.");
    }

    @Override
    public void removerEmail(int id) {

    }
}
