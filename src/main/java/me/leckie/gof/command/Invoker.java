package me.leckie.gof.command;

/**
 * @author laixianbo
 * @version $Id: Invoker.java, v0.1 2018/11/27 12:28 laixianbo Exp $$
 */
public class Invoker {

    private Command[] onCommands;

    private Command[] offCommands;

    private final int slotNum = 7;

    public Invoker() {
        onCommands = new Command[slotNum];
        offCommands = new Command[slotNum];
    }

    public void setOnCommands(int slot, Command onCommand) {
        this.onCommands[slot] = onCommand;
    }

    public void setOffCommands(int slot, Command offCommand) {
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }
}
