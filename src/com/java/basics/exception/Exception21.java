package com.java.basics.exception;


import java.util.HashMap;
import java.util.Map;

public class Exception21 {

    public static void main(String[] args)  {

        LoginInput loginInput = new LoginInput();
        loginInput.username = "john1";
        loginInput.password = "pass@123";

        LoginRepository loginRepository = new LoginRepository();
        boolean result = loginRepository.validateLogin(loginInput);
        System.out.println(result);

    }


    private static class LoginRepository{
        private Map<String,String> loginMap = new HashMap<>();
        public LoginRepository()
        {
            loginMap.put("john","pass@123");
        }

        public boolean validateLogin(LoginInput loginInput)
        {
            if(loginMap.containsKey(loginInput.username))
            {
                String password = loginMap.get(loginInput.username);
                if(!password.equals(loginInput.password)){
                    throw new LoginFailureException("password is not correct for user: "+loginInput.username);
                }
                return true;
            }
            throw new LoginFailureException("username not found: "+loginInput.username);
        }
    }
    private static class LoginInput{
        String username;
        String password;
    }

    private static class LoginFailureException extends RuntimeException{
        public LoginFailureException(String message) {
            super(message);
        }
    }
}
