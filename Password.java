import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a password to check");
        String pass = sc.next();
        if(pass.length()>=12)
        {
            int ucl=0,lcl=0,dig=0,sch=0;
            for(int i = 0; i<pass.length(); i++)
            {
                char x = pass.charAt(i);
                if(Character.isLetter(x))
                {
                    if(Character.isUpperCase(x))
                        ucl++;
                    else
                        lcl++;
                }
                if(Character.isDigit(x))
                    dig++;
                if(Character.isLetterOrDigit(x)==false)
                    sch++;
            }
            if(ucl>=4&&lcl>=4&&dig>=2&&sch>=2)
                System.out.println("Strong Password");
            else
                System.out.println("Weak Password");
        }
        else
            System.out.println("Weak password");

    }
}
