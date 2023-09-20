/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.JOptionPane;

public class PilhaHeap {

    public NoPilha topo;
    public int cont;

    public PilhaHeap() {
        this.topo = null;
        this.cont = 0;
    }

    /*Método que empilha dados na pilha heap*/
    public void push(Object dado) {

        NoPilha newPilha = new NoPilha();

        /*Preencher atributos internos de dados*/
        newPilha.valor = dado;

        /*Configurar variaveis de instância de ligação*/
        if (topo == null) {
            newPilha.ant = null;
        } else {
            newPilha.ant = topo;
        }
        topo = newPilha;
        cont++;
    }

    public void pop() {

        NoPilha temp = topo;

        if (topo == null) {
            JOptionPane.showMessageDialog(null, "Pilha ja está vazia");
            return;
        }

        topo = temp.ant; // o novo topo será o anterior;
        temp = null;
        cont--; // diminui os elementos empilhados;

    }

    public void plotar() {

        if (topo == null){
            return;
        }
        
        NoPilha temp = topo;
        String saida = "";
        while (temp != null) {
            saida += temp.valor + "\n";
            temp = temp.ant;
        }
        
        
        JOptionPane.showMessageDialog(null, saida);
    }

}
