/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.livre;

/**
 *
 * @author pro
 */
public class Livre {
    private String titre;
    private String auteur;
    private int nombreDePages;
    private double prix;

    public Livre(String titre, String auteur, int nombreDePages) {
        this.titre = titre;
        this.auteur = auteur;
        this.nombreDePages = nombreDePages;
    }

    public Livre(String titre, String auteur, int nombreDePages, double prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.nombreDePages = nombreDePages;
        this.prix = prix;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getNombreDePages() {
        return nombreDePages;
    }

    public void setNombreDePages(int nombreDePages) {
        this.nombreDePages = nombreDePages;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
      
    
    public boolean prixFixe(){
       if(this.prix<0)
           return false;
       else
           return true;
    }
      
    public int compare(Livre l1){
        if(l1.nombreDePages==this.nombreDePages)
            return 0;
        else if(l1.nombreDePages<this.nombreDePages) 
            return 1;
        else
            return -1;
    }
            
    @Override
    public String toString() {
        if(this.prix>=0){
         return "Livre{" + "titre=" + titre + ", auteur=" + auteur + ", nombreDePages=" + nombreDePages + ", prix=" + prix + '}';
         }
        else
        return "Livre{" + "titre=" + titre + ", auteur=" + auteur + ", nombreDePages=" + nombreDePages + ", prix= Prix pas encore donné" ;   
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        Livre l1=new Livre("hhh","hhhhhh",20,0);
        System.out.println(l1.toString());
        System.out.println(l1.prixFixe());
        
    }
}
