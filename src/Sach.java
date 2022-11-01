public class Sach {
    private String tenSach;
    private int maSach;
    private String tacGia;
    private String theLoai;
    private String nhaSanXuat;
    private int namSanXuat;

    public Sach() {

    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    @Override
    public String toString() {
        return "" +
                "\nTên Sách:" + tenSach +
                "\n Mã Sách: " + maSach +
                "\n Tác Giả: " + tacGia +
                "\n Thể Loại: " + theLoai +
                "\n Nhà Sản Xuất: " + nhaSanXuat +
                "\n Năm Sản Xuất: " + namSanXuat ;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;

    }
    }
