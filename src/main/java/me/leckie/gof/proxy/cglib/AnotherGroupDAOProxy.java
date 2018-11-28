package me.leckie.gof.proxy.cglib;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author laixianbo
 * @version $Id: AnotherGroupDAOProxy.java, v0.1 2018/11/28 15:29 laixianbo Exp $$
 */
public class AnotherGroupDAOProxy implements MethodInterceptor {

  @Override
  public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
    System.out.println("Before Another Method Invoke " + method.getDeclaringClass().getName() + "#" + method.getName());
    proxy.invokeSuper(obj, args);
    System.out.println("After Another Method Invoke " + method.getDeclaringClass().getName() + "#" + method.getName());
    return obj;
  }
}
