package section03.chapter13;

import org.junit.Assert;
import org.junit.Test;

public class SleepCommandTest {

    private boolean commandExecuted = false;

    @Test
    public void testSleep() {
        Command wakeup = new Command() {
            @Override
            public void execute() {
                commandExecuted = true;
            }
        };

        ActiveObjectEngine activeObjectEngine = new ActiveObjectEngine();
        SleepCommand sleepCommand = new SleepCommand(1000L, activeObjectEngine, wakeup);
        activeObjectEngine.addCommand(sleepCommand);

        long start = System.currentTimeMillis();
        activeObjectEngine.run();
        long stop = System.currentTimeMillis();

        long sleepTime = stop - start;

        Assert.assertTrue(sleepTime >= 1000);
        Assert.assertTrue(sleepTime <= 1100);
        Assert.assertTrue(commandExecuted);
    }

}
