/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thaithanhdat_baitapjava_baitap4;

import Mypacket.ChuyenXe;
import Mypacket.QuanLyChuyenXe;
import Mypacket.XeNgoaiThanh;
import Mypacket.XeNoiThanh;

/**
 *
 * @author Admin
 */
public class ThaiThanhDat_BaiTapJava_baitap4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Khởi tạo Chuyến xe
        ChuyenXe nhatrang = new XeNoiThanh("NT01","Phạm Vương Lam Nhạc","79F-2155",103,50,100000);
        ChuyenXe hanoi = new XeNoiThanh("HN01","Nguyễn Hoàng Long","53H-4155",23,140,350000);
        ChuyenXe saigon = new XeNoiThanh("SG01","Đỗ Minh Hoàng","55G-6655",73,60,200000);
        ChuyenXe vungtau = new XeNgoaiThanh("VT23","Phạm Văn Pháp","78E-1841", "Vũng Tàu",4, 420000);
        ChuyenXe danang = new XeNgoaiThanh("DN88","Nguyễn Cao Hùng","62E-8841", "Đà Nẵng",2, 120000);
        ChuyenXe dalat = new XeNgoaiThanh("DL42","Nguyễn Đình Cường","22E-9991", "Đà Lạt",1, 20000);
        QuanLyChuyenXe ds = new QuanLyChuyenXe();
//       Thêm tuyến xe vào danh sách
        ds.themChuyenXe(nhatrang);
        ds.themChuyenXe(danang);
        ds.themChuyenXe(hanoi);
        ds.themChuyenXe(dalat);
        ds.themChuyenXe(vungtau);
        ds.themChuyenXe(saigon);
        System.err.println("------List Chuyến Xe-----");
        ds.inDS();
        System.out.println("------Thống kê-----");
        System.out.println("Tổng doanh thu nội thành: "+ds.tinhDoanhThuXeNoiThanh());
        System.out.println("Tổng doanh thu ngoại thành: "+ds.tinhDoanhThuXeNgoaiThanh());
        System.out.println("Tổng Doanh thu: "+ ds.TongDoanhThu());
        
    }
    
}
