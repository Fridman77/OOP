package Lab4;

import java.io.FileReader;
import java.util.Stack;

public class main
{
    public static void main(String[] args) throws Exception
    {
        FileReader fr = new FileReader("C:\\Users\\Stratulat\\Desktop\\git-Repository\\OOP Lab\\src" +
                "\\Lab4\\assets\\three_expressions.txt");

        String[] expressions = new String[3];
        for (int l = 0; l < expressions.length; l++)
        {
            expressions[l] = "";
        }

        int i, j = 0;
        while ((i=fr.read()) != -1)
        {
            if (i == '\n')
            {
                j++;
            }
            expressions[j] += (char) i;
        }
        fr.close();

        for (int k = 0; k < expressions.length; k++)
        {
            if (expressions[k] == "")
                break;
            System.out.println(expressions[k]);
            System.out.println(Validator.isValid(expressions[k]));
        }
    }
}