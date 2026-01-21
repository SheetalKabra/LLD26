package org.example.ObserverDesignPattern.Observer;

import org.example.ObserverDesignPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    private String emailId;
    private StocksObservable observable;
    public EmailAlertObserverImpl(String emailId, StocksObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsgOnEmail();
    }

    private void sendMsgOnEmail(){
        System.out.println("notify me over the email...");
    }
}
