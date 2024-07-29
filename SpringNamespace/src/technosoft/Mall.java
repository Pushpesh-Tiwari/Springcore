/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package technosoft;

/**
 *
 * @author DELL
 */
public class Mall {
    private int regNo;
    private String mallName;
    private String city;
    private Govt govt;

    public Govt getGovt() {
        return govt;
    }

    public void setGovt(Govt govt) {
        this.govt = govt;
    }
    public Mall() {
    }

    public Mall(int regNo, String mallName, String city) {
        this.regNo = regNo;
        this.mallName = mallName;
        this.city = city;
    }
    
    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
}
