package com.example.calculator;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.Label;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textfield;

    @FXML
    private Button b0;

    @FXML
    private Button b1;

    @FXML
    private Button b2;

    @FXML
    private Button b3;

    @FXML
    private Button b4;

    @FXML
    private Button b5;

    @FXML
    private Button b6;

    @FXML
    private Button b7;

    @FXML
    private Button b8;

    @FXML
    private Button b9;

    @FXML
    private Button del;// C

    @FXML
    private Button cancel;// D

    @FXML
    private Button addition;// +

    @FXML
    private Button subtruction;// -

    @FXML
    private Button multiplication;// *

    @FXML
    private Button division;// /

    @FXML
    private Button result;// =

    @FXML
    private Button sign;//изменение знака

    @FXML
    private Button sqrt;// корень

    private String text = "";
    private int a = 0;//записывается введенное число с кнопок(цифра, написанная на кнопке выводится в текстовое поле и число преобразуется в целочисленный тип
    private int b = 0;
    private char z;//хранится символ - знак для вывод при нажатии равно

    @FXML
    void initialize() {
        b1.setOnAction(actionEvent -> {//обработчик события нажания на клавишу
            text += b1.getText();
            textfield.setText(text);//вывод в текстовое поле полученного текста с кнопки
        });
        b2.setOnAction(actionEvent -> {//обработчик события нажания на клавишу
            text += b2.getText();
            textfield.setText(text);//вывод в текстовое поле полученного текста с кнопки
        });
        b3.setOnAction(actionEvent -> {//обработчик события нажания на клавишу
            text += b3.getText();
            textfield.setText(text);//вывод в текстовое поле полученного текста с кнопки
        });
        b4.setOnAction(actionEvent -> {//обработчик события нажания на клавишу
            text += b4.getText();
            textfield.setText(text);//вывод в текстовое поле полученного текста с кнопки
        });
        b5.setOnAction(actionEvent -> {//обработчик события нажания на клавишу
            text += b5.getText();
            textfield.setText(text);//вывод в текстовое поле полученного текста с кнопки
        });
        b6.setOnAction(actionEvent -> {//обработчик события нажания на клавишу
            text += b6.getText();
            textfield.setText(text);//вывод в текстовое поле полученного текста с кнопки
        });
        b7.setOnAction(actionEvent -> {//обработчик события нажания на клавишу
            text += b7.getText();
            textfield.setText(text);//вывод в текстовое поле полученного текста с кнопки
        });
        b8.setOnAction(actionEvent -> {//обработчик события нажания на клавишу
            text += b8.getText();
            textfield.setText(text);//вывод в текстовое поле полученного текста с кнопки
        });
        b9.setOnAction(actionEvent -> {//обработчик события нажания на клавишу
            text += b9.getText();
            textfield.setText(text);//вывод в текстовое поле полученного текста с кнопки
        });
        del.setOnAction(actionEvent -> {//обработчик события нажания на клавишу
            text = "";//очищение поля
            textfield.setText(text);//вывод в текстовое поле полученного текста с кнопки
        });
        cancel.setOnAction(actionEvent -> {
            text = (text == null || text.length() == 0) ? null : text.substring(0, text.length() - 1);//удалить последний символ в строке
            textfield.setText(text);
        });
        sign.setOnAction(actionEvent -> {
            text = "-" + textfield.getText();
            textfield.setText(text);
        });
        sqrt.setOnAction(actionEvent -> {
            a = Integer.parseInt(text);
            String formattedDouble = new DecimalFormat("#0.00000").format(Math.sqrt(a));
            textfield.setText(String.valueOf(formattedDouble));
            a = 0;
            text = "";
        });
        addition.setOnAction(actionEvent -> {
            a = Integer.parseInt(text);//строка, полученнная из текстового поля преобразуется в число и записывается в переменную
            //textfield.setText(text);//не отображать знак в конце
            textfield.setText(text + addition.getText());//вывод числа и знака операции
            text = "";//переменная, содерэащая  числа, обнуляется
            z = '+';//запомнить знак операции
        });
        subtruction.setOnAction(actionEvent -> {
            a = Integer.parseInt(text);
            textfield.setText(text + subtruction.getText());
            text = "";
            z = '-';
        });
        multiplication.setOnAction(actionEvent -> {
            a = Integer.parseInt(text);
            textfield.setText(text + multiplication.getText());
            text = "";
            z = '*';
        });
        division.setOnAction(actionEvent -> {
            a = Integer.parseInt(text);
            textfield.setText(text + division.getText());
            text = "";
            z = '/';
        });
        result.setOnAction(actionEvent -> {
            switch (z){
                case '+':
                    b = Integer.parseInt(text);//в переменную записывается строка, преобразованная в целое число
                    textfield.setText(String.valueOf(a+b));
                    break;
                case '-':
                    b = Integer.parseInt(text);//в переменную записывается строка, преобразованная в целое число
                    textfield.setText(String.valueOf(a-b));
                    break;
                case '*':
                    b = Integer.parseInt(text);//в переменную записывается строка, преобразованная в целое число
                    textfield.setText(String.valueOf(a*b));
                    break;
                case '/':
                    b = Integer.parseInt(text);//в переменную записывается строка, преобразованная в целое число
                    textfield.setText(String.valueOf(a/b) + "." + String.valueOf(a%b));
                    break;
                default:
                    System.out.println("Нет символа");
                    break;
            }
        });
    }

}

