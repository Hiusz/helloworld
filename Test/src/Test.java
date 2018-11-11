import java.util.Scanner;
public class Test {
    public static void main(String[] arg)
    {
        int rule[]={8,7,6,5,4,3,2,0};

        int[][] table={{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,1,1}};
        for (int i = 0; i <100; i++) {
            boolean flag =true;
            int n=7;
            while(flag){
                n--;
                if((table[i][n]+1)>=rule[n])
                {
                    table[i][n]=0;
                }
                else
                {
                    table[i][n]+=1;
                    table[i][7]=7-n;
                    flag=false;
                }
            }
        }

        for (int i = 0; i <= 100; i++) {
            System.out.println();
            for (int j = 0; j < 8; j++) {
                System.out.print(table[i][j]);
            }
        }






       // int i = 6;
       // array a=new array(i);
       // for(int j=7;j>0;j--)
       // {
       //     System.out.print(a.a[j]+"\t");
       // }
       // System.out.print("\t\t"+a.a[0]+"\t");
    }

}


class array                              //你选择的数转阶层进制
{
    int a[]=new int[8]; //2 .2*3. 2*3*4. 2*3*4*5. 2*3*4*5*6. 2*3*4*5*6*7. //
    array()
    {
        a[0]=0;
    }
    array(int n)
    {
        if(5040>=n)
        {
            a[0]=7;
            if(720>=n)
            {
                a[0]=6;
                if(120>=n)
                {
                    a[0]=5;
                    if(24>=n)
                    {
                        a[0]=4;
                        if(6>=n)
                        {
                            a[0]=3;
                            if(2>=n)
                            {
                                a[0]=2;
                                if(n>=1)
                                {
                                    a[0]=1;
                                }
                            }
                        }
                    }
                }
            }
        }



        if(n/(5040)>=1)
        {
            a[7]=n/5040;
            n=n%5040;
        }
        if((n/720)>=1)
        {
            a[6]=n/720;
            n=n%720;
        }
        if((n/120)>=1)
        {
            a[5]=n/120;
            n=n%120;
        }
        if((n/24)>=1)
        {
            a[4]=n/24;
            n=n%24;
        }
        if((n/6)>=1)
        {
            a[3]=n/6;
            n=n%6;
        }
        if((n/2)>=1)
        {
            a[2]=n/2;
            n=n%2;
        }
        if(n>=1)
        {
            a[1]=n;
        }
    }
}


