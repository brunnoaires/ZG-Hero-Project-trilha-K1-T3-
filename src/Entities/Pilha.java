package Entities;

import java.util.ArrayList;

public class Pilha {
    int limite = 5;

    ArrayList<Empresa> pilha = new ArrayList<Empresa>();

    public void push(Empresa empresa) {
        if (pilha.size() >= limite ){
            return;
        }

        pilha.add(empresa);

    }

    public Empresa pop(){
        return pilha.get(pilha.size() -1);
    }

     public int count(){
        return pilha.size();

    }
}
