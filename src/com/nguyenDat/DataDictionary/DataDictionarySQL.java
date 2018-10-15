package com.nguyenDat.DataDictionary;

import java.sql.*;

public class DataDictionarySQL {
    private static Connection con;
    private static PreparedStatement pstm;
    public DataDictionarySQL(){
        con = getConnectionSQL.getConnection();
    }
    public static String SearchAnhViet(String w){
        try {
            pstm = con.prepareStatement("select detail from tbl_edict where word = ?");
            pstm.setString(1,w);

            ResultSet rs = pstm.executeQuery();
            String mean = "";
            while(rs.next()){
                mean = rs.getString("detail");
            }
            return mean;
        }catch (SQLException e){
            System.out.println(e);
        }
        return "";

    }

    public void SearchVietAnh(String word){

    }
    public void ListWord(String word){

    }
    public void DeleteWord(String word){

    }
    public void UpdateWord(String word, String mean){

    }
}
