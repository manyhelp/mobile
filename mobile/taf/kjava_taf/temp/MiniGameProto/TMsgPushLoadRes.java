// **********************************************************************
// This file was generated by a TAF parser!
// TAF version 1.5.1 by WSRD Tencent.
// Generated from `/usr/local/resin_system.mqq.com/webapps/communication/taf/upload/MiniGameProto_new.jce'
// **********************************************************************

package MiniGameProto;

public final class TMsgPushLoadRes extends com.qq.taf.jce.JceStruct
{
    public String className()
    {
        return "MiniGameProto.TMsgPushLoadRes";
    }

    public int iResID = (int)0;

    public int getIResID()
    {
        return iResID;
    }

    public void  setIResID(int iResID)
    {
        this.iResID = iResID;
    }

    public TMsgPushLoadRes()
    {
    }

    public TMsgPushLoadRes(int iResID)
    {
        this.iResID = iResID;
    }

    public boolean equals(Object o)
    {
        TMsgPushLoadRes t = (TMsgPushLoadRes) o;
        return (
            com.qq.taf.jce.JceUtil.equals(iResID, t.iResID) );
    }

    public void writeTo(com.qq.taf.jce.JceOutputStream _os)
    {
        try
        {
            _os.write(iResID, 0);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void readFrom(com.qq.taf.jce.JceInputStream _is)
    {
        try
        {
            iResID = 0;
            iResID = (int) _is.read(iResID, 0, true);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void display(java.lang.StringBuffer _os, int _level)
    {
    }

}