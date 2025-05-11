// Abstraction - Showing Only Essentials
// What it means: Hiding complex details and showing only what's necessary.

//abstract class-like blue print
abstract class Phone{
    //abstract method-just says phine able to code
    abstract void makeCall(String number);
    //concrete Method-All phone share this
    void powerOn(){
        System.out.println("Phone is turned on");
    }
}

class SmartPhone extends Phone{
    //must implement abstract method
    @Override
    void makeCall(String number){
        System.out.println("Call this "+number+" via screentouch");
    }
}


public class abstrctnExp{
    public static void main(String[] args) {

        SmartPhone myPhone= new SmartPhone();
        myPhone.powerOn();//uses inherit method
        myPhone.makeCall("9832156147");//uses implemented method

        // Phone nPhone = new Phone(); //ERROR-can't instantiate abstract class
    }
}