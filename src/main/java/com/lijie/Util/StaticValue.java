package com.lijie.Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2017/1/6 0006.
 */
public class StaticValue {

    //单例模式
    private static StaticValue staticValue  = null;
    private String DATAPATH = "G:/dataBase/Jersey/DateBase.txt";
    private InputStreamReader inputStreamReader = null;

    public static StaticValue getStaticValue (){
        return  staticValue;
    }

    public String getDATAPATH() {
        return DATAPATH;
    }

    public InputStreamReader getInputStreamReader() throws IOException{
        File file = new File(getDATAPATH());
        if(!file.exists()){
            file.mkdir();
        }
        inputStreamReader = new InputStreamReader(new FileInputStream(file));
        return inputStreamReader;
    }
}
