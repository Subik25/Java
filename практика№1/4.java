package number4;

public class Main {
	public static void main(String[] args) {
		String login = "name";
		String password = "qwerty";
		if (login.equals(args[0]) && password.equals(args[1])) {
			System.out.println("Вас узнали. Добро пожаловать");
			
		} else {
			System.out.println("Логин и пароль не распознаны. Доступ запрещён");
		}
			
	}
}