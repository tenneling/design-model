package com.wyn.facade.car;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/28 16:12$
 */
public class CarFacade {

    public void cargo(Car car){
        car.checkStop();
        car.checkBox();
        car.checkConsole();
        car.start();
    }

    public static void main(String[] args) {
        Car car = new Car();
        CarFacade carFacade = new CarFacade();
        carFacade.cargo(car);
    }
}

    