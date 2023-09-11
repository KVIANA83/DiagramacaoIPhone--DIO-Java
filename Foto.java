package galeria;

public class Foto implements Galeria{
    @Override
    public void abrir(){
        System.out.println("Abrindo foto");
    }

    @Override
    public void fechar(){
        System.out.println("Fechando foto");
    }
}
