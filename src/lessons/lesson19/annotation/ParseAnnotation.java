package lessons.lesson19.annotation;

public class ParseAnnotation {

    public static void main(String[] args) {

        User user = new User(User.Permission.ADMIN);

        Class<?> actionClass = DeleteACtion.class;

        PermissionRequired permissionRequired = actionClass.getAnnotation(PermissionRequired.class);

        if(permissionRequired != null) {
            if (user.getPermission().equals(permissionRequired.value())) {
                System.out.println("Пользователю доступно удаление");

                //написать рефлексивный toString

                // написать небошой Dependency Injection Framework
            }
        }
    }
}
