/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19library;

import entity.Reader;
import entity.Book;
import java.util.Scanner;

/**
 *
 * @author user
 */
class App {
    public void run(){
        System.out.println("--- Библиотека ---");
        boolean repeat = true;
        do{
            System.out.println("0. Выйти из программы");
            System.out.println("1. Добавить новую книгу");
            System.out.println("2. Посмотреть спиок книг");
            System.out.println("3. Зарегестрировать пользователя");
            System.out.println("4. Выдать книгу читателю");
            System.out.println("5. Вернуть книгу в библиотеку");
            System.out.print("Выберите задачу: ");
            Scanner scanner = new Scanner(System.in);
            String task = scanner.nextLine();
            switch (task) {
                case "0":
                    System.out.println("--- Конец программы ---");
                    repeat = false;
                    break;
                case "1":
                    System.out.println("--- Добавить новую книгу ---");
                    Book book = new Book("Voina i mir", "L.Tolstoi", 2010);
                    System.out.println("Добавлена книга: " + book.getName());
                    break;
                case "2":
                    System.out.println("--- Посмотреть список книг ---");
                    break;
                case "3":
                    System.out.println("--- Зарегистрировать пользователя --");
                    Reader reader = new Reader();
                    System.out.println("Добавлен читатель: " + reader.toString());
                    break;
                case "4":
                    System.out.println("--- Выдать книгу читателю ---");
                    break;
                case "5":
                    System.out.println("--- Вернуть книгу в библиотеку ---");
                    break;
                default:
                    System.out.println("Нет такой задачи!");
            }
        }while(repeat);
    }
}
