package me.leckie.gof.proxy.stat;

/**
 * @author laixianbo
 * @version $Id: UserDAOImpl.java, v0.1 2018/11/28 14:08 laixianbo Exp $$
 */
public class UserDAOImpl implements UserDAO {

  @Override
  public void save() {
    System.out.println("---save data---");
  }
}
