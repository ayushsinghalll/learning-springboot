package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");

        //Employee  bean
        Employee emp=(Employee) ctx.getBean("emp");
        System.out.println("Employee Id: "+emp.getId());
        System.out.println("Employee Name: "+emp.getName());
        Employee emp1=(Employee) ctx.getBean("emp1");
        System.out.println("Employee Id: "+emp1.getId());
        System.out.println("Employee Name: "+emp1.getName());

        //Hospital Bean
        Hospital hospital = (Hospital) ctx.getBean("hospital");
        System.out.println("Hospital Name :"+ hospital.getName());
        System.out.println(("Hospital Department : "+ hospital.getDepartment()));
       

        //Car Dealer
        CarDealer carDealer = (CarDealer) ctx.getBean("carDealer");
        System.out.println("Car Dealer Name :"+ carDealer.getName());
        System.out.println("Car Model Name :"+ carDealer.getModels());
       
        
        //close Bean
        ctx.close();

    }
}
