class Q9_alphabetPattern
{
    public static void main(String[] args)
    {
        
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print((char)(65+j-2+i)+"\t");
            }
            System.out.println();
        }
    }
}