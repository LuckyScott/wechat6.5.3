package com.tencent.mm.protocal.c;

import com.tencent.mm.ba.a;

public final class amv extends a {
    public int mNo;
    public int mau;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            aVar.dV(1, this.mau);
            aVar.dV(2, this.mNo);
            return 0;
        } else if (i == 1) {
            return (a.a.a.a.dS(1, this.mau) + 0) + a.a.a.a.dS(2, this.mNo);
        } else {
            if (i == 2) {
                a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
                for (int a = a.a(aVar2); a > 0; a = a.a(aVar2)) {
                    if (!super.a(aVar2, this, a)) {
                        aVar2.bQL();
                    }
                }
                return 0;
            } else if (i != 3) {
                return -1;
            } else {
                a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
                amv com_tencent_mm_protocal_c_amv = (amv) objArr[1];
                switch (((Integer) objArr[2]).intValue()) {
                    case 1:
                        com_tencent_mm_protocal_c_amv.mau = aVar3.pMj.mH();
                        return 0;
                    case 2:
                        com_tencent_mm_protocal_c_amv.mNo = aVar3.pMj.mH();
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
