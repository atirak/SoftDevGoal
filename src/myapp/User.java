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
public class User {
    int id_user;
    String doc_type;
    String username;
    String password;
    String id_type;
    String house_num;
    String street;
    String sub_district;
    String district;
    String province;
    int zip_code;
    String email;
    User(int id_user,String doc_type,String username,String password,
        String id_type,String house_num,String street,String sub_district,
        String district,String province,int zip_code,String email){
            this.id_user = id_user;
            this.doc_type = doc_type;
            this.username = username;
            this.password = password;
            this.id_type = id_type;
            this.house_num = house_num;
            this.street = street;
            this.sub_district = sub_district;
            this.district = district;
            this.province = province;
            this.zip_code = zip_code;
            this.email = email;
    }
    
}


