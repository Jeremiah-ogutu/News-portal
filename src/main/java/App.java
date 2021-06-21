
import com.google.gson.Gson;
import dao.Sql20DepartmentDao;
import dao.Sql20NewsDao;
import dao.Sql20UserDao;
import models.Department;
import models.News;
import models.User;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import exception.ApiException;
import java.util.HashMap;
import java.util.Map;
import static spark.Spark.*;

public class App{
    public  static  void  main(String[]args){
        Sql20DepartmentDao sql20DepartmentDao;
        Sql20NewsDao sql20NewsDao;
        Sql20UserDao sql20UserDao;
        Connection conn;
        Gson gson = new Gson();


        String connectionString = "jdbc:h2:~/jadle.db;INIT=RUNSCRIPT from 'classpath:DB/create.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "", "");

        sql20UserDao = new Sql20UserDao(sql2o);
        sql20DepartmentDao = new  Sql20DepartmentDao(sql2o);
        sql20NewsDao = new Sql20NewsDao(sql2o);
        conn = sql2o.open();

//
//        get("/users", "application/json",(req,res)->{
//            System.out.println(sql20UserDao.getAllUser());
//            System.out.println("Your data"+ sql20UserDao.getAllUser());
//            if(sql20UserDao.getAllUser().size()>0){
//                return gson.toJson(sql20UserDao.getAllUser());
//            }
//            else {
//                return "{\"message\": \"sorry, no assined user currently.\"}";
//            }
//        });

        //message output

        get("/users", "application/json",(req, res) -> {
            if(sql20UserDao.getAllUser().size() < 1){
                throw new ApiException(404, String.format("notAvailableMsg","Users"));
            }
            res.type("application/json");
            return gson.toJson(sql20UserDao.getAllUser());
        });


        get("/news", "application/json",(req, res) ->{
            if(sql20NewsDao.getAll().size() < 1){
                throw new ApiException(404, String.format("notAvailableMsg","news"));
            }
            res.type("application/json");
            return gson.toJson(sql20NewsDao.getAll());
        });


        get("/departments", "application/json",(req, res) ->{
            if(sql20DepartmentDao.getAll().size() < 0){
                throw new ApiException(404, String.format("notAvailableMsg","departments"));
            }
            res.type("application/json");
            return gson.toJson(sql20DepartmentDao.getAll());
        });


        //message creation

//        post("/users/new", "application/json", (req, res) -> {
//            User user = gson.fromJson(req.body(), User.class);
//            sql20UserDao.addUser(user);
//            res.status(201);
//            return gson.toJson(user);
//        });

        post("/users/new", "application/json", (req, res)->{
            User user = gson.fromJson(req.body(), User.class);
            if(user == null || user.getUserName() == null){
                throw new ApiException(404, String.format("cannotBeEmptyMsg","User"));
            }
            sql20UserDao.addUser(user);
            res.type("application/json");
            res.status(201);
            return gson.toJson(user);
        });

//        post("/news/new", "application/json", (req, res)->{
//            News news = gson.fromJson(req.body(), News.class);
//            if(news == null || news.getNews() == null){
//                throw new ApiException(404, String.format("cannotBeEmptyMsg","User"));
//            }
//            sql20NewsDao.add(news);
//            res.type("application/json");
//            res.status(201);
//            return gson.toJson(news);
//        });

        post("/department/new", "application/json", (req, res) -> {
            Department department = gson.fromJson(req.body(), Department.class);
            if (department == null){
                throw new ApiException(404, String.format("cannotBeEmptyMsg","Department"));
            }
            sql20DepartmentDao.add(department);
            res.type("application/json");
            res.status(201);
            return gson.toJson(department);
        });


        exception(ApiException.class, (exc, req, res) ->{
            ApiException err = (ApiException) exc;
            Map<String, Object> jsonMap = new HashMap<>();
            jsonMap.put("status", err.getStatusCode());
            jsonMap.put("errorMessage", err.getMessage());
            res.type("application/json");
            res.status(err.getStatusCode());
            res.body(gson.toJson(jsonMap));
        });

        after((req, res) ->{
            res.type("application/json");
        });






    }
}