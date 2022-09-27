public class Greetings {

    void  greeting(){

        this.greeting("my dear");
    }

    void greeting(String name){

        this.greeting("my dear",28);
    }

    void greeting(String name,int age){
        System.out.printf("Hello %S, I'm %d",name,age).println();
    }
}
