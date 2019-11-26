package com.company;

public class Dispatch
{
    /**
     * dispatchCMD call the methods corresponding with the right user controls
     * @param userCMD User controls
     * @param listCMD available controls
     * @return return control
     */
    public static String dispatchCMD(String userCMD,String[] listCMD)
    {
        if(userCMD.equals("Help"))
        {
            System.out.println("Debug Help");
            for(int i = 0; i < listCMD.length; i++)
            System.out.println(listCMD[i]);
        }
        else if(userCMD.equals("Create"))
        {
            System.out.println("Debug Create");
        }
        //need return ?
        return userCMD;
    }
}
