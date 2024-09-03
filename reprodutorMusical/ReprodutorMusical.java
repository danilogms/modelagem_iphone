package reprodutorMusical;

public interface ReprodutorMusical {
    public void tocar(){
        System.out.println("REPRODUZINDO MUSICA.");
    }
    public void pausar(){
        System.out.println("PAUSANDO MUSICA EM REPRODUÇÃO.");
    }
    public void selecionarMusica(String musica){
        System.out.println("MUSICA SELECIONADA: "+musica + ".");
    }
}
