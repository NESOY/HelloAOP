package aop;

/**
 * Created by NESOY on 2017-01-25.
 */
public class Cat implements AnimalType {

    private String myName;

    public void setMyName(String myName) {
        this.myName = myName;
    }


    public void sound() {
        System.out.println("Cat name=" + myName + ": Meow");
    }

}
