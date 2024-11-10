import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача № 1");
int clientOS = 3;
if(clientOS ==0){
    System.out.println("Установите версию приложения для iOS по ссылке");}
else if(clientOS ==1)
            System.out.println("Установите версию приложения для Android по ссылке");
else {System.out.println("Уточните, какая ОС на вашем смартфоне?");}
        System.out.println("Задача № 2");
int clientDeviseYear = 2014;
if(clientOS==0 && clientDeviseYear <2015){
    System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
else if(clientOS==0 && clientDeviseYear >=2015){
    System.out.println("Установите обычнную версию приложения для iOS по ссылке");}
else if(clientOS==1 && clientDeviseYear <2015){
    System.out.println("Установите облегченную версию приложения для Android по ссылке");}
else {
    System.out.println("Установите обычнную версию приложения для Android по ссылке");}
        System.out.println("Задача № 3");
int year=2020;
if (year > 1854){
if((year%4 ==0) || (year%400 ==0 && year%100 !=0)){
    System.out.println(+year+ " год является високосным");}
else {System.out.println(+year+ " год не является високосным");}}
else {
        System.out.println("Год не может быть меньше 1585");}
        System.out.println("Задача № 4");
int deliveryDistance = 95;
int deliveryTime = 1;
if (deliveryDistance >=20) {
    deliveryTime++;
}
if (deliveryDistance >=60) {
   deliveryTime++;
}
if (deliveryDistance >100){
    System.out.println("Доставки нет");}
if (deliveryDistance <=100){
    System.out.println("Доставка займет " +deliveryTime+ " суток");}
        System.out.println("Задача № 5");
int monthNumber = 12;
switch (monthNumber) {
    case 1:
    case 2:
    case 12:
        System.out.println("Месяц принадлежит к сезону зима");
        break;
    case 3:
    case 4:
    case 5:
        System.out.println("Месяц принадлежит к сезону весна");
        break;
    case 6:
    case 7:
    case 8:
        System.out.println("Месяц принадлежит к сезону лето");
        break;
    case 9:
    case 10:
    case 11:
        System.out.println("Месяц принадлежит к сезону осень");
        break;
    default:
        System.out.println("Такого месяца не существует");
}
}
}