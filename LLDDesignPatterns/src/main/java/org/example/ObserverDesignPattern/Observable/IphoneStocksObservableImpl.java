package org.example.ObserverDesignPattern.Observable;

import org.example.ObserverDesignPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStocksObservableImpl implements StocksObservable{
    List<NotificationAlertObserver> alertObserverList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver alertObserver) {
        alertObserverList.add(alertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver alertObserver) {
        alertObserverList.remove(alertObserver);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver notificationAlertObserver: alertObserverList){
            notificationAlertObserver.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockCount == 0){
            notifySubscribers();
        }
        if(newStockAdded == 0){
            stockCount = 0;
        }else{
            stockCount += newStockAdded;
        }
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
