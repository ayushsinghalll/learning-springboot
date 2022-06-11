package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )

    {
        ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");

        //Employee  bean Primitives data type
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

        //Car Dealer Collection type
        CarDealer carDealer = (CarDealer) ctx.getBean("carDealer");
        System.out.println("Car Dealer Name :"+ carDealer.getName());
        System.out.println("Car Model Name :"+ carDealer.getModels());

        //Customer
        Customer customer = (Customer) ctx.getBean("customer");
        System.out.println(customer);

        //Language
        Language language = (Language) ctx.getBean("language");
        System.out.println(language);

        //Reference Type
        Student student = (Student) ctx.getBean("student");
        System.out.println(student);
        Student student1 = (Student) ctx.getBean("student1");
        System.out.println(student1);

        //Assigment
        Shopping shopping = (Shopping) ctx.getBean("shopping");
        System.out.println(shopping);

        //Patint
        Patient patient = (Patient) ctx.getBean("patient");
        System.out.println(patient);
        ctx.registerShutdownHook();
        //close Bean
        ctx.close();

    }
}
