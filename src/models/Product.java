package models;


import base.Fiscal;
import base.Income;

// Model.
// Примените интерфейсы Income, Fiscal, переопределите их методы.
public class Product implements Income, Fiscal {

    // Объявление полей модели
    private String name;
    private int quantity;
    private double price;
    private final double RATE = 0.05;

    public Product() {
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getRATE() {
        return RATE;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double calculateIncome() {
        return quantity * price;
    }

    @Override
    public double calculateTax(double income) {
        return income * RATE;
    }

    @Override
    public double calculateIncome(double income, double tax) {
        return income - tax;
    }

}

// Налоговоу ставку объявите в виде константы
// здесь ...


// Обеспечьте доступ к полям модели через getters и setters
// здесь ...


// Переопределите методы реализуемых интерфейсов.

// Расчёт дохода от продаж, до уплаты налога.
// здесь ...

// Расчёт суммы налога с продаж.
// здесь ...

// Расчёт чистого дохода, после уплаты налога.
// здесь ...
