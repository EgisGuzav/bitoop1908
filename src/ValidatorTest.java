

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
            // your code here, modify value list to include valid values
            "GoodValue1", 
            "GoodValue2", 
            "GoodValue3" 
        };
        invalidText = new String[]{
            // your code here, modify value list to include invalid values  
            "BadValue1", 
            "BadValue2", 
            "BadValue3" 
        };
    }   
    public boolean test(String text){
        return Validator.isFirstName(text);
    }
}
class LastNameTestRunner extends TestRunner {
    LastNameTestRunner(){
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
        for(int i = 0; i < 1; ++i){
            runTests(tests[i], String.format("%02d", i+1));            
        }

        System.out.println("\nTesting complete!");
        
    }
}