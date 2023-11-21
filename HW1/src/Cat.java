public class Cat extends Animal {
    private static final int MAX_RUN_DISTANCE = 200;
    private static final int MAX_SWIM_DISTANCE = 10;

    public Cat(String name, int distance) {
        super(name, distance);
    }
    @Override
    public void run(){
        printLog(this.getDistance() <= MAX_RUN_DISTANCE, Active.RUN.getActive(), MAX_RUN_DISTANCE);
    }
    @Override
    public void swim() {
        if (getCanSwim()) printLog(getDistance() <= MAX_SWIM_DISTANCE, Active.SWIM.getActive(), MAX_SWIM_DISTANCE);
        else System.out.println(String.format("%s %s", getName(), Active.NO_SWIM.getActive()));
    }
    private void printLog(boolean distanceLargeMax, String active, int maxDistance) {
        if (distanceLargeMax) System.out.println(String.format("%s %s %d", getName(), active, getDistance()));
        else System.out.println(String.format("%s %s %d", getName(), active, maxDistance));
    }
}
