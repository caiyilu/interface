package lu.spring1215.dao;

import lu.spring1215.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UseDao {
    public List<User> user();

    public List<User> user_city(String city);
}
