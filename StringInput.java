package String;

public class StringInput
{
    static void sort(String[] s, int n)
    {
        for (int i=1; i<n; i++)
        {
            String str =s[i];

            int j=i-1;
            while (j>=0 && str.length() <s[j].length())
            {

                s[j+1]= s[j];
                j--;
            }
            s[j+1]=str;
        }
    }
    static void printArraystring(String str[], int n ){
        for (int i=0; i<n; i++){
            System.out.print(str[i]+" ");
        }

    }


    public static void main(String[] args)
    {
        String []arr ={"Santosh","I","am"};
        int n=arr.length;
        sort(arr,n);
        printArraystring(arr,n);
    }


}




