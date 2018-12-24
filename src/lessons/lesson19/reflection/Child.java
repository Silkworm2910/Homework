package lessons.lesson19.reflection;

//reflection api

import java.util.regex.Pattern;

public class Child {
    private String name;
    private int version =1;
    private Parent parent;

  public Child(String name, int version){
        this.name = name;
        this.version = version;
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    private String getInfo() {
        return "private getInfo()";
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", version=" + version +
                '}';
    }
}

class Parent{


}
