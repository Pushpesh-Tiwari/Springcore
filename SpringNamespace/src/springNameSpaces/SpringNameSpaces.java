/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package springNameSpaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import technosoft.Mall;

public class SpringNameSpaces {
    
   public static void main(String args[]){
    ApplicationContext context =
    new ClassPathXmlApplicationContext("/SpringXmlConfig.xml");
    Mall ref = (Mall)context.getBean("mall");
    System.out.println(ref.getRegNo()+" "+ref.getMallName()+" "+ref.getCity()
                       +ref.getGovt());
       
   }   
}
