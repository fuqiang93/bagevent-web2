package com.fxk.controller;

import com.fxk.entity.User;
import com.fxk.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.*;
import java.util.List;

/**
 * @author fuqiang01
 * @date 2020/4/30 22:05
 * @description
 */
@RestController
@RequestMapping("/user")
@Api(value = "UserController", tags = {"用户控制器"})
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/test")
    @ApiOperation("测试")
    public String test() {

        Connection con;
        //驱动程序名
        String driver = "com.mysql.cj.jdbc.Driver";
        //URL指向要访问的数据库名mysql
        String url = "jdbc:mysql://192.168.59.100:3306/bagevent?useSSL=false&serverTimezone=UTC";
        //MySQL配置时的用户名
        String user = "root";
        //MySQL配置时的密码
        String password = "fq930315";
        //遍历查询结果集
        try {
            //加载驱动程序
            Class.forName(driver);
            //1.getConnection()方法，连接MySQL数据库！！
            con = DriverManager.getConnection(url,user,password);
            if(!con.isClosed())
                System.out.println("Succeeded connecting to the Database!");
            //2.创建statement类对象，用来执行SQL语句！！
            Statement statement = con.createStatement();
            //要执行的SQL语句
            String sql = "select * from user";
            //3.ResultSet类，用来存放获取的结果集！！
            ResultSet rs = statement.executeQuery(sql);
            System.out.println("执行结果如下所示:");
            System.out.println("-----------------");
            System.out.println("姓名" + "\t" + "年龄"+ "\t" + "职位");
            System.out.println("-----------------");

            String name = null;

            while(rs.next()){
                //获取name这列数据
                name = rs.getString("user_name");
                System.out.println(name);
            }
            rs.close();
            con.close();
        } catch(ClassNotFoundException e) {
            //数据库驱动类异常处理
            System.out.println("Sorry,can`t find the Driver!");
            e.printStackTrace();
        } catch(SQLException e) {
            //数据库连接失败异常处理
            e.printStackTrace();
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally{
            System.out.println("数据库数据成功获取！！");
        }
        return "tets";
    }


    @GetMapping("/listAll")
    @ApiOperation("获取所有用户")
    public List<User> listAllUser() {
        return userService.findAllUser();
    }


}
