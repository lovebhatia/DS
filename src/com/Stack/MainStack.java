package com.Stack;

public class MainStack
{
    public static void  main(String [] args) throws Exception
    {
        FixedSizeArrayStack stack=new FixedSizeArrayStack(3);
        stack.push(15);
        stack.push(16);
        stack.push(17);
        System.out.println(stack);
        stack.pop();
        stack.pop();
        System.out.println(stack);

        int x = -4;
        System.out.println(x>>1);
        int y = 1;
        System.out.println(y<<15);




    }
}
