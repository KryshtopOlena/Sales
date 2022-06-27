package controllers;

import models.Product;
import views.SalesView;

import static utils.Rounder.round;

// Controller
public class ProductController {

    Product model;
    SalesView view;

    // Конструктор
    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();

        String name = model.getName();

        double income = model.calculateIncome();
        String incomeResult = round(income);

        double tax = model.calculateTax(income);
        String taxResult = round(tax);

        double netIncome = model.calculateIncome(income, tax);
        String netIncomeResult = round(netIncome);

        // Здесь, реализуйте:
        // 1) получение имени товара через модель;
        // 2) вызов методов расчетов доходов и налога;
        // 3) округление расчетных значений;
        // 4) вывод расчетов по заданному формату.

        String output = "Наименование товара: " + name + "\n"
                + "Общий доход (грн.): " + incomeResult + "\n"
                + "Сумма налога (грн.): " + taxResult + "\n"
                + "Чистый доход (грн.): " + netIncomeResult;

        view.getOutput(output);
    }

}
