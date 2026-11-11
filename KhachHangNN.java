package On_Tap;

import java.time.LocalDate;

class KhachHangNN extends KhachHang 
{
    private String quocTich;

    public KhachHangNN(String ma,
    				   String ten,
    				   LocalDate ngay, 
                       double soKW,
                       double donGia, 
                       String quocTich) 
    {
        super(ma, ten, ngay, soKW, donGia);
        this.quocTich = quocTich;
    }

    public String getQuocTich() { return quocTich; }

    @Override
    public double thanhTien() { return soKW * donGia; }
}