package desafios.autenticacaoInterfaces.services;

import desafios.autenticacaoInterfaces.classes.Autenticavel;

public class Autenticador {
    private static final String permitidos[] = {"ABC1234", "11111111111", "22222222222"};
    
    public boolean autenticar(Autenticavel quem) {
        boolean autorizado = false;
        for(int i=0; i<permitidos.length && !autorizado; i++){
            autorizado = permitidos[i].equals(quem.obterCredenciais());
        }

        return autorizado;
    }
}
