package Entities;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Task {

    String nome;
    String desc;
    Date dtermino;
    Integer lvlpriori;
    String Cat;
    ArrayList<Task> ListaTask;

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

    public Date getDtermino() {
        return dtermino;
    }

    public void setDtermino(Date dtermino) {
        this.dtermino = dtermino;
    }

    public Integer getLvlpriori() {
        return lvlpriori;
    }

    public void setLvlpriori(Integer lvlpriori) {
        this.lvlpriori = lvlpriori;
    }

    public String getCat() {
        return Cat;
    }

    public void setCat(String cat) {
        Cat = cat;
    }


}
