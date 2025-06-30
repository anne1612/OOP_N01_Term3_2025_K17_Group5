package com.example.servingwebcontent.model;
import java.util.Scanner;

public class User 
{
    private String userId;
    private String name;
    private Gender gender;
    private String birthDate;
    private String phoneNumber;
    private String email;
    private String address;
    private String password;
    private UserType userType;

    public enum Gender {
        Male, Female, Other
    }

    public enum UserType {
        Customer, Seller
    }

    public User(){}

    public User(String name, Gender gender, String birthDate, String phoneNumber, 
            String email, String address, String password, UserType userType)
    {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.password = password;
        this.userType = userType;
    }


    public String getUserId() { return userId; }
    public String getName() { return name; }
    public Gender getGender() { return gender; }
    public String getBirthDate() { return birthDate; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail() { return email; }
    public String getAddress() { return address; }
    public String getPassword() { return password; }
    public UserType getUserType() { return userType; }
    public void setName(String name)
    {
        this.name = name;

    } 
    public void setUser(String userId, String name, Gender gender, String birthDate, String phoneNumber, 
                            String email, String address, String password, UserType userType) 
    { 
        this.userId = userId;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.password = password;
        this.userType = userType; 
    }

    public void setUserId(String userId)
        {
            this.userId = userId;
        }

    public void setUserName(String name)
    {
        this.name = name;
    }


    public void setAddress(String address)
    {
        this.address = address;

    }
    
    public void printUserName(User u){
        System.out.println("Submited Name:");
        System.out.println(u.name);
    }

    public boolean login(String loginId, String password)        //đăng nhập
    {
        return (loginId.equals(this.phoneNumber) || loginId.equals(this.email)) && password.equals(this.password);
    }

    public void showUser()          //hiển thị thông tin user
    {
        System.out.println("Mã người dùng: " + userId);
        System.out.println("Tên: " + name);
        System.out.println("Giới tính: " + gender);
        System.out.println("Ngày sinh: " + birthDate);
        System.out.println("SĐT: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Loại người dùng: " + userType);
    }

     public void registerUser() 
     {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã người dùng: ");
        userId = sc.nextLine();

        System.out.print("Nhập tên: ");
        name = sc.nextLine();

        while (true) {
            System.out.print("Nhập giới tính (Male/Female/Other): ");
            try {
                gender = Gender.valueOf(sc.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Giới tính không hợp lệ! Vui lòng nhập lại.");
            }
        }

        System.out.print("Nhập ngày sinh (dd/mm/yyyy): ");
        birthDate = sc.nextLine();

        System.out.print("Nhập số điện thoại: ");
        phoneNumber = sc.nextLine();

        System.out.print("Nhập email: ");
        email = sc.nextLine();

        System.out.print("Nhập địa chỉ: ");
        address = sc.nextLine();

        System.out.print("Nhập mật khẩu: ");
        password = sc.nextLine();

        // --- Loại người dùng ---
        while (true) {
            System.out.print("Nhập loại người dùng (Customer/Seller): ");
            try {
                userType = UserType.valueOf(sc.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Loại người dùng không hợp lệ! Vui lòng nhập lại.");
            }
        }
    }
}
