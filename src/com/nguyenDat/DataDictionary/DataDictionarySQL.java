package com.nguyenDat.DataDictionary;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataDictionarySQL {
    private static Connection con;
    private static PreparedStatement pstm;
    public DataDictionarySQL(){
        con = getConnectionSQL.getConnection();
    }
    public static String SearchAnhViet(String w){
        try {
            pstm = con.prepareStatement("select detail from dictionary where word = ?");
            pstm.setString(1,w);

            ResultSet rs = pstm.executeQuery();
            String mean = null;
            while(rs.next()){
                mean = rs.getString("detail");
            }
            return mean;
        }catch (java.sql.SQLException e){
            System.out.println(e);
        }
        return null;

    }

    public static void SearchVietAnh(String word){

    }
    public static String[] ListWord(String word){
        try {
            pstm = con.prepareStatement("SELECT word FROM dictionary WHERE word  LIKE ?");
            pstm.setString(1,word + "%");
            ResultSet rs = pstm.executeQuery();
            String mean[] =  new String[101]; int i =0;

            while(rs.next()){
                mean[i] = rs.getString("word");
                i++;
                if(i > 100) return mean;
            }
            if(i < 100){
                String[] mean2 = new String[i];
                for(int j = 0; j < i; j++){
                    mean2[j] = mean[j];
                }
                return mean2;
            }
            return mean;
        }catch (SQLException e){
            System.out.println(e);
        }
        return null;
    }
    public static void DeleteWord(String word){
        try {
            pstm = con.prepareStatement("delete from dictionary where word = ?");
            pstm.setString(1,word);
            pstm.executeUpdate();

        }catch (java.sql.SQLException e){
            System.out.println(e);
        }
    }
    public static void UpdateWord(String oldWord,String word, String mean){
        System.out.println("dat");
        try {
            pstm = con.prepareStatement("update dictionary set word = ?,detail = ? where word = ?");
            pstm.setString(1,word);
            pstm.setString(2,mean);
            pstm.setString(3,oldWord);
            pstm.executeUpdate();
        }catch (java.sql.SQLException e){
            System.out.println(e);
        }
    }
    public static void addWord(String word,String mean){
        try {
            pstm = con.prepareStatement("insert into dictionary(word,detail) values (?,?)");
            pstm.setString(1,word);
            pstm.setString(2,mean);
            pstm.executeUpdate();
        }catch (java.sql.SQLException e){
            System.out.println(e);
        }
    }
}
