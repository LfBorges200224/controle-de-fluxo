package desafio;

import java.util.Scanner;

public class Conter {
    public static void main(String[] args) {
       Scanner terminal = new Scanner(System.in);
       System.out.println("Digite um número: ");
       int NumberOne = terminal.nextInt();
            System.out.println("Digite outro número: ");
        int NumberTwo = terminal.nextInt();

        try{
            counter(NumberOne, NumberTwo);
        } catch (ParametersInvalidExceptions exception) {
            System.out.println(exception.getMessage());
        }
    }

    static void Conter(int NumberOne, int NumberTwo) throws ParametersInvalidExceptions {
        if (NumberOne >= NumberTwo) {
            throw new ParametersInvalidExceptions();
        }

        int count= NumberTwo - NumberOne;
        for (int i = 1; i <= count i++) {
            System.out.println("imprimindo número: " + 1);
        }
    }
}