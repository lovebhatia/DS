package com.Stack;

public class FixedSizeArrayStack {
    protected  int capacity;
    public static  final int CAPACITY=10;
    protected int[] stackRep;
    protected  int top=-1;
    public FixedSizeArrayStack()
    {
        this(CAPACITY);
    }
    public FixedSizeArrayStack(int cap)
    {
        capacity=cap;
        stackRep=new int[capacity];
    }
    public int size()
    {
        return (top+1);
    }
    public boolean isEmpty()
    {
        return (top < 0);
    }
    public void push(int data) throws  Exception
    {
        if(size()==capacity)
            throw new Exception("stack is full");
        stackRep[++top]=data;
    }
    public int top() throws Exception
    {
        if(isEmpty())
            throw new Exception("Stack is empty");
        return stackRep[top];
    }
    public int pop() throws Exception
    {
        if(isEmpty())
            throw new Exception("Stack is Empty");
        int data;
        data=stackRep[top];
        stackRep[top--]=Integer.MIN_VALUE;
        return data;
    }
    public String toString()
    {
        String s;
        s="[";
        if(size()>0)
            s+=stackRep[0];
        if(size()>1)
            for (int i=1;i<stackRep.length;i++)
                s+=","+stackRep[i];
            return  s +"]";
    }
}
