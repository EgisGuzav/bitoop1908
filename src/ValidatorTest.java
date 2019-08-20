

// each test class will have valid values, invalid values,
// and a method to run the code
abstract class TestRunner {
    protected String[] validText;       // valid values 
    protected String[] invalidText;     // invalid values
    public String[] getValidText(){
        return validText;
    }
    public String[] getInvalidText(){
        return invalidText;
    }
    public String getTestName(){
        return this.getClass().getName();
    }
    
    // runs the test
    abstract public boolean test(String text);
}

class SingleSentenceTestRunner extends TestRunner {
    SingleSentenceTestRunner(){
        validText = new String[]{ 
            // your code here, modify value list to include valid values
            null,
            "",
            "Labas!", 
            "Laba diena, kaip gyveni?", 
            "Nesupratau, maniau kad suprantu, bet visgi ne - labai sudėtingi dalykai šičia...",
            "Svarbus testas: visi skyrybos ženklai turi būti patikrinti bent sykį!",
            "Čia šitoks pusiau-sakinys." 
        };
        invalidText = new String[]{
            // your code here, modify value list to include invalid values  
            "sakinys iš mažosios.", 
            "Be pabaigos ženklo", 
            "Su blogu  tarpu.",
            "Arba blogais tarpais,tarp skyrybos ženklų.",
            "Ir brūkšnelis- nekoks.",
            "Su neleistinais 1 simboliais.",
            "Arba keistais % ženklais",
            "Keistas daugtaškis..",
            "Taškas. Anksčiau.",
            "Per daug taškų...."
        };
    }   
    public boolean test(String text){
        return Validator.isSingleSentence(text);
    }



}
class FirstNameTestRunner extends TestRunner {
    FirstNameTestRunner(){
        validText = new String[]{ 

            "",
            null,
            "Vardas", 
            "De'Vardas", 
            "Ala Vardas",
            "V'Ardas",
            "A",
            "Antonio Fon'Shvager'Don Salvador" 
        };
        invalidText = new String[]{

            "vardas", //prasideda mažąja
            "VardaS", //baigiasi dižiąja
            "VaRdas",//didžioji viduryje

            "Vardas.", //Baigiasi kitu simboliu
            "%Vardas", //prasideda kitu simboliu
            "V4rdas", //kitoks simbolis vidury

            "Vardas ",// tarpas gale
            " Vardas",//tarpas prieky
            "Vardas  Kitas",// du tarpai
            "Vardas kitas",// po tarpo mažoji

            "Vardas'",// kabliukas paskutinis
            "'Vardas",// kabliukas pirmas
            "De'vardas",//po kabliuko mažoji 
            "De' Vardas",//po kabliuko tarpas
            "Vardas 'kitas",// po tarpo kabliukas
            "De'!Vardas",//po kabliuko kitas simbolis
            "De''Vardas",// du kabliukai
        };
    }   
    public boolean test(String text){
        return Validator.isFirstName(text);
    }
}
class LastNameTestRunner extends TestRunner {
    LastNameTestRunner(){
        validText = new String[]{ 

           "",
            null,
            "Vardas", 
            "De'Vardas", 
            "Ala Vardas",
            "V'Ardas",
            "A",
            "Antonio Fon'Shvager'Don Salvador"
        };
        invalidText = new String[]{  

            "vardas", //prasideda mažąja
            "VardaS", //baigiasi dižiąja
            "VaRdas",//didžioji viduryje

            "Vardas.", //Baigiasi kitu simboliu
            "%Vardas", //prasideda kitu simboliu
            "V4rdas", //kitoks simbolis vidury

            "Vardas ",// tarpas gale
            " Vardas",//tarpas prieky
            "Vardas  Kitas",// du tarpai
            "Vardas kitas",// po tarpo mažoji

            "Vardas'",// kabliukas paskutinis
            "'Vardas",// kabliukas pirmas
            "De'vardas",//po kabliuko mažoji 
            "De' Vardas",//po kabliuko tarpas
            "Vardas 'kitas",// po tarpo kabliukas
            "De'!Vardas",//po kabliuko kitas simbolis
            "De''Vardas",// du kabliukai
        };
    }
    public boolean test(String text){
        return Validator.isLastName(text);
    }
}
class PersonalCodeTestRunner extends TestRunner {
    PersonalCodeTestRunner(){
        validText = new String[]{ 
            "GoodValue1", 
            "GoodValue2", 
            "GoodValue3" 
        };
        invalidText = new String[]{  
            "BadValue1", 
            "BadValue2", 
            "BadValue3" 
        };
    }
    
