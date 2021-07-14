package ydgk.group10.wuzu.pojo;

public class TAdmin {
    private String adminid;

    private String adminname;

    private String adminpwd;

    public TAdmin(String adminid, String adminname, String adminpwd) {
        this.adminid = adminid;
        this.adminname = adminname;
        this.adminpwd = adminpwd;
    }

    public TAdmin() {
        super();
    }

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid == null ? null : adminid.trim();
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }

    public String getAdminpwd() {
        return adminpwd;
    }

    public void setAdminpwd(String adminpwd) {
        this.adminpwd = adminpwd == null ? null : adminpwd.trim();
    }
}