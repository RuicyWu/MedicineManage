package ydgk.group10.wuzu.pojo;

import java.util.Date;

//实体类
public class Good {
    private Integer gid;
    private String gname;
    private String type;
    private Date prodate;
    private Double price;
    private Goodtype gt;

    public Good() {
    }

    @Override
    public String toString() {
        return "Good{" +
                "gid=" + gid +
                ", gname='" + gname + '\'' +
                ", type='" + type + '\'' +
                ", prodate=" + prodate +
                ", price=" + price +
                ", gt=" + gt +
                '}';
    }

    public Good(Integer gid, String gname, String type, Date prodate, Double price, Goodtype gt) {
        this.gid = gid;
        this.gname = gname;
        this.type = type;
        this.prodate = prodate;
        this.price = price;
        this.gt = gt;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getProdate() {
        return prodate;
    }

    public void setProdate(Date prodate) {
        this.prodate = prodate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Goodtype getGt() {
        return gt;
    }

    public void setGt(Goodtype gt) {
        this.gt = gt;
    }
}
