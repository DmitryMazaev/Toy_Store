public class Toy {
    private int idToy;
    private String nameToy;
    private int frequency;

    public Toy (int idToy, String nameToy, int frequency)
    {
        this.idToy = idToy;
        this.nameToy = nameToy;
        this.frequency = frequency;
    }

    public int getIdToy() {
        return idToy;
    }

    public String getNameToy() {
        return nameToy;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString()
    {
        return "Игрушка " + this.nameToy;
    }
}
