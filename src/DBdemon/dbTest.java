package DBdemon;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
//测试类把数据表所有的信息拿出来，输出到控制台
public class dbTest {
    public static void main(String[] args) {
        Connection conn=null;
        Statement sts=null;
        ResultSet rs=null;
        List<userModel> users=null;//用userModel对象取得信息,该类的属性与数据表的列一致。
        try {
            conn=jdbcUtil.getConnection();
            sts=conn.createStatement();
            String sql="select *from student";
            rs= sts.executeQuery(sql);
            userModel user;
            users=new ArrayList<>();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Long salary = rs.getLong("salary");
                user=new userModel();//对象不能在外面new！！
                user.setId(id);
                user.setName(name);
                user.setSalary(salary);
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            jdbcUtil.close(rs,sts,conn);
        }
        System.out.println(users);
    }
}
