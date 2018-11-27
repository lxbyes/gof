package me.leckie.gof.command;

/**
 * @author laixianbo
 * @version $Id: LightOffCommand.java, v0.1 2018/11/27 11:58 laixianbo Exp $$
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
