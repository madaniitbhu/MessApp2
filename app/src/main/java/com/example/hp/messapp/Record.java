package com.example.hp.messapp;

/**
 * Created by hp on 1/5/2018.
 */

public class Record {


    private String mserial;
    private String mbreakfast;
    private String mlunch;
    private String mdinner;
    private String mExtra;


    public Record(String serial,String breakfast,String lunch,String dinner,String Extra) {

      mserial=serial;
        mbreakfast=breakfast;
        mlunch=lunch;
        mExtra=Extra;
        mdinner=dinner;
       }


    public String getMserial()
    {
        return mserial;
    }
    public String getMbreakfast()
    {
        return mbreakfast;
    }
    public String getMlunch()
    {
        return mlunch;
    }
    public String getMdinner(){
        return mdinner;

    }
    public String getmExtra(){
        return mExtra;

    }






}

