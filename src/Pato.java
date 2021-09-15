public class Pato implements Voador{

    private int energia;

    @Override
    public void voar() {
        this.energia -= 5;
        System.out.println("Estou voando como um pato");
    }

    public int getEnergia() {
        return energia;
    }
    public void setEnergia(int energia) {
        this.energia = energia;
    }
}
