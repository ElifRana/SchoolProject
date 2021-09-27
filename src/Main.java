import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

       ListManager<String> studentName = new ListManager<>();

       studentName.addList("Elif");
       studentName.addList("Rana");
       studentName.addList("Nergis");

       ListManager<String> studentLastName = new ListManager<>();

       studentLastName.addList("Yılancı");
       studentLastName.addList("Yıldız");
       studentLastName.addList("Bilgin");

       ArrayList<String> schoolName = studentName.getList();
       ArrayList<String> schoolLastName = studentLastName.getList();

       for(int i = 0 ; i < schoolName.size(); i++) {
          System.out.println("Ad: " + schoolName.get(i) + " Soyad: " + schoolLastName.get(i));
       }
    }
}
