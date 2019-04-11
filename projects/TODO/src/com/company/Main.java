package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static Todofunction myTodoList=new Todofunction();

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello world");

        int command=0;
        boolean exit = false;
        printcommand();

        while(!exit){
            System.out.println("Enter your command/choice");
            command = in.nextInt();
            in.nextLine();

            switch (command){
                case 0:
                    printcommand();
                    break;
                case 1:
                    myTodoList.printTodoList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    updateItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("wrong command");

            }
        }
    }

    public static void printcommand(){
        System.out.println("I will print");
    }

    public static void addItem(){
        System.out.println("Enter item to be added in todo list ");
        myTodoList.addItem(in.nextLine());
    }

    public static void updateItem(){
        System.out.println("Enter item number ");
        int index = in.nextInt();
        in.nextLine();
        System.out.println("Enter new item to be added");
        String myNewItem = in.nextLine();
        myTodoList.updatetodo(index-1,myNewItem);
    }
    public static void removeItem(){
        System.out.println("Enter item to be deleted ");
        int index=in.nextInt();
        in.nextLine();
        myTodoList.removeItem(index-1);
    }

    public static void searchItem(){
        System.out.println("Enter item to be searched ");
        String searchItem = in.nextLine();

        if(myTodoList.findItem(searchItem)==null){
            System.out.println("item not found");
        }else{
            System.out.println(searchItem+"was found in your list");

        }
    }
}
