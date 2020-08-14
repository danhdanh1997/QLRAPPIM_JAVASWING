/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SanPham;

import java.util.Date;


public class SanPham {

    private String Masp, TenSp, DVT, XuatSu;
    private Date NgayNhap, HSD;
    private int Gia,SL;
    private long doanhthu;

    public SanPham(String ma, String ten, int gia, String dvt, String Xs, Date nn, Date hsd,int sl,long dthu) {
        Masp = ma;
        TenSp = ten;
        DVT = dvt;
        Gia = gia;
        XuatSu = Xs;
        NgayNhap = nn;
        HSD = hsd;
        SL=sl;
        doanhthu = dthu;
    }

    public String getMaSp() {
        return Masp;
    }

    public int getGia() {
        return Gia;
    }
    
     public int getSL() {
        return SL;
    }

     public long getdoanhthu() {
        return doanhthu;
    } 
    public String getTenSp() {
        return TenSp;
    }

    public String getDVt() {
        return DVT;

    }

    public String getXuatS() {
        return XuatSu;
    }

    public Date getNn() {
        return NgayNhap;
    }

    public Date getHSD() {
        return HSD;
    }
    
    
}
