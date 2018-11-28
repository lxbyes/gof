package me.leckie.gof.command;

/**
 * @author Leckie
 * @version $Id: Client.java, v0.1 2018/11/27 12:46 Leckie Exp $$
 */
public class Client {

  public static void main(String[] args) {
    Invoker invoker = new Invoker();
    Light light = new Light();
    LightOnCommand lightOnCommand = new LightOnCommand(light);
    LightOffCommand lightOffCommand = new LightOffCommand(light);
    invoker.setOnCommands(0, lightOnCommand);
    invoker.setOffCommands(0, lightOffCommand);
    invoker.onButtonWasPushed(0);
    invoker.offButtonWasPushed(0);
  }

}
