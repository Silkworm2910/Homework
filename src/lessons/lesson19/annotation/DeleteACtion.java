package lessons.lesson19.annotation;

@PermissionRequired(User.Permission.ADMIN)
public class DeleteACtion {
    public void delete(User user) {
        System.out.println("del user");
    }

}
