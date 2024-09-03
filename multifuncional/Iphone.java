package multifuncional;

import aparelhoTelefonico.AparelhoTelefonico;
import navegadorInternet.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocar(){
        System.out.println("Tocando musica pelo Iphone.");
    }
    public void pausar(){
        System.out.println("Pausando musica pelo Iphone.");
    }
    public void selecionarMusica(String musica){
        System.out.println("Musica selecionada pelo Iphone: "+ musica + ".");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Iphone ligando para o número: "+numero +".");
    }

    @Override
    public void atender() {
        System.out.println("Iphone recebendo ligação.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iphone iniciando correio de voz.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Iphone exibindo pagina Web: "+ url );
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Iphone adicionando nova pagina Web.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Iphone atualizando pagina Web.");
    }
}
