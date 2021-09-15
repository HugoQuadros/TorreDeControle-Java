public class SuperHomem implements Voador{

    private int experiencia;

    @Override
    public void voar() {
        this.experiencia += 3;
        System.out.println("Estou voando como um campeão");
    }

    public int getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}
