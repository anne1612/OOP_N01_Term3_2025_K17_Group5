public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Nhóm 5 test quản lý thư viện!");
        Student st = new Student();
        st.HotenSV ="Nguyen Thi Van";
        st.MaSV = "MaSV1234";
     
        System.out.println(st.HienthiSinhVien(st.MaSV));

    }
}
