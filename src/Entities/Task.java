package Entities;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Task {

    private String nome;
    private String desc;
    private String dtermino;
    private String lvlpriori;
    private String Cat;

    public Task(String nome, String desc, String dtermino, String lvlpriori, String cat) {
        this.nome = nome;
        this.desc = desc;
        this.dtermino = dtermino;
        this.lvlpriori = lvlpriori;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDtermino() {return dtermino;}

    public void setDtermino(String  dtermino) {
        this.dtermino = dtermino;
    }

    public String getLvlpriori() {
        return lvlpriori;
    }

    public void setLvlpriori(String  lvlpriori) {
        this.lvlpriori = lvlpriori;
    }

    public String getCat() {
        return Cat;
    }

    public void setCat(String cat) {
        Cat = cat;
    }

    @Override
    public String toString() {
        return "Task{" +
                "nome='" + nome + '\'' +
                ", desc='" + desc + '\'' +
                ", dtermino=" + dtermino +
                ", lvlpriori=" + lvlpriori +
                ", Cat='" + Cat + '\'' +
                '}';
    }
}
