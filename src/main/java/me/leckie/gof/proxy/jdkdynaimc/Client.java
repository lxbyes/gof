package me.leckie.gof.proxy.jdkdynaimc;

import me.leckie.gof.proxy.stat.UserDAO;
import me.leckie.gof.proxy.stat.UserDAOImpl;

/**
 * @author laixianbo
 * @version $Id: Client.java, v0.1 2018/11/28 14:26 laixianbo Exp $$
 */
public class Client {

  public static void main(String[] args) {
    UserDAO userDAO = new UserDAOImpl();
    UserDAO proxyInstance = ProxyFactory.getProxyInstance(userDAO);
    proxyInstance.save();
  }
}
