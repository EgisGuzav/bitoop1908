

public class Validator {
    // the first test is an example test
    // checking 
    public static boolean isSingleSentence(String text){
        // each sentence can has letters only
        // begins with uppercase letter
        // ends with a . or ... or ! or ?
        // space after , or ; or :
        // both spaces around - or none
        
        // preliminaries
        if ((text == null) || (text.length() == 0))
            return true;

        // now we know it is not null and has length at least 1
        // first letter
        if (!Character.isUpperCase(text.charAt(0)))
            return false;
        // last letter
        if (".?!".indexOf(text.charAt(text.length()-1)) == -1)
            return false;

        // now we know length is at least 2 
        // check for dots
        int dotIndex = text.indexOf('.');
        if (dotIndex != -1 && dotIndex != text.length()-1){     // if there are dots in the middle
            if (dotIndex < text.length()-3)                     // if not at the end
                return false;
            if (text.indexOf("...") != text.length()-3)           // if we cannot find ...
                return false;
        }        

        // check for invalid symbols, dot is ok, we have processed it already
        for(int i = 1; i < text.length()-2; ++i){
            if (!(Character.isLetter(text.charAt(i))) && (" ,.;:-".indexOf(text.charAt(i)) == -1)){
                //System.out.println(i + " " + text.length() + " [" + (int)text.charAt(i) + "]");
                return false;
            }
        }

        // check special symbols
        for(int i = 1; i < text.length()-2; ++i){
            // check -
            if (text.charAt(i) == '-'){
                int errorFlag = 1;          // using a temporary variable to track errors
                if (text.charAt(i-1) == ' ' && text.charAt(i+1) == ' ')
                    errorFlag = 0;
                if ((Character.isLetter(text.charAt(i-1))) && (Character.isLetter(text.charAt(i+1))))
                    errorFlag = 0;
                if (errorFlag == 1)
                    return false;
            }
            // check space
            if ((text.charAt(i) == ' ') && (text.charAt(i+1) == ' '))
                return false;
            // check ,;:
            if (",;:".indexOf(text.charAt(i)) != -1){
                if ((!Character.isLetter(text.charAt(i-1)) || (text.charAt(i+1) != ' ')))
                    return false;
            }
        }

        return true;
    }
    public static boolean isFirstName(String text){
        // your code here
        return true;
    }
    public static boolean isLastName(String text){
        // your code here
        return true;
    }
    public static boolean isPersonalCode(String text){
        // your code here
        return true;
    }
    public static boolean isOccupation(String text){
        // your code here
        return true;
    }
    public static boolean isCompanyName(String text){
        // your code here
        return true;
    }
    public static boolean isCompanyCode(String text){
        // your code here
        return true;
    }
    public static boolean isAddress(String text){
        // your code here
        return true;
    }    
    public static boolean isEmail(String text){
        // your code here
        return true;
    }
    public static boolean isPhone(String text){
        // your code here
        return true;
    }
    public static boolean isAccountNumber(String text){
        // your code here
        return true;
    }
    public static boolean isMoney(String text){
        // your code here
        return true;
    }
    public static boolean isDate(String text){
        // your code here
        return true;
    }  
}