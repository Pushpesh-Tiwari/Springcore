/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package technosoft;

public class Govt {
     private String pmName;
     private String country;
     private String rules;

    public Govt() {
    }
    @Override
    public String toString()
    {
        return pmName+" "+country+" "+rules;
    }
    public Govt(String pmName, String country, String rules) {
        this.pmName = pmName;
        this.country = country;
        this.rules = rules;
    }
    

    public String getPmName() {
        return pmName;
    }

    public void setPmName(String pmName) {
        this.pmName = pmName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }
     
}
