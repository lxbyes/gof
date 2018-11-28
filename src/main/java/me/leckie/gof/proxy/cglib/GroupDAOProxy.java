package me.leckie.gof.proxy.cglib;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author laixianbo
 * @version $Id: GroupDAOProxy.java, v0.1 2018/11/28 14:50 laixianbo Exp $$
 */
public class GroupDAOProxy implements MethodInterceptor {

  @Override
  public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
    System.out.println("Before Method Invoke " + method.getDeclaringClass().getName() + "#" + method.getName());
    proxy.invokeSuper(obj, args);
    System.out.println("After Method Invoke " + method.getDeclaringClass().getName() + "#" + method.getName());
    return obj;
  }
}
