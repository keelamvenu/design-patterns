package com.kmc.sigletonepattern;
class Demo
{
    String string;
    static Demo object;
    private Demo(String string)//parametarized contructor
    {
        this.string=string;
    }
    public static Demo getObject(String string)
    {
        if(object==null)
        {
            object =new Demo(string);
        }
        return object;
    }
}
public class Singelton
{
    public static void main(String[] args)
    {
    	Demo demo = Demo.getObject("kmc");
        Demo demo1= Demo.getObject("kmccorp");
        
        System.out.println(demo.string);
        System.out.println(demo1.string);
    }
}