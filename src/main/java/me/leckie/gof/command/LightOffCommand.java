package me.leckie.gof.command;

/**
 * @author Leckie
 * @version $Id: LightOffCommand.java, v0.1 2018/11/27 11:58 Leckie Exp $$
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
