package services;

import java.util.ArrayList;
import java.util.List;
import classes.*;

public class Autenticador {
    private List<User> users = new ArrayList<>();

    public boolean autenticar(Autenticavel autenticavel){
        String token = autenticavel.obterToken();
        return validLogin(token);
    }

    public boolean validLogin(String token){
        boolean truePass = false;
        
        for(int i=0; !truePass && i<users.size(); i++){
            truePass = users.toString().equals(token);
        }
        
        return truePass;
    }
}
