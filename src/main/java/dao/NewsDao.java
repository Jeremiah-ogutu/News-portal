package dao;

import models.News;

import java.util.List;

public interface NewsDao {

    void  add(News news);

    List<News>getAll();
    List<News>getAllNewsByDepartment(String content);
    void deleteByDepartment(String content);
    void deleteById(int id);
    void  clearAll();


}
