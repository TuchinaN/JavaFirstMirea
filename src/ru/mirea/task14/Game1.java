package ru.mirea.task14;
import java.util.Stack;
public class Game1
{
    Stack<Integer> fp, sp;
    public Game1(String fp, String sp)
    {
        this.fp = new Stack<>();
        this.sp = new Stack<>();
        for(int i = 4; i >= 0; i--)
        {
            this.fp.push(Integer.parseInt(fp.substring(i, i+1)));
            this.sp.push(Integer.parseInt(sp.substring(i, i+1)));
        }
    }
    private void pushBack(Stack<Integer> s, Integer item)
    {
        Stack<Integer> ns = new Stack<>();
        while (!s.isEmpty())
            ns.push(s.pop());
        s.push(item);
        while (!ns.isEmpty())
            s.push(ns.pop());
    }
    public String play()
    {
        int count = 0;
        while(!fp.isEmpty() && !sp.isEmpty() && count <= 106)
        {
            if(fp.peek() > sp.peek() && sp.peek() != 0)
            {
                    pushBack(fp, fp.pop());
                    pushBack(fp, sp.pop());
            }
            else
            {
                pushBack(sp, fp.pop());
                pushBack(sp, sp.pop());
            }
            count++;
        }
        String res = "";
        if(fp.isEmpty()) res += "second ";
        else res += "first ";
        res += count;
        if(count >= 106) res += " botva";
        return res;
    }
    public static void main(String[] args)
    {
        System.out.println(new Game1("56478", "36478").play());
    }

}