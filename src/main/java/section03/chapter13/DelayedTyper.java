package section03.chapter13;

public class DelayedTyper implements Command {

    private long itsDelay;
    private char itsChar;
    private static ActiveObjectEngine activeObjectEngine = new ActiveObjectEngine();
    private static boolean stop = false;

    public DelayedTyper(long delay, char c) {
        this.itsDelay = delay;
        this.itsChar = c;
    }

    public static void main(String[] args) {
        activeObjectEngine.addCommand(new DelayedTyper(100L, '1'));
        activeObjectEngine.addCommand(new DelayedTyper(300L, '3'));
        activeObjectEngine.addCommand(new DelayedTyper(500L, '5'));
        activeObjectEngine.addCommand(new DelayedTyper(700L, '7'));

        Command stopCommand = new Command() {
            @Override
            public void execute() {
                stop = true;
            }
        };

        activeObjectEngine.addCommand(new SleepCommand(20000L, activeObjectEngine, stopCommand));
        activeObjectEngine.run();
    }

    @Override
    public void execute() {
        System.out.print(itsChar);

        if (!stop) {
            delayAndRepeat();
        }
    }

    private void delayAndRepeat() {
        activeObjectEngine.addCommand(new SleepCommand(this.itsDelay, activeObjectEngine, this));
    }

}
