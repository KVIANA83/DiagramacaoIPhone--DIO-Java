package musica;

public class ReproduzirMusica implements Musica{
    @Override
    public void play(){
        System.out.println("Iniciando a música");
    }

    @Override
    public void pause(){
        System.out.println("Parando a música");
    }
}
