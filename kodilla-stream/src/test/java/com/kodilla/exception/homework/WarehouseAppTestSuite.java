package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class WarehouseAppTestSuite {

    @Test
    public void isWrongOrderFound() throws OrderDoesntExistException{
        // given
        Warehouse warehouse = new Warehouse();
        // when

        // then
        assertThrows(OrderDoesntExistException.class, ()-> warehouse.getOrder("999999"));
    }

}