package number2;

public class Main {
	public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Вы не передавали параметров");
        } else {
            System.out.println("Вы ввели " + args.length + " параметров");
        }
    }
}