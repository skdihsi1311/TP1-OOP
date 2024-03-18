/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.livre;

/**
 *
 * @author pro
 */
public class Etagere {
    private Livre[] livres;
    private int nbreLivre;
    private int capacite;

    public Etagere(int capacite) {
        this.nbreLivre = 0;
        this.capacite=capacite;
        this.livres=new Livre[capacite];
    }

    public int getNbreLivre() {
        return nbreLivre;
    }

    public int nbreLivreEtagere(){
        return capacite;
    }
    
    
    
    public void ajouterLivre(Livre l1){
        if(this.nbreLivre<this.capacite){
            livres[nbreLivre]=l1;
            nbreLivre++;
        }
        else
            System.out.println("L'etagere est pleine");
    }
    public Livre getLivre(int a){
        if(a>=1 && a<nbreLivre)
            return livres[a-1];
        else
            System.out.println("Position n'est pas valide");
        return null;
    }
    
    public int chercherLivre(String auteur,String titre){
            for(int i=0;i<nbreLivre;i++){
                Livre livre=livres[i];
                if(auteur==livre.getAuteur() &&titre==livre.getTitre())
                    return i+1;
        
            }
            return 0;
    }

    public void supprimerLivre(int position){
            if(position>=1 && position <nbreLivre){
                for(int i=position-1;i<nbreLivre-1;i++){
                    livres[i]=livres[i+1];
                    
                }
                livres[nbreLivre-1]=null;
                nbreLivre--;
                
            }
            else
                System.out.println("Position n'est pas valide");

             }
    
    
}
