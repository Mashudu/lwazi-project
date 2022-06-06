import javax.swing.JOptionPane;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class KMain
{
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String tempUsername;
    private String tempPassword;
    private boolean validUsername;
    private boolean validPassword;
    public static void main(String [] args)
    {
        KMain km =new KMain();
        km.run();
    } public void run()
{
    String firstName;
    firstName = JOptionPane.showInputDialog(null,"Enter your first name");
    String lastName;
    lastName = JOptionPane.showInputDialog(null,"Enter your last name");
    String username;
    username = JOptionPane.showInputDialog(null, "Enter desired username.Please ensure that your username contains an underscore and is less than 5 characters");
    valid_Username(username);
    validUsername(username);
    String password;
    password = JOptionPane.showInputDialog(null, "Enter a password.Please ensure that your password contains at least 8 characters,a capital letter,a number and a special letter");
    valid_Password(password);
    validPassword(password);
    Login login = new Login();
    login.checkUsername(tempUsername);
    login.checkPasswordComplexity(tempPassword);
    login.registerUser(validUsername,validPassword);
    login.loginUser(username,password,tempUsername,tempPassword);
    login.returnLoginStatus(firstName,lastName,username,password,tempUsername,tempPassword); }
    //---------------------------------------------------------------------------------------------------------------------------------------------------------------
    public boolean valid_Username(String username)
    {
        if( username.contains("_") )
        {
            if (username.length() <=5)
                return true;
        }
        return true;
    }
    public boolean validUsername(String username)
    { String s2 = " Username successfully captured";
        String s3 = "Username is not correctly formatted, please ensure that your username contains an underscore and it is not more than five characters long ";
        if (username.contains("_") && username.length() <=5 )
        {
            JOptionPane.showMessageDialog(null,s2,"title",JOptionPane.INFORMATION_MESSAGE);
        }while (!(username.contains("_") && username.length() <=5 ))
    {
        JOptionPane.showMessageDialog(null,s3, "title",JOptionPane.ERROR_MESSAGE);
        username = JOptionPane.showInputDialog(null, "Enter desired username.Please ensure that your username contains an underscore and is less than 5 characters");
    }
        return true;
    }
    //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public boolean valid_Password(String password)
    {
        if(password.length()>8)
            return true; boolean hasNum= false;
        boolean hasCap=false;
        boolean hasLow=false;
        for(int i =0; i <password.length();i++)
        { char c =password.charAt(i);
            if(Character.isDigit(c))
            {
                hasNum= true;
            }
            else if(Character.isUpperCase(c))
            {
                hasCap=true;
            }
            else if(Character.isLowerCase(c))
            {
                hasLow=true;
            }
            if(hasNum && hasCap && hasLow)
            {
                return true;
            }if(password.contains("@") || password.contains("#")
                ||password.contains("#")||password.contains("$")
                ||password.contains("%")||password.contains("^")
                ||password.contains("&")||password.contains("*")
                ||password.contains("(")||password.contains(")")
                ||password.contains("_")||password.contains("+")
                ||password.contains("/")||password.contains(":")
                ||password.contains(".")||password.contains(",")
                ||password.contains("<")||password.contains(">")
                ||password.contains("?")||password.contains("|"))
            return true;
        }
        return true;
    }
    public boolean validPassword(String password)
    {
        String s4 ="Password successfully captured";
        String s5 = "Password is not correctly formatted,please ensure that the password contains at least 8 characters,a capital letter, a number and a special character";
        int i =0;
        if(password.length() >8 && Character.isUpperCase(password.charAt(i)) && Character.isLowerCase(i) && Character.isDigit(password.charAt(i)) && (password.contains("@") || password.contains("#")
                ||password.contains("#")||password.contains("$")
                ||password.contains("%")||password.contains("^")
                ||password.contains("&")||password.contains("*")
                ||password.contains("(")||password.contains(")")
                ||password.contains("_")||password.contains("+")
                ||password.contains("/")||password.contains(":")
                ||password.contains(".")||password.contains(",")
                ||password.contains("<")||password.contains(">")
                ||password.contains("?")||password.contains("|"))
        )
        {
            JOptionPane.showMessageDialog(null,s4,"Password",JOptionPane.INFORMATION_MESSAGE);}
        else if(!(password.length() >8 && Character.isUpperCase(password.charAt(i)) && (Character.isLowerCase(i) &&Character.isDigit(password.charAt(i)) && (password.contains("@") || password.contains("#")
                ||password.contains("#")||password.contains("$")
                ||password.contains("%")||password.contains("^")
                ||password.contains("&")||password.contains("*")
                ||password.contains("(")||password.contains(")")
                ||password.contains("_")||password.contains("+")
                ||password.contains("/")||password.contains(":")
                ||password.contains(".")||password.contains(",")
                ||password.contains("<")||password.contains(">")
                ||password.contains("?")||password.contains("|"))
        )))
        {
            JOptionPane.showMessageDialog(null,s5,"Password",JOptionPane.ERROR_MESSAGE);
            password = JOptionPane.showInputDialog(null, "Enter a password.Please ensure that your password contains at least 8 characters,a capital letter,a number and a special letter");
        }
        return true;
    }
}




