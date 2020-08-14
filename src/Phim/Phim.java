/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phim;

import java.util.Date;


public class Phim {

    private String MaPhim, TenPhim, DaoDien, DienVien, PhuDe, TheLoai;
    private int ThoiLuong, DoTuoi;
    private Date NgayCongChieu;
    private long doanhthu;
    public Phim(String mp, String tp, int thoil, String dd, String dv, String pd, Date NCC, int dt, String TL,long dthu) {
        MaPhim = mp;
        TenPhim = tp;
        DaoDien = dd;
        DienVien = dv;
        PhuDe = pd;
        NgayCongChieu = NCC;
        TheLoai = TL;
        ThoiLuong = thoil;
        DoTuoi = dt;
        doanhthu = dthu;
    }

    
    public Phim(String mp,String tp,long dthu)
    {
        MaPhim = mp;
        TenPhim = tp;
        doanhthu = dthu;
    }
   

    public String getMaP() {
        return MaPhim;

    }

    public String getTenP() {
        return TenPhim;
    }

    public String getDaoDien() {
        return DaoDien;
    }

    public String getDienVien() {
        return DienVien;
    }

    public String getPhuDe() {
        return PhuDe;

    }

    public Date getNgayCC() {
        return NgayCongChieu;
    }

    public String getTheLoai() {
        return TheLoai;
    }

    public int getthoiLuong() {
        return ThoiLuong;
    }

    public int getDoTuoi() {
        return DoTuoi;
    }
    
    
    public long getdoanhthu() {
        return doanhthu;
    }
    
}
