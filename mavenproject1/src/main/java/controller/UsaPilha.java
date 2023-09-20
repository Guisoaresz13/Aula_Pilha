/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.PilhaHeap;


public class UsaPilha {
    public static void main(String[] args) {
            PilhaHeap pil = new PilhaHeap();
            
            pil.push("Sara");
            pil.plotar();
            pil.push("Igor");
            pil.plotar();
            pil.push("Raquel");
            pil.plotar();
            
            pil.pop();
            pil.plotar();
            pil.pop();
            pil.plotar();
            pil.pop();
            pil.plotar();
    }
    
}
