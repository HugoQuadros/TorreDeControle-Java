public class TorreDeControle {

    private Voador[] listaDeVoadores = new Voador[10];

    public void voemTodos(){
        for(int i=0; i< listaDeVoadores.length; i++){
            if(listaDeVoadores[i] == null){
                break;
            } else{
                listaDeVoadores[i].voar();
            }
        }
    }

    public void adicionarVoador(Voador umVoador){
        for(int i=0; i< listaDeVoadores.length; i++){
            if(listaDeVoadores[i] == null){
                listaDeVoadores[i] = umVoador;
                break;
            }
        }
    }

    public static void main(String[] args) {
        Pato novoPato = new Pato();
        novoPato.setEnergia(50);

        Aviao novoAviao = new Aviao();
        novoAviao.setHorasDeVoo(0);

        SuperHomem clarkKent = new SuperHomem();
        clarkKent.setExperiencia(10);

        TorreDeControle torre = new TorreDeControle();
        torre.adicionarVoador(novoPato);
        torre.adicionarVoador(novoAviao);
        torre.adicionarVoador(clarkKent);

        torre.voemTodos();
    }

}
