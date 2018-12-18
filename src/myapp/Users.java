/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

/**
 *
 * @author Pc
 */
public class Users {
    int idUser;
    String docType;
    String userName;
    String password;
    String idType;
    String houseNum;
    String street;
    String subDistrict;
    String district;
    String province;
    int zipcode;
    String email;
    Users(int idUser,String docType,String username,String password,
        String idType,String houseNum,String street,String subDistrict,
        String district,String province,int zipCode,String email){
            this.idUser = idUser;
            this.docType = docType;
            this.userName = username;
            this.password = password;
            this.idType = idType;
            this.houseNum = houseNum;
            this.street = street;
            this.subDistrict = subDistrict;
            this.district = district;
            this.province = province;
            this.zipcode = zipCode;
            this.email = email;
    }
    
}


