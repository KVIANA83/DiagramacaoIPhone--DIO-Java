import galeria.Foto;
import ligacao.Chamadas;
import musica.ReproduzirMusica;

public class Main {
    public static void main(String[] args) {

        Foto foto = new Foto();
        Chamadas chamadas = new Chamadas();
        ReproduzirMusica reproduzirMusica = new ReproduzirMusica();

        foto.abrir();
        foto.fechar();

        System.out.println("---------");

        chamadas.atender();
        chamadas.desligar();

        System.out.println("---------");

        reproduzirMusica.play();
        reproduzirMusica.pause();

    }
}