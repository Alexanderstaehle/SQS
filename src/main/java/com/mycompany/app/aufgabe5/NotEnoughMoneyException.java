package com.mycompany.app.aufgabe5;

public class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException() {
        super("Not enough money");
    }
}
