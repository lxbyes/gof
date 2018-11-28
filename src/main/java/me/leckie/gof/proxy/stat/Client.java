package me.leckie.gof.proxy.stat;

/**
 * @author laixianbo
 * @version $Id: Client.java, v0.1 2018/11/28 14:11 laixianbo Exp $$
 */
public class Client {

  public static void main(String[] args) {
    UserDAO userDAO = new UserDAOImpl();
    UserDAO userDAOProxy = new UserDAOProxy(userDAO);
    userDAOProxy.save();
  }
}
