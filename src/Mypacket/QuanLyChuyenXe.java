/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypacket;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QuanLyChuyenXe{
     ArrayList<ChuyenXe> ds = new ArrayList<>();

    public QuanLyChuyenXe() {
    }
    public void themChuyenXe(ChuyenXe cx) 
    {
        ds.add(cx);
    }
    
    public void inDS()
    {
        for (ChuyenXe i : ds)
        {
            if(i instanceof XeNoiThanh)
                {
                    System.out.println("Mã Số Chuyến: "+((XeNoiThanh) i).MaSoChuyen);
                    System.out.println("Họ Tên Tài Xế: "+((XeNoiThanh) i).HoTenTX);
                    System.out.println("Số Xe: "+((XeNoiThanh) i).SoXe);
                    System.out.println("Số Tuyến Xe: "+((XeNoiThanh) i).SoTuyen);
                    System.out.println("Số Km: "+((XeNoiThanh) i).SoKm);
                    System.out.println("Doanh Thu: "+((XeNoiThanh) i).DoanhThu);
                    System.out.println("---------------------------");
                }
             if(i instanceof XeNgoaiThanh)
                {
                    System.out.println("Mã Số Chuyến: "+((XeNgoaiThanh) i).MaSoChuyen);
                    System.out.println("Họ Tên Tài Xế: "+((XeNgoaiThanh) i).HoTenTX);
                    System.out.println("Số Xe: "+((XeNgoaiThanh) i).SoXe);
                    System.out.println("Nơi Đến: "+((XeNgoaiThanh) i).NoiDen);
                    System.out.println("Số Ngày: "+((XeNgoaiThanh) i).SoNgay);
                    System.out.println("Doanh Thu: "+((XeNgoaiThanh) i).DoanhThu);
                    System.out.println("---------------------------");
                }
        }
    }
    
    public double tinhDoanhThuXeNoiThanh()
    {
        double noi=0;
        for (ChuyenXe i : ds) 
         {
          if(i instanceof XeNoiThanh) noi=noi+((XeNoiThanh) i).DoanhThu;        
         }
        return noi;
    }
    
    
    public double tinhDoanhThuXeNgoaiThanh()
    {
        double ngoai=0;
        for (ChuyenXe i : ds) 
         {
          if(i instanceof XeNgoaiThanh) ngoai=ngoai+((XeNgoaiThanh) i).DoanhThu;        
         }
        return ngoai;
    }
    
    
    public double TongDoanhThu()
    {
        return tinhDoanhThuXeNoiThanh()+tinhDoanhThuXeNgoaiThanh();
    }
}
