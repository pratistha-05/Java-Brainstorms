import java.util.*;
class SymetricMatrix
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number of elements : ");
       int m = sc.nextInt();
       int A[][]=new int[m][m];
        
       if(m>2 && m<10) // Checking for valid input of rows and columns size
       {  
           System.out.println("\nInputting the elements in the Matrix: \n");
           for(int i=0;i<m;i++)
           {
               for(int j=0;j<m;j++)
               {
                   System.out.print("Enter the elements : ");
                   A[i][j]=sc.nextInt();
               }
           }
        
           /* Printing the Original Matrix */
           System.out.println("\nThe Original Matrix is : ");
           for(int i=0;i<m;i++)
           {
               for(int j=0;j<m;j++)
               {
                   System.out.print(A[i][j]+"\t");
               }
               System.out.println();
           }
        
           /* Checking whether the matrix is symmetric or not */
           int flag = 0;
           for(int i=0;i<m;i++)
           {
               for(int j=0;j<m;j++)
               {
                   if(A[i][j] != A[j][i])
                   {
                       flag = 1; // Setting flag = 1 when elements do not match
                       break;
                    }
               }
           }
        
           if(flag == 1)
                System.out.println("\nThe given Matrix is Not Symmetric");
           else
                System.out.println("\nThe given Matrix is Symmetric");
             
                /* Finding sum of the diagonals */
                int ld = 0, rd = 0;
                for(int i=0;i<m;i++)
                {
                    for(int j=0;j<m;j++)
                    {
                        if(i == j) // Condition for the left diagonal
                        {
                            ld = ld + A[i][j];
                        }
                        if((i+j) == (m-1)) // Condition for the right diagonal
                        {
                            rd = rd + A[i][j];
                        }
                    }
                }
        
                System.out.println("The sum of the left diagonal = "+ld);
                System.out.println("The sum of the right diagonal = "+rd);
       }
        
       else
            System.out.println("The Matrix Size is Out Of Range");
   }
}
