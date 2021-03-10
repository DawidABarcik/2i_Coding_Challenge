public class Iteration {
    public static void main(String args[]) 
    {
        int a,b,c,x,y,z;
        int start = 1;
        int current = start;
        boolean last = false;;
        int i = 0;
        a = 100;
        b = 200;
        c = 300;
        x = 7;
        y = 8;
        z = 9;
        
        while (current <= c && last == false)
        {
            if (current < a)
            {
                current = i * x;
                if (current >= a)
                {
                    current = i * y;
                }
                i += 1;
            }
            else if (current > a && current <= b)
            {
                current = i * y; 
                
                if (current >= b)
                {
                    current = i * z;
                }
                i += 1;
            }
            else if (current >= b && current < c)
            {
                current = i * z;
                
                if (current >= c)
                {
                    current = ((i -= 1) * z);
                    last = true;
                }
                i += 1;
            }
            System.out.println(current);
        }
    }
}