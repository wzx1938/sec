import com.company.sec.commons.ResResult;
import com.company.sec.dao.idao.IUserDao;
import com.company.sec.dao.pojo.User;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserServiceImplTest {
@Autowired
IUserDao userDao;

    @Test
    public void login() throws Exception {
        ResResult<User> rr=userDao.login("scott","tiger");
        TestCase.assertNotNull(rr.getData());
        System.out.println(rr);
        ResResult<User> rr2=userDao.login("scott11","tiger");
        System.out.println(rr2);


    }
}