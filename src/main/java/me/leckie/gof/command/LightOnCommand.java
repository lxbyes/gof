package me.leckie.gof.command;

/**
 * @author laixianbo
 * @version $Id: LightOnCommand.java, v0.1 2018/11/27 11:56 laixianbo Exp $$
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
