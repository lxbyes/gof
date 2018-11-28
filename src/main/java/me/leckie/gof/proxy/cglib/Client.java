package me.leckie.gof.proxy.cglib;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

/**
 * @author laixianbo
 * @version $Id: Client.java, v0.1 2018/11/28 14:55 laixianbo Exp $$
 */
public class Client {

  public static void main(String[] args) {
    GroupDAOProxy daoProxy = new GroupDAOProxy();
    AnotherGroupDAOProxy anotherGroupDAOProxy = new AnotherGroupDAOProxy();

    Enhancer enhancer = new Enhancer();
    enhancer.setSuperclass(GroupDAO.class);
    enhancer.setCallbacks(new Callback[]{daoProxy, anotherGroupDAOProxy, NoOp.INSTANCE});
    enhancer.setCallbackFilter(new DaoFilter());

    GroupDAO groupDAO = (GroupDAO) enhancer.create();
    groupDAO.save();
    groupDAO.update();
  }
}
