package org.example;

import java.util.ArrayList;

public class UC {

    String nomeUC;
    ArrayList<Nota> notas;
    int totalAlunos;

    public UC(String nomeUC, int totalAlunos) {
        this.nomeUC = nomeUC;
        this.totalAlunos = totalAlunos;
        notas = new ArrayList<Nota>();
    }

    public boolean insereNotaUC(int numAluno, double nota){
        Nota notanova = new Nota(numAluno,nota);
        notas.add(notanova);
        return true;
    }

    public double pesquisaAluno (int numAluno){
        for (int i=0;i<notas.size();i++){
            if(numAluno==notas.get(i).getNumAluno()){
                return notas.get(i).getNota();
            }
        }
        return -1;
    }

    public float media(){
        int soma=0;
        for (int i=0;i<notas.size();i++){
            soma+=notas.get(i).getNota();
        }
        return soma/notas.size();
    }

    public boolean aprovado(int numAluno){
        for (int i=0;i<notas.size();i++){
            if(notas.get(i).getNumAluno()==numAluno){
                if(notas.get(i).getNota()>9.5){
                    return true;
                }
            }
        }
        return false;
    }





}
