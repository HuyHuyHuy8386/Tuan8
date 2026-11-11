package On_Tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class ListQuanLy<T> 
{
    private List<T> ds;

    public ListQuanLy() { this.ds = new ArrayList<>(); }

    // Phương thức thêm nhiều phần tử cùng lúc (Varargs)
    @SafeVarargs
    public final void themNhieu(T... items) { Collections.addAll(this.ds, items); }

    // Phương thức thêm 1 phần tử
    public boolean them(T item) { return this.ds.add(item); }

    // Phương thức đếm phần tử theo điều kiện (sử dụng Predicate / Lambda)
    public long dem(Predicate<T> dieukien) { return this.ds.stream().filter(dieukien).count(); }

    // Lấy danh sách phần tử
    public List<T> getDanhSach() { return ds; }
}