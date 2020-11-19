package com.mycompany.app.Aufgabe3;

public class Calculator implements ICalculator {

    /**
     * @param {Number} summand 1
     * @param {Number} summand 2
     * @returns {Number} addition of both params
     */
    @Override
    public int addition(int value1, int value2) {
        return value1 + value2;
    }

    /**
     * @param {Number} subtrahend 1
     * @param {Number} subtrahend 2
     * @returns {Number} subtraction of both params
     */
    @Override
    public int subtraction(int value1, int value2) {
        return value1 - value2;
    }

    /**
     * @param {Number} multiplier 1
     * @param {Number} multiplier 2
     * @returns {Number} multiplication of both params
     */
    @Override
    public int multiplication(int value1, int value2) {
        return value1 * value2;
    }

    /**
     * @param {Number} divisor 1
     * @param {Number} divisor 2
     * @returns {Number} division of both params
     */
    @Override
    public int division(int value1, int value2) {
        return value1 / value2;
    }
}
