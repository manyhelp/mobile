// **********************************************************************
// This file was generated by a TAF parser!
// TAF version 2.1.4.1 by WSRD Tencent.
// Generated from `Test.jce'
// **********************************************************************

using System;
namespace Test
{

    public sealed class A : Wup.Jce.JceStruct
    {
        int _a = 0;
        public int a
        {
            get
            {
                 return _a;
            }
            set
            {
                _a = value; 
            }
        }

        public B b {get; set;} 

        public override void WriteTo(Wup.Jce.JceOutputStream _os)
        {
            _os.Write(a, 1);
            _os.Write(b, 2);
        }

        public override void ReadFrom(Wup.Jce.JceInputStream _is)
        {
            a = (int) _is.Read(a, 1, true);

            b = (B) _is.Read(b, 2, true);

        }

        public override void Display(System.Text.StringBuilder _os, int _level)
        {
            Wup.Jce.JceDisplayer _ds = new Wup.Jce.JceDisplayer(_os, _level);
            _ds.Display(a, "a");
            _ds.Display(b, "b");
        }

    }
}
