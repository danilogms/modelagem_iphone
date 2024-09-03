package multifuncional;

import reprodutorMusical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical{
    @Override
    public void tocar(){
        System.out.println("Tocando musica pelo Iphone");
    }
    public void pausar(){
        System.out.println("Pausando musica pelo Iphone.");
    }
    public void selecionarMusica(String musica){
        System.out.println("Musica selecionada pelo Iphone: "+ musica + ".");
    }


}
