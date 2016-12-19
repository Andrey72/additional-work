package task.test;
import task.model.Student;
import task.utils.StudentUtils;

/**
 * Created by Sherlock on 18.12.2016.
 */
public class TestStudent {
    public static  void  main(String[] args){


        Student st1= new Student();
        Student st2 = null ;

            st1.init("Kyiv" , "Andrey" , "123@gmail.com", 4000 );


        System.out.println(StudentUtils.convertStudent(st1));
        System.out.println(st1.convertStudent());

        st2 = st1;

        st1 = null;
    }
}





