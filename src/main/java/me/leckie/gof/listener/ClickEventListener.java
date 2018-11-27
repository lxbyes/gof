/**
 * BBD Service Inc All Rights Reserved @2018
 */
package me.leckie.gof.listener;

/**
 * @author Leckie
 * @version $Id: ClickEventListener.java, v0.1 2018/10/16 14:08 Leckie Exp $$
 */
@FunctionalInterface
public interface ClickEventListener extends EventListener {

  void onClick(ClickEvent event);

}
