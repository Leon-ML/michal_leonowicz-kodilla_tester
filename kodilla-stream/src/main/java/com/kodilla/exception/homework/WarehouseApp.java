package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("124412"));
        warehouse.addOrder(new Order("123123"));
        warehouse.addOrder(new Order("535125"));
        warehouse.addOrder(new Order("512515"));


        try {
            Order result = warehouse.getOrder("124412");
            System.out.println(result);
        } catch (OrderDoesntExistException e) {
            System.out.println("Order does not exist. Try different number.");
        }
    }

}
