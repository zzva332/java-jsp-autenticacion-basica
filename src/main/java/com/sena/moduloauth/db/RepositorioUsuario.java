/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sena.moduloauth.db;

import com.sena.moduloauth.models.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class RepositorioUsuario {
    
    public static List<Usuario> getListaUsers(){
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(new Usuario("test1@gmail.com", "12345"));
        usuarios.add(new Usuario("test2@gmail.com", "12345"));
        usuarios.add(new Usuario("test3@gmail.com", "12345"));
        usuarios.add(new Usuario("test4@gmail.com", "12345"));
        
        
        return usuarios;
    }
    
    public Usuario get(String email, String password){
        Usuario userEncontrado = null;
        for(Usuario user : getListaUsers()){
            if(user.username.equals(email) && user.password.equals(password)){
                userEncontrado = user;
            }
        }
        return userEncontrado;
    }
}
