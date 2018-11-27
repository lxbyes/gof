/**
 * BBD Service Inc All Rights Reserved @2018
 */
package me.leckie.gof.rx;

import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Leckie
 * @version $Id: RxTest.java, v0.1 2018/10/17 14:44 Leckie Exp $$
 */
public class RxTest {

  public static void main(String[] args) {

    ExecutorService executorService1 = Executors.newFixedThreadPool(10);
    ExecutorService executorService2 = Executors.newFixedThreadPool(10);

    Observable<String> novel = Observable.create((ObservableOnSubscribe<String>) emitter -> {
      emitter.onNext("连载1");
      emitter.onNext("连载1");
      emitter.onNext("连载1");
      emitter.onNext("COMPLETED");
      emitter.onComplete();
    }).subscribeOn(Schedulers.from(executorService2)).observeOn(Schedulers.from(executorService1));

    Observer<String> reader = new Observer<String>() {
      Disposable mDisposable;

      @Override
      public void onSubscribe(Disposable d) {
        mDisposable = d;
        System.out.println("OnSubscribe -" + Thread.currentThread().getName());
      }

      @Override
      public void onNext(String s) {
        if ("COMPLETED".equalsIgnoreCase(s)) {
          // mDisposable.dispose();
          System.out.println("dispose");
        }
        System.out.println("OnNext -> " + s + " -" + Thread.currentThread().getName());
      }

      @Override
      public void onError(Throwable e) {
        System.out.println("OnError -> " + e.getMessage());
      }

      @Override
      public void onComplete() {
        System.out.println("OnComplete");
        mDisposable.dispose();
      }
    };

    novel.subscribe(reader);
    System.out.println("Main -" + Thread.currentThread().getName());
  }

}
