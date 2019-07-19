package application.dto;

import java.util.ArrayList;
import java.util.List;

public class GoodsPageDTO {
    private List<GoodsDTOTable> goodsDTOTableList = new ArrayList<>();

    private int totalpages=0;
    private int numberpage=0;
    private boolean hasPrevious=false;
    private boolean hasNext=false;
    public GoodsPageDTO(){};
    public void setGoodsDTOTableList(List<GoodsDTOTable> goodsDTOTableList) {
        this.goodsDTOTableList = goodsDTOTableList;
    }

    public List<GoodsDTOTable> getGoodsDTOTableList() {
        return goodsDTOTableList;
    }

    public void setTotalpages(int totalpages) {
        this.totalpages = totalpages;
    }

    public int getTotalpages() {
        return totalpages;
    }

    public void setNumberpage(int numberpage) {
        this.numberpage = numberpage;
    }

    public int getNumberpage() {
        return numberpage;
    }

    public boolean isHasPrevious() {
        return hasPrevious;
    }

    public void setHasPrevious(boolean hasPrevious) {
        this.hasPrevious = hasPrevious;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }
}