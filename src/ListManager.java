import java.util.ArrayList;

public class ListManager<T> {

    private ArrayList<T> list = new ArrayList<>();

    public void addList(T deger){
        this.list.add(deger);
    }

    public ArrayList<T> getList() {
        return this.list;
    }
}
