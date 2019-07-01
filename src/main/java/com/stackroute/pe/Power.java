package com.stackroute.pe;

public class Power {
    public boolean poweroffour(int n)
    {
        if(n<0)
        {
            if(n == 0)
            {
                return false;
            }

            while(n != 1)
            {
                if(n % 4 != 0)
                {
                    return false;
                }

                n = n / 4;
            }
            return true;
        }
        else
        {
            return false;
        }

    }
}
