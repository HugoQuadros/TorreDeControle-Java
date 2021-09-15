public class Aviao implements Voador{

    private int horasDeVoo;

    @Override
    public void voar() {
        this.horasDeVoo += 13;
        System.out.println("Estou voando como um avião");
    }

    public int getHorasDeVoo() {
        return horasDeVoo;
    }
    public void setHorasDeVoo(int horasDeVoo) {
        this.horasDeVoo = horasDeVoo;
    }
}
