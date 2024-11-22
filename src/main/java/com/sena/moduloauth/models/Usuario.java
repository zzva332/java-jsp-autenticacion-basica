/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sena.moduloauth.models;

/**
 *
 * @author Usuario
 */
public class Usuario {
    public int id;
    public String username;
    public String password;
    
    public Usuario() {}
    public Usuario(String username, String password){
        this.username = username;
        this.password = password;
    }
}
