package Scheduler.SRT;

import Scheduler.Scheduler;
import Scheduler.Process;

/**
 * Created by ben on 24/08/2016.
 */
public class SRTScheduler extends Scheduler {

    @Override
    public String schedulerName() {
        return null;
    }

    @Override
    public void onStart() {
        System.out.println("Starting SRT");
    }

    @Override
    public void onStop() {
        System.out.println("Finished SRT");
    }

    @Override
    public void onTick() {

    }

    @Override
    public void processIncoming(Process process) {

    }
}
