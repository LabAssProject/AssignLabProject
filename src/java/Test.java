import java.util.HashSet;
import java.util.Set;


// DAO.DAOFactory;
import DAO.GenericDAO;
import DAO.QueueDAO;
import DAO.UserNotificationDAO;
import pojo.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author rania
 * 
 */
public class Test extends GenericDAO {

	/**
	 * @param args
	 */
    
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		/*
		 * DAO Factory entry point
		 */
            
            /****sara*/
//           QueueDAO qd=new QueueDAO();
//           qd.insert();
//            Department dept = new Department();
//
//            dept.setName("GIS");
//            dept.setDescription("java");
//            dept.setIsActive(1);
//
//            //save(dept);
//            User user = new User();
//
//            user.setEmail("ahmed");
//            user.setIsActive(1);
//            user.setName("ahmed");
//            user.setPass("123456");
//            user.setDepartment(dept);
//           // save(user);
//     
//   
//            // user.setIdUser(1);
//
//             User recive =new User();               
//             recive.setEmail("u@hh");
//             recive.setIsActive(0);
//             recive.setName("sara");
//             recive.setPass("1234");
//             recive.setDepartment(dept);
//             //recive.setIdUser(2);
////             
//             List<User> ricever=new ArrayList<User>();
//             
//            UserNotificationDAO und=new UserNotificationDAO();
//            und.insertNotification(user, ricever, "message1");
//            
            
            
            /****/
	//DAOFactory factory = DAOFactory.createScoringDAO(DAOFactory.SCORING);
           // Session session = sessionFactory.openSession();
            QueueDAO queue=new QueueDAO();
            queue.insert();
//	
//		
//		/*User user=new User();
//                
//                Lab lab=new Lab();*/
//	          
//		  
		/* factory.getQueueDAO().insertTraineeInDeliveryQueue(user, lab);*/
//         SessionFactory   sessionFactory = new Configuration().configure("/Hbm/hibernate.cfg.xml").buildSessionFactory();
//                 Session session = sessionFactory.openSession();
        /*    Department dept= new Department();
            dept.setName("MAD");
            dept.setDescription("java");
            dept.setIsActive(1);
        
               // session.save(dept);
                 User user =new User();
                 
              user.setEmail("raniaaa");
              user.setIsActive(1);
                 user.setName("dfgh");
		user.setPass("123456");
                user.setDepartment(dept);
               Lab lab=new Lab();
              lab.setName("lab1");
              lab.setDescription("java lab");
              lab.setEndDate(new Date());
              lab.setCourse(null);
  */
            
//             Department dept=new Department();
//        
//        dept.setName("GIS");
//            dept.setDescription("java");
//            dept.setIsActive(1);
//     
//           
//              
//          User user =new User();
//                 
//              user.setEmail("ahmed");
//              user.setIsActive(1);
//              user.setIdUser(1);
//                 user.setName("ahmed");
//		user.setPass("123456");
//                user.setDepartment(dept);
//               
//                 Course course =new Course();
//                 course.setIsActive(1);
//                 course.setDepartment(dept);
//                 course.setDescription("java");
//                 course.setName("java");
//                 
//               Lab lab=new Lab();
//               lab.setIdLab(1);
//              lab.setName("lab1");
//              lab.setDescription("java lab");
//              lab.setEndDate(new Date());
//              lab.setStartDate(new Date());
//              lab.setCourse(course);
//            
////             //  queue.insertTraineeInDeliveryQueue( user ,lab);
////              Date date=new Date();
////               // queue.shiftDeliveryQueue(lab ,date);
////  List list= queue.getTraineeInDeliveryQueue(lab);
//// for(int i=0; i<list.size();i++)
////     
//// {
//// User user1= (User)list.get(i);
////  System.out.println(user1.getName());
//// }     
//   session.beginTransaction();
//session.persist(user);
////session.persist(buyProduct);
//session.getTransaction().commit();
//              //  user.set
//		
//		
	}
}
