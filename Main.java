package org.example;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длительность вклада в месяцах:");
        int depTerm = sc.nextInt();
        System.out.println("Введите годовой процент:");
        double annPerc = sc.nextDouble();
        System.out.println("Введите начальную сумму:");
        double deposit = sc.nextDouble();
        double initDep = deposit;
        sc.close();

        for (int i = 1; i <= depTerm; i++)
        {
            deposit += deposit*((annPerc/100.0)/12.0);
        }

        double income = Math.round((deposit - initDep)*100.0) / 100.0;
        System.out.println("\nДоход за " + depTerm + " месяцев: " + income + "\n");
        double avgIncome = Math.round((income / depTerm)*100.0 ) / 100.0;
        System.out.println("Средний ежемесячный доход: " + avgIncome + "\n");

    }
}