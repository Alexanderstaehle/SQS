package com.mycompany.app.aufgabe5;

public interface VendingMachine {

    void selectItem(int boxIndex) throws
            NotEnoughMoneyException,
            BoxEmptyException;

}