    public boolean test(String text){
        return Validator.isPersonalCode(text);
    }
}
class OccupationTestRunner extends TestRunner {
    OccupationTestRunner(){
        validText = new String[]{ 
            "GoodValue1", 
            "GoodValue2", 
            "GoodValue3" 
        };
        invalidText = new String[]{  
            "BadValue1", 
            "BadValue2", 
            "BadValue3" 
        };
    }
    public boolean test(String text){
        return Validator.isOccupation(text);
    }
}
class CompanyNameTestRunner extends TestRunner {
    CompanyNameTestRunner(){
        validText = new String[]{ 
            "GoodValue1", 
            "GoodValue2", 
            "GoodValue3" 
        };
        invalidText = new String[]{  
            "BadValue1", 
            "BadValue2", 
            "BadValue3" 
        };
    }
    public boolean test(String text){
        return Validator.isCompanyName(text);
    }
}
class CompanyCodeTestRunner extends TestRunner {
    CompanyCodeTestRunner(){
        validText = new String[]{ 
            "GoodValue1", 
            "GoodValue2", 
            "GoodValue3" 
        };
        invalidText = new String[]{  
            "BadValue1", 
            "BadValue2", 
            "BadValue3" 
        };
    }
    public boolean test(String text){
        return Validator.isCompanyCode(text);
    }
}
class AddressTestRunner extends TestRunner {
    AddressTestRunner(){
        validText = new String[]{ 
            "GoodValue1", 
            "GoodValue2", 
            "GoodValue3" 
        };
        invalidText = new String[]{  
            "BadValue1", 
            "BadValue2", 
            "BadValue3" 
        };
    }
    public boolean test(String text){
        return Validator.isAddress(text);
    }
}
class EmailTestRunner extends TestRunner {
    EmailTestRunner(){
        validText = new String[]{ 
            "GoodValue1", 
            "GoodValue2", 
            "GoodValue3" 
        };
        invalidText = new String[]{  
            "BadValue1", 
            "BadValue2", 
            "BadValue3" 
        };
    }
    public boolean test(String text){
        return Validator.isEmail(text);
    }
}
class PhoneTestRunner extends TestRunner {
    PhoneTestRunner(){
        validText = new String[]{

            "+37068234453", 
            "0037068234453", 
            "868234453",
            null,
            ""
        };
        invalidText = new String[]{  

            "+37168234453",// ne lietuviškas numeris
            "37068+234453",// plus per vidurį
            "37068234453+",// plus gale
            "+37068234",// ilgis 9 su plus
            "+370682344535",// ilgis 13 su plus
            "+3706823445354",// ilgis >13 su plus
            "+3706823",// ilgis < 9 su plus

            "00370682344535",// >13 simbolių su 00
            "003706823445",// 12 simbolių su 00
            "003706823",// 9 simboliai su 00

            "768234453",// ilgis 9; prasideda ne su 8
            "868234453569",// ilgis 12 su 8
            "8682344539687",// ilgis 13 su 8
            "868234453454545478",// ilgis >13 su 8
            "8642221",// ilgis < 9 su 8

            "+37068A34452",// ne skaičius vidury
            "%68234453",// ne skai2ius pradžioje
            "86823445ą",// ne skaičius pabaigoje
            "+3706823445ą",// ne skaičius pabaigoje
            "003706823445ą",// ne skaičius pabaigoje
            "+370682344Ą4",// priešpaskutinis ne skaičius
            "+370682344į2",//  priešpaskutinis ne skaičius
            "00370682344į3",//  priešpaskutinis ne skaičius
        };
    }
    public boolean test(String text){
        return Validator.isPhone(text);
    }
}
class AccountNumberTestRunner extends TestRunner {
    AccountNumberTestRunner(){
        validText = new String[]{ 
            "GoodValue1", 
            "GoodValue2", 
            "GoodValue3" 
        };
        invalidText = new String[]{  
            "BadValue1", 
            "BadValue2", 
            "BadValue3" 
        };
    }
    public boolean test(String text){
        return Validator.isAccountNumber(text);
    }
}
class MoneyTestRunner extends TestRunner {
    MoneyTestRunner(){
        validText = new String[]{ 
            "GoodValue1", 
            "GoodValue2", 
            "GoodValue3" 
        };
        invalidText = new String[]{  
            "BadValue1", 
            "BadValue2", 
            "BadValue3" 
        };
    }
    public boolean test(String text){
        return Validator.isMoney(text);
    }
}
class DateTestRunner extends TestRunner {
    DateTestRunner(){
        validText = new String[]{ 
            "GoodValue1", 
            "GoodValue2", 
            "GoodValue3" 
        };
        invalidText = new String[]{  
            "BadValue1", 
            "BadValue2", 
            "BadValue3" 
        };
    }
    public boolean test(String text){
        return Validator.isDate(text);
    }
}

public class ValidatorTest {

    // notify if expected and actual values do not match
    public static void runTest(boolean expectedValue, boolean actualValue, String id){
        if(expectedValue != actualValue)
            System.out.println("Test failed " + id);
    }
    // check all the values for the test runner object
    public static void runTests(TestRunner testRunner, String id){
        String prefix = String.format("%30s", testRunner.getTestName()) + "   " + id;
        // check valid values
        for(int i = 0; i < testRunner.getValidText().length; ++i){
            String text = testRunner.getValidText()[i];
            runTest(true, testRunner.test(text), prefix + "T" + String.format("%03d   ", i+1) + text);
        }
        // check invalid values
        for(int i = 0; i < testRunner.getInvalidText().length; ++i){
            String text = testRunner.getInvalidText()[i];
            runTest(false, testRunner.test(text), prefix + "F" + String.format("%03d   ", i+1) + text);
        }
    }
    
    public static void main(String[] args) {
        // all the test classes
        TestRunner[] tests = { 
            new SingleSentenceTestRunner(),
            new FirstNameTestRunner(), new LastNameTestRunner(), new PersonalCodeTestRunner(), new OccupationTestRunner(),
            new CompanyNameTestRunner(), new CompanyCodeTestRunner(),
            new AddressTestRunner(), new EmailTestRunner(), new PhoneTestRunner(),
            new AccountNumberTestRunner(), new MoneyTestRunner(), new DateTestRunner()
        };
        // run each test
        for(int i = 0; i < 13; ++i){
            runTests(tests[i], String.format("%02d", i+1));            
        }

        System.out.println("\nTesting complete!");
        
    }
}