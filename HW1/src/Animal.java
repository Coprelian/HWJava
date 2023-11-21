public abstract class Animal {
    private int distance;
    int getDistance() {return this.distance;}
    private final String name;

    String getName() {return this.name;}
    private final boolean canSwim;
    boolean getCanSwim() {return this.canSwim;}

    protected enum Active {
        RUN("пробежал"),
        SWIM("проплыл"),
        NO_SWIM("не умеет плавать");
        String active;
        Active(String active) {
            this.active = active;
        }
        String getActive(){ return active;}
    }
    protected Animal(String name, int distance)
    {
        this.name = name;
        this.distance = distance;
        this.canSwim = false;
    }

    abstract void swim();

    abstract void run();
}