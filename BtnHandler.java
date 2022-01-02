
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static jdk.nashorn.internal.objects.NativeString.substring;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author SAM
 */

public class BtnHandler implements ActionListener 
{
    GUI refg;
    double left = 0;    
    double right = 0;
    double result = 0;
    String data = "";
    char opr = ' ';
    boolean btd = false;
    boolean optB = false;
    BtnHandler(GUI aa)
    {
        refg = aa;
    }
    double calculate()
    {
        switch(opr)
        {
            case '+':
                result = left + right;
                break;
            case '-':
                result = left - right;
                break;
            case '*':
                result = left * right;
                break;
            case '/':
                if(right == 0)
                {
                    data = "Math Error";
                    result = 0;
                    left = 0;
                }
                else
                {
                    result = left / right;
                }
                break;
        }
        
        return result;
    }
    
    boolean isOperator(String str)
    {
        if(str == "+" || str == "-" || str == "*" || str == "/")
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        if(data == "Error")
        {
            data = "";
        }
        switch(ae.getActionCommand())
        {
            case "0":
                data += "0";
                refg.jtf.setText(data);
                break;
            case "1":
                data += "1";
                refg.jtf.setText(data);
                
                break;
            case "2":
                data += "2";
                refg.jtf.setText(data);
                
                break;
            case "3":
                data += "3";
                refg.jtf.setText(data); 
                
                break;
            case "4":
                data += "4";
                refg.jtf.setText(data);
                
                break;
            case "5":
                data += "5";
                refg.jtf.setText(data);
                
                break;
            case "6":
                data += "6";
                refg.jtf.setText(data);
                
                break;
            case "7":
                data += "7";
                refg.jtf.setText(data);
                
                break;
            case "8":
                data += "8";
                refg.jtf.setText(data);
                
                break;
            case "9":
                data += "9";
                refg.jtf.setText(data);
                break;
            case "+":
                btd = false;
                if(opr != ' ' && optB == false)
                {
                    right = Double.parseDouble(data);
                    result = calculate();
                    data = Double.toString(result);
                    refg.jtf.setText(data);
                    left = result;    
                    optB = true;
                }
                if(optB == true)
                {
                    opr = '+';
                    data = "";
                    refg.jtf.setText("+");
                }
//                else
//                {
//                    left = Double.parseDouble(data);
//                    data = "+";
//                    refg.jtf.setText(data);
//                    data = "";
//                    opr ='+';
//                }
                
                break;
            case "-":
                btd = false;
                if(opr != ' ')
                {
                    right = Double.parseDouble(data);
                    result = calculate();
                    data = Double.toString(result);
                    refg.jtf.setText(data);
                    left = result;                    
                }
                if(data.length()== 0 || isOperator(data))
                {
                    data = "-";
                    opr = '-';
                    refg.jtf.setText(data);
                }
                else
                {
                    left = Double.parseDouble(data);
                    data = "-";
                    refg.jtf.setText(data);
                    data = "";
                    opr ='-';
                }
                break;
            case "*":
                btd = false;
                if(opr != ' ')
                {
                    right = Double.parseDouble(data);
                    result = calculate();
                    data = Double.toString(result);
                    refg.jtf.setText(data);
                    left = result;                    
                }
                if(data.length()== 0 || isOperator(data))
                {
                    data = "Error";
                    opr = '*';
                    refg.jtf.setText("*");
                }
                else
                {
                    left = Double.parseDouble(data);
                    data = "*";
                    refg.jtf.setText(data);
                    data = "";
                    opr ='*';
                }
                break;
            case "/":
                btd = false;
                if(opr != ' ')
                {
                    right = Double.parseDouble(data);
                    result = calculate();
                    data = Double.toString(result);
                    refg.jtf.setText(data);
                    left = result;                    
                }
                if(data.length()== 0 || isOperator(data))
                {
                    data = "Error";
                    opr = '/';
                    refg.jtf.setText("/");
                }
                else
                {
                    left = Double.parseDouble(data);
                    data = "/";
                    refg.jtf.setText(data);
                    data = "";
                    opr ='/';
                }
                break;
            case ".":
                if(btd == false)
                {
                    data += ".";
                    refg.jtf.setText(data);
                    btd = true;
                }
                
                break;
            case "Clear":
                data = "";
                left = right = result = 0;
                opr = ' ';
                refg.jtf.setText(data);
                btd = false;
                break;
            case "=":
//                btd = false;
                if (opr == ' ')
                {
                    break;
                }
                if (data.length() != 0)
                {
                    right = Double.parseDouble(data);
                    result = calculate();
                    if(data == "Math Error")
                    {
                        result = 0;
                        refg.jtf.setText(data);
                        data = "";
                    }
                    else
                    {
                        data = Double.toString(result);
                        refg.jtf.setText(data);
                    }
                    refg.jtf2.setText("History: " + data);
//                    data = "";
                    opr = ' ';
                    left = result;
                }
                break;
            case "<-":
                if(data.length() > 0)
                {
                    data = data.substring(0, data.length()-1);
                    refg.jtf.setText(data);                    
                }
                
                
        }
             
    }
    
}
