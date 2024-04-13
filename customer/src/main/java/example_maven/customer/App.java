package example_maven.customer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;



public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program started..." );
        
        String configFile = "example_maven/customer/config.xml";
        
        ApplicationContext context = new ClassPathXmlApplicationContext(configFile);
        JdbcTemplate template= context.getBean("template", JdbcTemplate.class);
        
        //insert query
        //String query= "insert into student(id,name,address) values(?,?,?)";
        
        //update query
        //String query="update student set name=?, address=? where id=?";
        
        //Delete query
        String query="delete from student where id=?";
        
        //fire query
        int result= template.update(query,222);
        System.out.println(result +"rows affected...");
        
    }
}
