package com.company.creational.builder.digitalocean;

public class Main {
    public static void main(String[] args) {
/*
        computer = {Computer@458}
        HDD = "500 GB"
        RAM = "4 GB"
        isGraphicsCardEnabled = true
        isBluetoothEnabled = false
*/
        Computer computer = new Computer.ComputerBuilder("500 GB", "4 GB")
                .setGraphicsCardEnabled(true)
                .build();
    }
}
