public class Tiger extends Animal{
    private static final int MAX_RUN_DISTANCE = 700;
    private static final int MAX_SWIM_DISTANCE = 30;
    protected boolean getCanSwim() {
        return true;
    }

    Tiger(String name, int distance) {
        super(name, distance);
        getCanSwim();
    }
    @Override
    void swim() {
        if (getCanSwim()) printLog(getDistance() <= MAX_SWIM_DISTANCE, Active.SWIM.getActive(), MAX_SWIM_DISTANCE);
        else System.out.println(String.format("%s %s", getName(), Active.NO_SWIM.getActive()));
    }
    @Override
    void run() {
        printLog(getDistance() <= MAX_RUN_DISTANCE, Active.RUN.getActive(), MAX_RUN_DISTANCE);
    }
    private void printLog(boolean distanceLargeMax, String active, int maxDistance) {
        if (distanceLargeMax) System.out.println(String.format("%s %s %d", getName(), active, getDistance()));
        else System.out.println(String.format("%s %s %d", getName(), active, maxDistance));
    }
}
