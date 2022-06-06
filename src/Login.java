import javax.swing.JOptionPane;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
import java.io.File;
public class Login
{
    private String firstName;
    private String lastName;
    private String tempUsername;
    private String tempPassword;
    private String filepath;
    private String username;
    private String password;
    private boolean validUsername;
    private boolean validPassword;
    private String message;
    public static void main(String [] args)
    {
        Login login= new Login();
        login.runApp();
    }
    public void runApp()
    {
        checkUsername(tempUsername);
        checkPasswordComplexity(tempPassword);
        registerUser(validUsername,validPassword);
        loginUser(username, password,tempUsername,tempPassword);
        returnLoginStatus(firstName,lastName,username,password,tempUsername,tempPassword);
    }
    public boolean checkUsername(String tempUsername)
    {
        int length =0;
        boolean validUsername = false;
        while(validUsername==false)
        {
            tempUsername = JOptionPane.showInputDialog(null, "Enter desired username.Please ensure that your username contains an underscore and is less than 5 characters");
            if (tempUsername.length() <=5 && ( tempUsername.contains("_") ))
            {
                validUsername=true;
            } else { validUsername =false;
                JOptionPane.showMessageDialog(null,"Please ensure that your username contains an underscore and is less than 5 characters");
                JOptionPane.showMessageDialog(null,"Enter desired username.Please ensure that your username contains an underscore and is less than 5 characters");
            }
        }
        return true;
    }
    public boolean checkPasswordComplexity(String tempPassword){
        boolean validPassword =false;
        while( validPassword ==false)
        {
            tempPassword = JOptionPane.showInputDialog(null, "Enter a password.Please ensure that your password contains at least 8 characters,a capital letter,a number and a special letter");
            if(tempPassword.length()>8)
                validPassword = true; boolean hasNum= false;
            boolean hasCap=false;
            boolean hasLow=false;
            for(int i =0; i <tempPassword.length();i++)
            { char c =tempPassword.charAt(i);
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
            }
            if(hasNum && hasCap && hasLow && (tempPassword.contains("@") || tempPassword.contains("#")
                    ||tempPassword.contains("#")||tempPassword.contains("$")
                    ||tempPassword.contains("%")||tempPassword.contains("^")
                    ||tempPassword.contains("&")||tempPassword.contains("*")
                    ||tempPassword.contains("(")||tempPassword.contains(")")
                    ||tempPassword.contains("_")||tempPassword.contains("+")
                    ||tempPassword.contains("/")||tempPassword.contains(":")
                    ||tempPassword.contains(".")||tempPassword.contains(",")
                    ||tempPassword.contains("<")||tempPassword.contains(">")
                    ||tempPassword.contains("?")||tempPassword.contains("|"))
            )
            {
                validPassword =true;
                JOptionPane.showMessageDialog(null,"Registered successfully");
            }else {
                validPassword=false;
                JOptionPane.showMessageDialog(null,"Please ensure that your password contains at least 8 characters,a capital letter,a number and a special letter");
                JOptionPane.showInputDialog(null, "Enter a password.Please ensure that your password contains at least 8 characters,a capital letter,a number and a special letter"); }
        }
        return true;
    }
    public String registerUser(boolean validUsername,boolean validPassword)
    {
        if(validUsername == true && validPassword == true)
        {JOptionPane.showMessageDialog(null,"Registered successfully");}
        return message;
    }
    public boolean loginUser(String username,String password, String tempPassword, String tempUsername)
    {
        boolean found =false;
        try{
            if(tempUsername==username && tempPassword==password)
            {
                found = true;
                JOptionPane.showMessageDialog(null,"Welcome Nolwazi Mabaso it is great to see again");
            } else {
                found = false;
                JOptionPane.showMessageDialog(null,"Username or password incorrect,please try again");
                JOptionPane.showInputDialog(null,"Please re-enter username");
                JOptionPane.showInputDialog(null,"Please re-enter password");
                JOptionPane.showMessageDialog(null,"Welcome "+ firstName+lastName+" it is great to see again");
            }
        }catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error, please re-enter");
        }
        return true;
    }
    public String returnLoginStatus(String firstName,String lastName,String username,String password, String tempUsername,String tempPassword)
    {
        try{if(tempUsername==username && tempPassword==password)
        {
            JOptionPane.showMessageDialog(null,"Welcome Nolwazi Mabaso it is great to see again");
        }else {
            JOptionPane.showMessageDialog(null,"Username or password incorrect,please try again");
        }} catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error,please re-enter");
        }
        return tempUsername+"";
    }
}