package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){

        int forward = forwardScan(startIndex, selection);
        int backward = backwardScan(startIndex, selection);
        if(forward < backward) {
            return forward;
        }
        return backward;
    }

    public Integer forwardScan(Integer startIndex, String selection){
        int forward = 0;    //forward count
        for(int i = startIndex; !playList[i].equals(selection); i ++){
            if (i == playList.length -1){
                i = -1;
            }
            forward++;
        }
        return forward;
    }

    public Integer backwardScan(Integer startIndex, String selection){
        int backward = 0;
        for(int i = startIndex; !playList[i].equals(selection); i --){
            if (i == 0){
                i = playList.length;
            }
            backward++;
        }

        return backward;
    }
}
