package ligacao;

public class Chamadas implements Ligacao{
    @Override
    public void atender(){
        System.out.println("Atendendo Ligação");
    }

    @Override
    public void desligar(){
        System.out.println("Desligando Ligação");
    }
}
