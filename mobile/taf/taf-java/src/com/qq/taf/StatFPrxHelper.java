// **********************************************************************
// This file was generated by a TAF parser!
// TAF version 2.0.1 by WSRD Tencent.
// Generated from `StatF.jce'
// **********************************************************************

package com.qq.taf;

public final class StatFPrxHelper extends com.qq.taf.proxy.ServantProxy implements StatFPrx
{

    public StatFPrxHelper taf_hash(int hashCode)
    {
        super.taf_hash(hashCode);
        return this;
    }

    public java.util.Map __defaultContext()
    {
        java.util.HashMap _ctx = new java.util.HashMap();
        return _ctx;
    }

    protected String sServerEncoding = "GBK";
    public int setServerEncoding(String se){
        sServerEncoding = se;
        return 0;
    }

    public int reportMicMsg(java.util.Map<com.qq.taf.StatMicMsgHead, com.qq.taf.StatMicMsgBody> msg, boolean bFromClient)
    {
        return reportMicMsg(msg, bFromClient, __defaultContext());
    }

    @SuppressWarnings("unchecked")
    public int reportMicMsg(java.util.Map<com.qq.taf.StatMicMsgHead, com.qq.taf.StatMicMsgBody> msg, boolean bFromClient, java.util.Map __ctx)
    {
        com.qq.taf.jce.JceOutputStream _os = new com.qq.taf.jce.JceOutputStream(0);
        _os.setServerEncoding(sServerEncoding);
        _os.write(msg, 1);
        _os.write(bFromClient, 2);
        byte[] _sBuffer = com.qq.taf.jce.JceUtil.getJceBufArray(_os.getByteBuffer());

        java.util.HashMap<String, String> _mStatus = new java.util.HashMap<String, String>();

        byte[] _returnSBuffer = taf_invoke("reportMicMsg", _sBuffer, __ctx, _mStatus);

        com.qq.taf.jce.JceInputStream _is = new com.qq.taf.jce.JceInputStream(_returnSBuffer);
        _is.setServerEncoding(sServerEncoding);
        int _ret = 0;
        _ret = (int) _is.read(_ret, 0, true);
        return _ret;
    }

    public void async_reportMicMsg(com.qq.taf.StatFPrxCallback callback, java.util.Map<com.qq.taf.StatMicMsgHead, com.qq.taf.StatMicMsgBody> msg, boolean bFromClient)
    {
        async_reportMicMsg(callback, msg, bFromClient, __defaultContext());
    }

    public void async_reportMicMsg(com.qq.taf.StatFPrxCallback callback, java.util.Map<com.qq.taf.StatMicMsgHead, com.qq.taf.StatMicMsgBody> msg, boolean bFromClient, java.util.Map __ctx)
    {
        com.qq.taf.jce.JceOutputStream _os = new com.qq.taf.jce.JceOutputStream(0);
        _os.setServerEncoding(sServerEncoding);
        _os.write(msg, 1);
        _os.write(bFromClient, 2);
        byte[] _sBuffer = com.qq.taf.jce.JceUtil.getJceBufArray(_os.getByteBuffer());

        java.util.HashMap<String, String> _mStatus = new java.util.HashMap<String, String>();

        taf_invokeAsync(callback, "reportMicMsg", _sBuffer, __ctx, _mStatus);

    }

    public int reportSampleMsg(java.util.ArrayList<com.qq.taf.StatSampleMsg> msg)
    {
        return reportSampleMsg(msg, __defaultContext());
    }

    @SuppressWarnings("unchecked")
    public int reportSampleMsg(java.util.ArrayList<com.qq.taf.StatSampleMsg> msg, java.util.Map __ctx)
    {
        com.qq.taf.jce.JceOutputStream _os = new com.qq.taf.jce.JceOutputStream(0);
        _os.setServerEncoding(sServerEncoding);
        _os.write(msg, 1);
        byte[] _sBuffer = com.qq.taf.jce.JceUtil.getJceBufArray(_os.getByteBuffer());

        java.util.HashMap<String, String> _mStatus = new java.util.HashMap<String, String>();

        byte[] _returnSBuffer = taf_invoke("reportSampleMsg", _sBuffer, __ctx, _mStatus);

        com.qq.taf.jce.JceInputStream _is = new com.qq.taf.jce.JceInputStream(_returnSBuffer);
        _is.setServerEncoding(sServerEncoding);
        int _ret = 0;
        _ret = (int) _is.read(_ret, 0, true);
        return _ret;
    }

    public void async_reportSampleMsg(com.qq.taf.StatFPrxCallback callback, java.util.ArrayList<com.qq.taf.StatSampleMsg> msg)
    {
        async_reportSampleMsg(callback, msg, __defaultContext());
    }

    public void async_reportSampleMsg(com.qq.taf.StatFPrxCallback callback, java.util.ArrayList<com.qq.taf.StatSampleMsg> msg, java.util.Map __ctx)
    {
        com.qq.taf.jce.JceOutputStream _os = new com.qq.taf.jce.JceOutputStream(0);
        _os.setServerEncoding(sServerEncoding);
        _os.write(msg, 1);
        byte[] _sBuffer = com.qq.taf.jce.JceUtil.getJceBufArray(_os.getByteBuffer());

        java.util.HashMap<String, String> _mStatus = new java.util.HashMap<String, String>();

        taf_invokeAsync(callback, "reportSampleMsg", _sBuffer, __ctx, _mStatus);

    }

}