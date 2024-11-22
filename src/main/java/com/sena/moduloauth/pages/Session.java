/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sena.moduloauth.pages;

import javax.servlet.http.HttpSession;

/**
 *
 * @author Usuario
 */
public class Session {
    
    public static String get(HttpSession session, String key){
        if(session == null) return "";
        if(session.getAttribute(key) == null) return "";
        return session.getAttribute(key).toString();
    }
    public static void set(HttpSession session, String key, String value){
        if(session == null) return;
        session.setAttribute(key, value);
    }
}
