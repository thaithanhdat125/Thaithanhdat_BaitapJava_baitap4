/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypacket;

/**
 *
 * @author Admin
 */
public abstract class ChuyenXe {
    String MaSoChuyen;
    String HoTenTX;
    String SoXe;
    double DoanhThu;

    public ChuyenXe(String MaSoChuyen, String HoTenTX, String SoXe, double DoanhThu) {
        this.MaSoChuyen = MaSoChuyen;
        this.HoTenTX = HoTenTX;
        this.SoXe = SoXe;
        this.DoanhThu = DoanhThu;
    }

    public String getMaSoChuyen() {
        return MaSoChuyen;
    }

    public void setMaSoChuyen(String MaSoChuyen) {
        this.MaSoChuyen = MaSoChuyen;
    }

    public String getHoTenTX() {
        return HoTenTX;
    }

    public void setHoTenTX(String HoTenTX) {
        this.HoTenTX = HoTenTX;
    }

    public String getSoXe() {
        return SoXe;
    }

    public void setSoXe(String SoXe) {
        this.SoXe = SoXe;
    }

    public double getDoanhThu() {
        return DoanhThu;
    }

    public void setDoanhThu(double DoanhThu) {
        this.DoanhThu = DoanhThu;
    }
    public String Xuat()
    {
        return "Mã Số Chuyến Xe: "+MaSoChuyen +
                 "\nHọ Tên Tài Xế: " + HoTenTX +
                 "\nSố xe: " + SoXe;
    }
    
}
