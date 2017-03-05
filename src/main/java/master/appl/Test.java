package master.appl;

import master.model.MasterDatabase;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by Лимаренко on 19.02.2017.
 */
public class Test {
    public static void main(String[]args){

        AbstractApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
        MasterDatabase masters = (MasterDatabase) ctx.getBean("database");
        masters.addMaster("+380503031111","limon.lim@gmail.com", "12qw!@QW","Alex","Limarenko", "Super puper test INFO");


        ctx.close();


        /*int nameDay;
        Date myDate = new Date();
        long longTime = myDate.getTime();
        System.out.println(longTime);
        Calendar calendar = Calendar.getInstance();
        *//*long test = Long.valueOf("0087510721034");
        myDate.setTime(test);
        calendar.setTime(myDate);
        System.out.println("test2: " + calendar.getTime());
        System.out.println("DayWear " + myDate.getDay());*//*
        calendar.set(2017,02,25);
        System.out.println("День рождения: " + calendar.getTime());
        myDate = calendar.getTime();
        System.out.println("Date_1: " + myDate.toString());
        *//*System.out.println("Day: " + myDate.getDay());
        System.out.println(myDate.getTime());*//*
        Map<Date,WorkDay> testMap = new HashMap<Date,WorkDay>();
        Date myDate2 = new Date(myDate.getTime()+ 86400000);
        System.out.println("Date_2: " + myDate2);
        Date myDate3 = new Date(myDate2.getTime()+ 86400000);
        System.out.println("Date_3: " + myDate3);
        Date myDate4 = new Date(myDate3.getTime()+ 86400000);
        System.out.println("Date_4: " + myDate4);
        Date myDate5 = new Date(myDate4.getTime()+ 86400000);
        System.out.println("Date_5: " + myDate5);*/
        /*GregorianCalendar gregCalendar = new GregorianCalendar();
        gregCalendar.set(2017,Calendar.FEBRUARY,20);
        System.out.println(gregCalendar.getTime());
        gregCalendar.add(Calendar.MONTH, 2 );
        System.out.println(gregCalendar.getTime());*/

    }
}