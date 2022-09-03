package Model;

import com.example.myapplication6.MainActivity;

public class person {
    private int ID,Price;
    private String Bname,Grade,Subject;

   public person(int ID,int price,String Bname,String Grade,String Subject){
        this.ID=ID;;
        this.Bname=Bname;
        this.Price=price;
        this.Grade=Grade;
        this.Subject=Subject;


    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getBname() {
        return Bname;
    }

    public void setBname(String bname) {
        Bname = bname;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }
}
