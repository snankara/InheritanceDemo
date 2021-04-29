package inheritanceDemo;

public class UserManager {
	
	public void getAll() {
		System.out.println("Listed");
	}
	public void add(User user) {
		System.out.println(user.getFirstName() + " Added");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " Deleted");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " Updated");
	}
}
