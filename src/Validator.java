

public class Validator {
    public static boolean isInRange(int value, int low, int high){
        if (low <= value && value <= high)
            return true;
        return false;
    }
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

        //can be null or empty.
        if ((text == null) || (text.length() == 0)){
            return true;
        }

        // If text length is 1 and Char is UpperCase > True
        // Else if first letter is not uppercase and last is not lowercase > False
        if (text.length() == 1 && Character.isUpperCase(text.charAt(0))){
            return true;
        }   else if(!Character.isUpperCase(text.charAt(0)) ||
                    !Character.isLowerCase(text.charAt(text.length()-1))){
                return false;
            }
            
        //All remaining symbols must be letters except of space and '.
        //First and last are already tested!
        for(int i = 1; i < text.length()-2; i++){
            if (!(Character.isLetter(text.charAt(i))) && (" '".indexOf(text.charAt(i)) == -1)){
                return false;
            }
        }
            
        //Space can only be followed by a Capital letter.
        // 'can only be followed by lowercase letter.
        for(int i=1; i < text.length()-2; i++){
            if (((text.charAt(i) == ' ') && !Character.isUpperCase(text.charAt(i+1))) || 
                ((text.charAt(i) == '\'') && !Character.isUpperCase(text.charAt(i+1)))){
                return false;
            } 
        }

        //all letters are lowercase, unless they come after space or '.
        //First letter is sorted!
        for(int i=1; i < text.length()-2; i++ ){
            if(Character.isUpperCase(text.charAt(i)) && 
               text.charAt(i-1) != '\'' &&
               text.charAt(i-1) != ' '){
                return false;
            }
        }

        return true;
    }
    public static boolean isLastName(String text){
        
        //can be null or empty.
        if ((text == null) || (text.length() == 0)){
            return true;
        }

        // If text length is 1 and Char is UpperCase > True
        // Else if first letter is not uppercase and last is not lowercase > False
        if (text.length() == 1 && Character.isUpperCase(text.charAt(0))){
            return true;
        }   else if(!Character.isUpperCase(text.charAt(0)) ||
                    !Character.isLowerCase(text.charAt(text.length()-1))){
                return false;
            }
            
        //All remaining symbols must be letters except of space and '.
        //First and last are already tested!
        for(int i = 1; i < text.length()-2; i++){
            if (!(Character.isLetter(text.charAt(i))) && (" '".indexOf(text.charAt(i)) == -1)){
                return false;
            }
        }
            
        //Space can only be followed by a Capital letter.
        // 'can only be followed by lowercase letter.
        for(int i=1; i < text.length()-2; i++){
            if (((text.charAt(i) == ' ') && !Character.isUpperCase(text.charAt(i+1))) || 
                ((text.charAt(i) == '\'') && !Character.isUpperCase(text.charAt(i+1)))){
                return false;
            } 
        }

        //all letters are lowercase, unless they come after space or '.
        //First letter is sorted!
        for(int i=1; i < text.length()-2; i++ ){
            if(Character.isUpperCase(text.charAt(i)) && 
                text.charAt(i-1) != '\'' &&
                text.charAt(i-1) != ' '){
                return false;
            }
        }

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
        if (!(Character.isUpperCase(text.charAt(0)))){
            return false;
        }
        if (!(text.contains("g.") || text.contains("pr.") || text.contains("pl.") || text.contains("al.") )){
            return false;
        }
        for (int i = 0; i < text.length(); ++i){
            if (Character.isDigit(text.charAt(i))){
                break;
            }
            if (i == text.length()-1){
                return false;
            }
        }
        for (int j = 0; j < text.length(); ++j) {
            if ((text.charAt(j) == ',') && (text.charAt(j+1) == ' ') ){
                if (!(Character.isUpperCase(text.charAt(j+2)))){
                   return false; 
                }
            }
        }
        return true;
    }   
    public static boolean isEmail(String text){
        // your code here
        return true;
    }
    public static boolean isPhone(String text){
        
        // preliminaries  
        if ((text == null) || (text.length() == 0)){
            return true;
        }
           
        // lenghth can be only 9, 12 or 13 symbols.
        if(text.length() != 9 && text.length() != 12 && text.length() != 13){
            return false;
        }
            
        // //First symbol can only be digit or "+".
        if (!Character.isDigit(text.charAt(0)) && (text.charAt(0) != '+')){
            return false;
        }

        //Check if all remaining symbols are digits.
        for(int i = 1; i < text.length(); i++){
            if (!Character.isDigit(text.charAt(i))){
                // System.out.println(1);
                return false;
            }
        }

        if( text.length() == 12 && (text.substring(0,4)).equals("+370") ){
            // System.out.println(2);
            return true;
        }   else if( text.length() == 13 && (text.substring(0,5)).equals("00370") ){
                // System.out.println(3);
                return true;
            }   else if( text.length() == 9 && text.charAt(0) == '8' ){
                    // System.out.println(4);
                    return true;
                }   else{
                        // System.out.println(5);
                        return false;
                    }
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
        //Data turi tureti 10 simboliu 
        if (text.length() != 10){
        return false;
        }
        //Data turi tureti 8 skaitmenis
        int count = 0;
        for (int i=0; i<text.length(); i++){
            if (Character.isDigit(text.charAt(i))){
                count +=1;
                System.out.println(count);
            }
        }
        if (count !=8){
            return false;
        }
        //5-as ir 8-as simboliai turi buti tarpai ar skaiciai
        if (text.charAt(4) != ' ' && text.charAt(4) != '-'){
            System.out.println("Ties 5 simboliu");
            return false;
        }
        if (text.charAt(7) != ' ' && text.charAt(7) != '-'){
            System.out.println("Ties 8 simboliu");
            return false;
        }
        //Metai negali buti mazesni uz UNIX time ir didesni uz einamuosius
        String temptext = text.substring(0, 4);
        if ((Integer.parseInt(temptext)<1969) || (Integer.parseInt(temptext)>2019)){
            System.out.println("Ties metu reiksme");
            return false;
        }
        // Menesiai negali buti mazesni uz 1 ir didesni uz 12
        temptext = text.substring(5, 7);
        if ((Integer.parseInt(temptext)> 12) || (Integer.parseInt(temptext)<1)){
            System.out.println("Ties menesiu reiksme");
            return false;
        }
        // Dienos negali buti mazesnes uz 1 ir didesnes uz 31
        temptext = text.substring(8, 10);
        if ((Integer.parseInt(temptext)> 31) || (Integer.parseInt(temptext)<1)){
            System.out.println("Ties dienu reiksme");
            return false;
        }
        //Iskeliam metus, menesius ir dienas i atskirus stringus
        String tempyear = text.substring(0,4);
        String tempmonth = text.substring(5,7);
        String tempday = text.substring(8,10);
        // Panaikinai 31-a diena is menesiu, kurie turi maziau dienu
        if ((tempmonth.equals("02") || (tempmonth.equals("04")) || (tempmonth.equals("06")) || (tempmonth.equals("09")) || 
                (tempmonth.equals("11"))) && (Integer.parseInt(tempday) == 31 )){
            return false;
        }
        //Panaikinam vasario 30
        if ((tempmonth.equals("02"))  && (Integer.parseInt(tempday) == 30 )){
            return false;
        }
        // Tikrinam vasario 29
        if (!(Integer.parseInt(tempyear) % 4 == 0 && (Integer.parseInt(tempday) == 29 ))){
            if (tempmonth.equals("02")){
            return false;
            }
        }
         return true;
     }   
}