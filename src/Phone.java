public class Phone {
    long number;
    String model;
    int weight;

    public Phone() {
    }

    public Phone(long number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(long number, String model) {
        this.number = number;
        this.model = model;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return
                "\nNumber: " + number +
                        "\nModel: " + model +
                        "\nWeight: " + weight;
    }

    public void receiveCall(String name) {
        System.out.println("\nЗвонит: " + name);
    }

    public void receiveCall(String name, long number) {
        System.out.println("\nЗвонит: " + name);
        System.out.println("Номер: +" + number);
    }

    public void sendMassage(long[] number) {

        for (long l : number) {

            System.out.println("\nСообщение отправлено на номер: " + l);
        }


    }
}
