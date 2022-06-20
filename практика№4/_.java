Реализация готовой продукции. Создать родительский класс "Товар"(идентификатор,код,наименование,цена,описание) и дочерние классы:
 -"Хрупкий товар"(коэффициент хрупкости); -"Скоропортящийся товар" (мах время храненния); -"Габаритный товар"(высота,ширина,длина).
 Реализовать класс для хранения списка товаров с методом добавления нового товара и методом печати списка товаров.



import java.lang.String;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
    Sclad sclad= new Sclad();
    sclad.add(new GabaritnyiTovar(0001,99,"table",7000,"cool table",60,50,140));
    sclad.add(new HrupkiyTovar(0002,88,56,"vase","good vase",1));
    sclad.add(new SkoroportTovar(0003,77,"milk",80,"yami milk",5));
    sclad.printSclad();
    }
}
class Sclad  {
    private ArrayList<Tovar> list;
    public int count=0;
    Sclad(){
        list=new ArrayList<>();
    }
    public  void add(Tovar tovar){
        list.add(tovar);
        count++;
    }
    public void printSclad(){
        for (Tovar item:list) {
            System.out.print(item);
            System.out.println();
        }
    }
}
class GabaritnyiTovar extends Tovar  {
    int height;
    int width;
    int length;
    public GabaritnyiTovar(int id, int code, String name, int price, String opisanie, int height, int width, int length) {
        super(id, code, name, price, opisanie);
        this.height = height;
        this.width = width;
        this.length = length;
        if (height >= 50 && width >= 50 && length >= 50){
            System.out.println("Krupnogabarithyi tovar");
        }
        else{
            System.out.println("Melkiy tovar");
        }
    }
    @Override
    public String toString(){
        return super.toString()+ "V" +"height "+ height + " " + width + " " + length;
    }

}
class SkoroportTovar extends Tovar{
    int max_time;

    public SkoroportTovar(int id, int code, String name, int price, String opisanie, int max_time) {
        super(id, code, name, price, opisanie);
        this.max_time = max_time;
        if (max_time <= 5) {
            System.out.println("Scoroport tovar");
        } else {
            System.out.println("Dolgiy tovar");
        }
    }
    @Override
    public String toString(){
        return super.toString()+ "max time" + max_time;
    }
}
class HrupkiyTovar extends Tovar {
    int khr;
    public HrupkiyTovar(int id, int code, int price, String name, String opisanie, int khr) {
        super(id,code,name,price,opisanie);
        this.khr = khr;
        if (khr <= 1) {
            System.out.println("Hrupkiy tovar");
        } else {
            System.out.println("Krepkiy tovar");
        }
    }
    @Override
    public String toString(){
        return super.toString() +"khr" + khr;
    }
}
class Tovar {
    private int id;
    private int code;
    private String name;
    private int price;
    private String opisanie;
    public Tovar(int id, int code, String name, int price, String opisanie){
        this.id = id;
        this.code = code;
        this.name = name;
        this.price = price;
        this.opisanie = opisanie;
    }
    public String toString(){
        return "id" + " " + id + "\n" + "Code" + " " + code + "\n" + "name" + " " + name + "\n" + "price" + " " + price + "\n" + "opisanie" + " " + opisanie;
    }
}