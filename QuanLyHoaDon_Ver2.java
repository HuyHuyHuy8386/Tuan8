package On_Tap;

import java.time.LocalDate;

public class QuanLyHoaDon_Ver2 
{
    public static void main(String[] args) 
    {
        ListQuanLy<KhachHang> ql = new ListQuanLy<>();

        ql.themNhieu(
            new KhachHangVN("VN01", "Nguyen Van A",
                LocalDate.of(2018, 9, 10), 100, 1500, "sinh hoạt", 50),
            new KhachHangVN("VN02", "Tran Thi B",
                LocalDate.of(2018, 10, 5), 200, 2000, "kinh doanh", 100),
            new KhachHangVN("VN03", "Le Van C",
                LocalDate.of(2019, 1, 20), 80, 1800, "sản xuất", 60),
            new KhachHangNN("NN01", "John Smith",
                LocalDate.of(2018, 9, 25), 150, 2500, "Mỹ"),
            new KhachHangNN("NN02", "Yuki Tanaka",
                LocalDate.of(2018, 8, 15), 120, 3000, "Nhật"),
            new KhachHangNN("NN03", "Kim Min Su",
                LocalDate.of(2019, 3, 8), 90, 2800, "Hàn")
        );

        // Đếm số lượng từng loại khách hàng sử dụng instanceof và Lambda
        System.out.println("VN: " + ql.dem(kh -> kh instanceof KhachHangVN));
        System.out.println("NN: " + ql.dem(kh -> kh instanceof KhachHangNN));
    }
}