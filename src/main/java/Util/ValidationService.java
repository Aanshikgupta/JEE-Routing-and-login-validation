package Util;

public class ValidationService {

    public ValidationService() {

    }

    public boolean validate(String name,String password){
        if(name.equals("root") && password.equals("root")){
            return true;
        }

        return false;
    }
}
