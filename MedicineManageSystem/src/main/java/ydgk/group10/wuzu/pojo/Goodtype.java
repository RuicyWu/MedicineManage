package ydgk.group10.wuzu.pojo;

import java.util.List;

public class Goodtype {
    private Integer tid;
    private String type;
    private List<Good> goodList;

    public Goodtype(Integer tid, String type, List<Good> goodList) {
        this.tid = tid;
        this.type = type;
        this.goodList = goodList;
    }

    @Override
    public String toString() {
        return "Goodtype{" +
                "tid=" + tid +
                ", type='" + type + '\'' +
                ", goodList=" + goodList +
                '}';
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Good> getGoodList() {
        return goodList;
    }

    public void setGoodList(List<Good> goodList) {
        this.goodList = goodList;
    }

    public Goodtype() {
    }
}
