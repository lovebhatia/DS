package com.Stack;

public class DynamicArrayStack {
    protected int capacity;
    public static final  int CAPACITY=10;
    public static int MINCAPACITY=1<<15;
    protected int[] stackRep;
    protected int top=-1;

    public DynamicArrayStack(int cap)
    {
        capacity=cap;
        stackRep=new int[capacity];
    }
    public  DynamicArrayStack()
    {
        this(CAPACITY);
    }
    public int size()
    {
        return (top+1);
    }
    public boolean isEmpty()
    {
        return (top<0);
    }
    public void push(int data) throws  Exception
    {
        if(size()==capacity)
            expand();
        stackRep[++top]=data;
    }

    public void expand()
    {
        int length=size();
        int [] newStack=new int[length << 2];
        System.arraycopy(stackRep,0,newStack,0,length);
        stackRep=newStack;
        this.capacity=this.capacity<<1;
    }
    public int top() throws Exception
    {
        if(size()<0)
            throw new Exception("stack is empty");
        return stackRep[top];
    }

    public int pop() throws  Exception
    {
        if(size()<0)
            throw new Exception("Stack is empty");
        int data;
        data=stackRep[top];
        stackRep[--top]=Integer.MIN_VALUE;
        return  data;
    }

    public String toString() {
        String s;
        s = "[";
        if (size() > 0)
            s += "" + stackRep[top];
        if (size() > 1)
            for (int i = 0; i <= size(); i++) {
                s += "," + stackRep[i];
            }
    return  s;
    }


}
