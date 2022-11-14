package hibernate_project;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class mainMeth 
{
	public static void main(String [] args) 
	{
		SessionFactory sfactory=new Configuration().configure().buildSessionFactory();
		Session ses=sfactory.openSession();
		Transaction tx=null;
		tx=ses.beginTransaction();
		ClassRoom stu=new ClassRoom();
		stu.setNamee("Srividya");
		stu.setAge(23);
		stu.setNamee("Asha");
		stu.setAge(23);
		stu.setNamee("Katy");
		stu.setAge(23);
		stu.setNamee("Vedita");
		stu.setAge(23);
		stu.setNamee("triveni");
		stu.setAge(23);
		ses.persist(stu);
		ses.flush();
		tx.commit();
		ses.close();
	}

}
