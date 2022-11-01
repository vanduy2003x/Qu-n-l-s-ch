import java.util.ArrayList;
import java.util.Scanner;

public class Masach {
    public static void main(String[] args) {
        ArrayList<Sach>books=new ArrayList<>();
        //Taoj sacsh 1
        Sach sach = new Sach();
        sach.setNamSanXuat(1986);
        sach.setMaSach(1);
        sach.setTheLoai("Truyện tranh");
        sach.setTenSach("dragon ball");
        sach.setTacGia("Toriyama Akira");
        sach.setNhaSanXuat(" Shueisha");

        //Tao sach2
        Sach sach2 = new Sach();
        sach2.setNamSanXuat(1994);
        sach2.setMaSach(2);
        sach2.setTheLoai("Trinh thám");
        sach2.setTenSach("Thám Tử Lừng Danh Conan");
        sach2.setTacGia("Aoyama Gōshō");
        sach2.setNhaSanXuat(" Shogakukan");

        //luu sach vao list
        books.add(sach);
        books.add(sach2);
        // tìm kiếm tên sách
        System.out.println(books.toString());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập sách muốn tìm: ");
        String nameBook= scanner.nextLine();
        for(int i=0; i<books.size(); i++){
            if(books.get(i).getTenSach().equals(nameBook)){
                System.out.println(books.get(i).toString());
            }

        }
        // tìm kiếm thể loại sách
        System.out.println("Mời bạn nhập thể loại muốn tìm");
        String theloai=scanner.nextLine();
        for (int j=0;j<books.size();j++){
            if (books.get(j).getTheLoai().equals(theloai));
            System.out.println(books.get(j).toString());
        }
        System.out.println("Liệt kê các sách xuất bản trong năm nay");
        String lietke=scanner.nextLine();
        System.out.println(lietke);
        }

    }

