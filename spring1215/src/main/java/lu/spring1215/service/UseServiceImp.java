package lu.spring1215.service;

import lu.spring1215.dao.UseDao;
import lu.spring1215.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UseServiceImp implements UseService{
    @Autowired
    public UseDao useDao;

    @Override
    public String service_use(){
        List<User> user=useDao.user();
        StringBuilder str=new StringBuilder();
        for (User u :user) {
            String strs=String.format("%d,%d,%s",u.getId(),u.getAge(),u.getCity());
            str.append(strs).append("<br>");

        }
        return str.toString();
    }


    @Override
    public Double service_useCity(String city){
        List<User> users=useDao.user_city(city);
        Double avg_age=users.stream().mapToDouble(User::getAge).average().orElse(0.0);
        return avg_age;
    }
}
