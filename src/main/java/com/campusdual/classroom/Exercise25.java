package com.campusdual.classroom;

import java.util.Stack;

public class Exercise25 {
    public static Stack<String> createStack() {
        Stack<String>pila = new Stack<String>();
        pila.push("Smith");
        pila.push("Montessori");
        pila.push("Peralta");
        pila.push("House");
        return pila;
    }

    public static void printAndEmptyStack(Stack<String> stack) {

        while (!stack.isEmpty()) {
            // Imprimimos el elemento en la cima y lo quitamos de la pila
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<String>pilaR=createStack();

        printAndEmptyStack(pilaR);
    }



}
