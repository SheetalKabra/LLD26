package org.example.ObserverDesignPattern.Observer;

import org.example.ObserverDesignPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    private String mobileNumber;
    private StocksObservable observable;
    public MobileAlertObserverImpl(String mobileNumber, StocksObservable stocksObservable) {
        this.mobileNumber = mobileNumber;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsgOnMobile();
    }
    private void sendMsgOnMobile(){
        System.out.println("notify me over the mobile...");
    }
}
