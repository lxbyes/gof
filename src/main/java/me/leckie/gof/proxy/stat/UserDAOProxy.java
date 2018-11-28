package me.leckie.gof.proxy.stat;

/**
 * @author laixianbo
 * @version $Id: UserDAOProxy.java, v0.1 2018/11/28 14:09 laixianbo Exp $$
 */
public class UserDAOProxy implements UserDAO {

  private UserDAO userDAO;

  public UserDAOProxy(UserDAO userDAO) {
    this.userDAO = userDAO;
  }

  @Override
  public void save() {
    System.out.println("---start trans---");
    userDAO.save();
    System.out.println("---end trans---");
  }
}
