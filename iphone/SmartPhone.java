package iphone;

import multifuncional.Iphone;

public class SmartPhone {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        System.out.println("FUNCIONALIDADES MUSICAIS DO IPHONE.");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Ziran - Astrix");

        System.out.println("FUNCIONALIDADES TELEFONICAS DO IPHONE.");
        iphone.ligar("33120652");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("FUNCIONALIDADES WEB DO IPHONE");
        iphone.exibirPagina("www.youtube.com.br");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
