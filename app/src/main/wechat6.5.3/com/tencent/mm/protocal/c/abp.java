package com.tencent.mm.protocal.c;

import com.tencent.mm.ba.a;
import java.util.LinkedList;

public final class abp extends a {
    public String gkB;
    public LinkedList<aib> mom = new LinkedList();

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            if (this.gkB != null) {
                aVar.e(1, this.gkB);
            }
            aVar.d(2, 8, this.mom);
            return 0;
        } else if (i == 1) {
            if (this.gkB != null) {
                r0 = a.a.a.b.b.a.f(1, this.gkB) + 0;
            } else {
                r0 = 0;
            }
            return r0 + a.a.a.a.c(2, 8, this.mom);
        } else if (i == 2) {
            r0 = (byte[]) objArr[0];
            this.mom.clear();
            a.a.a.a.a aVar2 = new a.a.a.a.a(r0, unknownTagHandler);
            for (r0 = a.a(aVar2); r0 > 0; r0 = a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            abp com_tencent_mm_protocal_c_abp = (abp) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    com_tencent_mm_protocal_c_abp.gkB = aVar3.pMj.readString();
                    return 0;
                case 2:
                    LinkedList zQ = aVar3.zQ(intValue);
                    int size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) zQ.get(intValue);
                        aib com_tencent_mm_protocal_c_aib = new aib();
                        a.a.a.a.a aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (boolean z = true; z; z = com_tencent_mm_protocal_c_aib.a(aVar4, com_tencent_mm_protocal_c_aib, a.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_abp.mom.add(com_tencent_mm_protocal_c_aib);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
