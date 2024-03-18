/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.personne;

/**
 *
 * @author pro
 */
public class Personne {
    private String cin;
    private String nom;
    private String prenom;
    private String email;
    private int age;

    public void initialiser(String cin, String nom, String prenom, String email, int age) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.age = age;
    }
    
    public void afficherPersonne(){
        System.out.println("Le CIN de la personne : "+this.cin);
        System.out.println("Le nom de la personne : "+this.nom);
        System.out.println("Le prenom de la personne : "+this.prenom);
        System.out.println("L'email de la personne : "+this.email);
        System.out.println("L'age de la personne : "+this.age);
    } 
    
    public static void main(String[] args) {
        Personne p1=new Personne();
        p1.initialiser("HH1234","Bomous","Rachid","rachid123@email.com",34);
        p1.afficherPersonne();
    }
}
