package section03.chapter13;

public class SleepCommand implements Command {

    private Command wakeupCommand = null;
    private ActiveObjectEngine activeObjectEngine = null;
    private long sleepTime = 0;
    private long startTime = 0;
    private boolean started = false;

    public SleepCommand(long milliseconds, ActiveObjectEngine activeObjectEngine, Command wakeupCommand) {
        this.sleepTime = milliseconds;
        this.activeObjectEngine = activeObjectEngine;
        this.wakeupCommand = wakeupCommand;
    }

    @Override
    public void execute() {
        long currentTime = System.currentTimeMillis();

        if (!started) {
            started = true;
            this.startTime = currentTime;
            this.activeObjectEngine.addCommand(this);
        }
        else if ((currentTime - startTime) < sleepTime) {
           activeObjectEngine.addCommand(this);
        }
        else {
            activeObjectEngine.addCommand(wakeupCommand);
        }
    }

}
