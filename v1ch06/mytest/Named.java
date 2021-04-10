package mytest;

public interface Named {
    default String getName(){
        return getClass().getName()+"_"+hashCode();
    }

    public static void main(String[] args) {
        Student student = new Student();
    }
}
interface Person{
    String getName();
}
class Student implements Person,Named{
    @Override
    public String getName() {
        return null;
    }
}
