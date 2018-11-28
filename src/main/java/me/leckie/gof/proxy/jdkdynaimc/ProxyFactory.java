package me.leckie.gof.proxy.jdkdynaimc;

import java.lang.reflect.Proxy;

/**
 * @author laixianbo
 * @version $Id: ProxyFactory.java, v0.1 2018/11/28 14:16 laixianbo Exp $$
 */
public class ProxyFactory {

  public static <T> T getProxyInstance(T target) {
    return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
        (proxy, method, args) -> {
          System.out.println("---start jdk proxy---");
          Object ret = method.invoke(target, args);
          System.out.println("---end jdk proxy---");
          return ret;
        });
  }

}
