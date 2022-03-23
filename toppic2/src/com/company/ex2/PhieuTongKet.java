package com.company.ex2;

import java.util.ArrayList;
import java.util.List;

public class PhieuTongKet {
    private List<IXe> xeGui = new ArrayList<IXe>();

    public int guiXe(){
        return this.xeGui.size();
    }
    public double tienGuiXe(){
        double tongTien = 0;
        for (IXe xe : this.xeGui) {
            tongTien = xe.getPrice() * xe.getSoPhieu();
        }
        return tongTien;
    }
    public double tienLai(IXe iXe){
        double lai = tienGuiXe() - (tienGuiXe()*0.1 + iXe.getSoPhieu()*100);
        return lai;
    }
}
