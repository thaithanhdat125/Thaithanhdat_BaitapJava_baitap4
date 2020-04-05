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
public class XeNoiThanh extends ChuyenXe{
    int SoTuyen;
    int SoKm;

    public XeNoiThanh(String MaSoChuyen, String HoTenTX, String SoXe,int SoTuyen, int SoKm,  double DoanhThu) {
        super(MaSoChuyen, HoTenTX, SoXe, DoanhThu);
        this.SoTuyen = SoTuyen;
        this.SoKm = SoKm;
    }

    public int getSoTuyen() {
        return SoTuyen;
    }

    public void setSoTuyen(int SoTuyen) {
        this.SoTuyen = SoTuyen;
    }

    public int getSoKm() {
        return SoKm;
    }

    public void setSoKm(int SoKm) {
        this.SoKm = SoKm;
    }

    @Override
    public String Xuat() {
        return super.Xuat()+
                 "\nSố Tuyến: "+SoTuyen+
                 "\nSố Km đi được: "+SoKm+
                 "\nDoanh Thu: "+DoanhThu+
                 "\n------------------------\n"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
