package org.example.ObserverDesignPattern.Observable;

import org.example.ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {
    void add(NotificationAlertObserver notificationAlertObserver);
    void remove(NotificationAlertObserver notificationAlertObserver);
    void notifySubscribers();
    void setStockCount(int newStockAdded);
    int getStockCount();

}
