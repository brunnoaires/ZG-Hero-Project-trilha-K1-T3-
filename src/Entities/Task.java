package Entities;

public class Task {

    private String nome;
    private String desc;
    private String data;
    private String lvlpriori;
    private String cat;

    public Task(String nome, String desc,String data, String lvlpriori, String cat) {
        this.nome = nome;
        this.desc = desc;
        this.data = data;
        this.lvlpriori = lvlpriori;
        this.cat = cat;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLvlpriori() {
        return lvlpriori;
    }

    public void setLvlpriori(String lvlpriori) {
        this.lvlpriori = lvlpriori;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Task{" +
                "nome='" + nome + '\'' +
                ", desc='" + desc + '\'' +
                ", data='" + data + '\'' +
                ", lvlpriori='" + lvlpriori + '\'' +
                ", cat='" + cat + '\'' +
                '}';
    }
}