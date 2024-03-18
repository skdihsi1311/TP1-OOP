/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.point;

/**
 *
 * @author pro
 */
public class Point {
    private char nomPoint;
    private double abscisse;

    public Point(char nomPoint, double abscisse) {
        this.nomPoint = nomPoint;
        this.abscisse = abscisse;
    }
    
    public Point(Point p1) {
        p1.nomPoint=nomPoint;
        p1.abscisse=abscisse;
    }
    
    public void affiche(){
        System.out.println("Le nom du point : "+this.nomPoint);
        System.out.println("L'abscisse du point : "+this.abscisse);    
    }
    
    public void translate(double translate){
        abscisse+=translate;        
    }
    
    
    
    public static void main(String[] args) {
        Point p1=new Point('x',2);
        p1.affiche();
        p1.translate(2);
        p1.affiche();
    }
}
