package aparelhoTelefonico;

public interface AparelhoTelefonico {
    public void ligar(String numero){
        System.out.println("LIGANDO PARA NUMERO" + numero + ".");
    }

    public void atender(){
        System.out.println("ATENDENDO LIGAÇÃO.");
    }

    public void iniciarCorreioVoz(){
        System.out.println("INICIANDO CORREIO DE VOZ.");
    }
}
