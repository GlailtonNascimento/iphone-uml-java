import java.util.ArrayList;
import java.util.List;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String musicaAtual;
    private String numeroAtual;
    private String urlAtual;
    private List<String> historico = new ArrayList<>();

    // Métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando música: " + musicaAtual);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada: " + musicaAtual);
    }

    @Override
    public void parar() {
        System.out.println("Música parada: " + musicaAtual);
        musicaAtual = null;
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
    }

    // Métodos da interface AparelhoTelefonico
    @Override
    public void fazerChamada(String numero) {
        this.numeroAtual = numero;
        System.out.println("Chamando: " + numero);
    }

    @Override
    public void receberChamada() {
        System.out.println("Recebendo chamada...");
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
    }

    // Métodos da interface NavegadorInternet
    @Override
    public void abrirURL(String url) {
        this.urlAtual = url;
        this.historico.add(url);
        System.out.println("Abrindo URL: " + url);
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página: " + urlAtual);
    }

    @Override
    public void gerenciarHistorico() {
        System.out.println("Histórico de navegação:");
        for (String url : historico) {
            System.out.println(url);
        }
    }

    // Método main para testar a classe
    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();

        // Testando Reprodutor Musical
        meuIPhone.selecionarMusica("Minha Música Favorita");
        meuIPhone.tocar();
        meuIPhone.pausar();
        meuIPhone.parar();

        // Testando Aparelho Telefônico
        meuIPhone.fazerChamada("123-456-7890");
        meuIPhone.receberChamada();
        meuIPhone.enviarMensagem("123-456-7890", "Olá, como vai?");

        // Testando Navegador Internet
        // Testando Navegador Internet
        meuIPhone.abrirURL("https://github.com/GlailtonNascimento");
        meuIPhone.exibirPagina();
        meuIPhone.gerenciarHistorico();

    }
}
