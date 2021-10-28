package org.example.model;

public enum Denominations {
    SEK_1(1), SEK_2(2), SEK_5(5), SEK_10(10), SEK_20(20), SEK_50(50), SEK_100(100), SEK_200(200), SEK_500(500), SEK_1000(1000);
    private int value;

    private Denominations(int value){
        this.value = value;
    }


}
