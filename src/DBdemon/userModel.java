package DBdemon;

import java.lang.ref.PhantomReference;
/*
* 这个叫模型？
* */
public class userModel {
    private int id;
    private  String name;
    private  Long salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "用户名为："+name+'\n'+"ID为："+id+'\n'+"薪水为："+salary+'\n';

    }
}
