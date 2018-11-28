package me.leckie.gof.proxy.cglib;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.CallbackFilter;

/**
 * @author laixianbo
 * @version $Id: DaoFilter.java, v0.1 2018/11/28 15:31 laixianbo Exp $$
 */
public class DaoFilter implements CallbackFilter {

  @Override
  public int accept(Method method) {
    switch (method.getName()) {
      case "update":
        return 0;
    }
    return 1;
  }
}
