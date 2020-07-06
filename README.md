# input an array and print its boundary elements and also print the sum of diagonal elements.
import java.util.*;
class Array_boundary
{  boolean Prime(int n)
    {int x=2,c=0;
        while(n>x)
        {if(n%x==0)
                c++;
            x++;
        }
        if(c==0)
            return true;
        else 
            return false;
    }
    public void main()
    {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter order of array");
        int r=sc.nextInt();
        int a[][]=new int[r][r];
        for(int i=0;i<r;i++)
        { for(int j=0;j<r;j++)
            {
            System.out.println("Enter a no.");
             a[i][j]=sc.nextInt();
            }
        }
        int b[]=new int[r*r];
        int k=0,s=0;
        for(int i=0;i<r;i++)
        { for(int j=0;j<r;j++)
            { if(i==r-1||i==0||j==0||j==r-1)
                {if(Prime(a[i][j]) && a[i][j]!=1)
                        b[k++]=a[i][j];
                }
                if(i==j || i+j==r-1)
                    s=s+a[i][j];
            }
        }
        int t=0;
        for(int i=0;i<b.length;i++)
        { for(int j=0;j<b.length-1-i;j++)
            {if(b[j]>b[j+1])
                {t=b[j];
                    b[j]=b[j+1];
                    b[j+1]=t;
                }
            }
        }
        for(int i=0;i<b.length;i++)
        { if(b[i]!=0)
                System.out.println(b[i]);
        }
      System.out.println("Sum is= "+s);    
    }
}
