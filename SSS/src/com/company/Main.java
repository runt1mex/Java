package com.company;

import com.company.lesson.stack.stack1.StackOfStrings;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main
{

    public static void inOut(Scanner in, PrintStream out)
    {
        while (in.hasNext()) {
            out.println(in.next());
        }
    }

    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	PrintStream out = System.out;
	StackOfStrings(in, out);
    }

    private static void StackOfStrings(Scanner in, PrintStream out)
    {
        StackOfStrings stack = new StackOfStrings();
        while (in.hasNext())
        {
            String s = in.next();
            if ((s.equals("-")))
            {
                out.print(stack.pop() + " ");
            }
            else
            {
                stack.push(s);
            }
        }
    }
}
