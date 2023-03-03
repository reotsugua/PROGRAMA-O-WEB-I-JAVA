package email;

public class Main {
    public static void main(String[] args) {
        ServicoGmail gmail = new ServicoGmail();
        ServicoHotmail hotmail = new ServicoHotmail();
        Cliente hugo = new Cliente(
                "Hugo Brendow",
                "hugoemail@hotmail.com",
                gmail);
        hugo.enviaEmail("maria@gmail.com", "Bom dia Maria");
    }
}
