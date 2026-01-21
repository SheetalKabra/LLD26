package org.example.ObserverDesignPattern;

import org.example.ObserverDesignPattern.Observable.IphoneStocksObservableImpl;
import org.example.ObserverDesignPattern.Observable.StocksObservable;
import org.example.ObserverDesignPattern.Observer.EmailAlertObserverImpl;
import org.example.ObserverDesignPattern.Observer.MobileAlertObserverImpl;
import org.example.ObserverDesignPattern.Observer.NotificationAlertObserver;

public class Stock {
    public static void main(String[] args) {
        StocksObservable iphoneStocksObservable = new IphoneStocksObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@gmail.com", iphoneStocksObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("abc@gmail.com", iphoneStocksObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("abc@gmail.com", iphoneStocksObservable);

        iphoneStocksObservable.add(observer1);
        iphoneStocksObservable.add(observer2);
        iphoneStocksObservable.add(observer3);

        iphoneStocksObservable.setStockCount(10);
        iphoneStocksObservable.setStockCount(10);
        iphoneStocksObservable.setStockCount(0);
        iphoneStocksObservable.setStockCount(10);

    }
}
