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
public class XeNgoaiThanh extends ChuyenXe{
    String NoiDen;
    int SoNgay;

    public XeNgoaiThanh(String MaSoChuyen, String HoTenTX, String SoXe,String NoiDen, int SoNgay,  double DoanhThu) {
        super(MaSoChuyen, HoTenTX, SoXe, DoanhThu);
        this.NoiDen = NoiDen;
        this.SoNgay = SoNgay;
    }

    public String getNoiDen() {
        return NoiDen;
    }

    public void setNoiDen(String NoiDen) {
        this.NoiDen = NoiDen;
    }

    public int getSoNgay() {
        return SoNgay;
    }

    public void setSoNgay(int SoNgay) {
        this.SoNgay = SoNgay;
    }
    @Override
    public String Xuat() {
        return super.Xuat()+
                 "\nNơi Đến: "+NoiDen+
                 "\nSố Ngày: "+SoNgay+
                 "\nDoanh Thu: "+DoanhThu+
                 "\n------------------------\n"; //To change body of generated methods, choose Tools | Templates.
    }
}
