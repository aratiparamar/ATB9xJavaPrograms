package Nov.ex_12112024_SuperKeyword_Abstraction;

public class Lab157 {
}

class Aarti extends Loan{
    @Override
    void loan50k() {
        System.out.println("Definition of 50k loan"); //complete definition
    }

    @Override
    void loan30k() {
        System.out.println("Definition of 30k loan");
    }
}

abstract class Loan{
    abstract void loan50k();//Incomplete function- Declaration only
    abstract void loan30k();
    void Loan1(){
        System.out.println("Loan1");
    }
}

//Concrete class

class Person{}
class Student1{}
class Student2{}
