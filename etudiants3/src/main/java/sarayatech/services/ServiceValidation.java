package sarayatech.services;

public class ServiceValidation {

    public boolean userValidation(String name,String password){
        return name.equalsIgnoreCase("Ibrahim")&&password.equals("passer");
    }
}
