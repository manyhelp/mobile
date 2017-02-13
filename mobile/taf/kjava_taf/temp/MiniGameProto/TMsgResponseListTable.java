// **********************************************************************
// This file was generated by a TAF parser!
// TAF version 1.5.1 by WSRD Tencent.
// Generated from `/usr/local/resin_system.mqq.com/webapps/communication/taf/upload/MiniGameProto_new.jce'
// **********************************************************************

package MiniGameProto;

public final class TMsgResponseListTable extends com.qq.taf.jce.JceStruct
{
    public String className()
    {
        return "MiniGameProto.TMsgResponseListTable";
    }

    public short nResultID = (short)0;

    public short nGameID = (short)0;

    public short nTotalNum = (short)0;

    public java.util.Vector vecTableList = new java.util.Vector();

    public short getNResultID()
    {
        return nResultID;
    }

    public void  setNResultID(short nResultID)
    {
        this.nResultID = nResultID;
    }

    public short getNGameID()
    {
        return nGameID;
    }

    public void  setNGameID(short nGameID)
    {
        this.nGameID = nGameID;
    }

    public short getNTotalNum()
    {
        return nTotalNum;
    }

    public void  setNTotalNum(short nTotalNum)
    {
        this.nTotalNum = nTotalNum;
    }

    public java.util.Vector getVecTableList()
    {
        return vecTableList;
    }

    public void  setVecTableList(java.util.Vector vecTableList)
    {
        this.vecTableList = vecTableList;
    }

    public TMsgResponseListTable()
    {
    }

    public TMsgResponseListTable(short nResultID, short nGameID, short nTotalNum, java.util.Vector vecTableList)
    {
        this.nResultID = nResultID;
        this.nGameID = nGameID;
        this.nTotalNum = nTotalNum;
        this.vecTableList = vecTableList;
    }

    public boolean equals(Object o)
    {
        TMsgResponseListTable t = (TMsgResponseListTable) o;
        return (
            com.qq.taf.jce.JceUtil.equals(nResultID, t.nResultID) && 
            com.qq.taf.jce.JceUtil.equals(nGameID, t.nGameID) && 
            com.qq.taf.jce.JceUtil.equals(nTotalNum, t.nTotalNum) && 
            com.qq.taf.jce.JceUtil.equals(vecTableList, t.vecTableList) );
    }

    public void writeTo(com.qq.taf.jce.JceOutputStream _os)
    {
        try
        {
            _os.write(nResultID, 0);
            _os.write(nGameID, 1);
            _os.write(nTotalNum, 2);
            _os.write(vecTableList, 3);
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
            nResultID = 0;
            nResultID = (short) _is.read(nResultID, 0, true);

            nGameID = 0;
            nGameID = (short) _is.read(nGameID, 1, true);

            nTotalNum = 0;
            nTotalNum = (short) _is.read(nTotalNum, 2, true);

            vecTableList = new java.util.Vector();
            MiniGameProto.TTableInfo __var_15 = new MiniGameProto.TTableInfo();
            vecTableList.addElement(__var_15);
            vecTableList = (java.util.Vector) _is.read(vecTableList, 3, true);

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