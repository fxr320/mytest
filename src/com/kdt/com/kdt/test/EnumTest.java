package com.kdt.com.kdt.test;

/**
 * Created by admin on 2019/1/11
 * AT 15:27
 **/
public class EnumTest {
    public static void main(String[] args) {

//        CarEnum ce = CarEnum.AUDI;
//        CarEnum[] ces = CarEnum.values();
//        for (CarEnum cess : ces) {
//            System.out.println(cess);
//        }

        Season spring = Season.SPRING;
        System.out.println(spring.getSeasonName() + ","+spring.getSeasonDesc());
        spring.show();
        Season summer = Season.SUMMER;
        System.out.println(summer.getSeasonName() + ","+summer.getSeasonDesc());
        summer.show();
    }
}

enum CarEnum {
    BMW,
    AUDI,
    BEN,
    VW
}

interface Info{
    public void show();
}

enum Season implements Info {

    SPRING("春天", "春天1"){
        @Override
        public void show() {
            System.out.println("春天在哪里！");
        }
    },
    SUMMER("夏天", "夏天1"){
        @Override
        public void show() {
            System.out.println("夏天很热");
        }
    },
    AUTOUMER("秋天", "秋天1"){
        @Override
        public void show() {
            System.out.println("秋天收获");
        }
    },
    WINTER("冬天", "冬天1"){
        @Override
        public void show() {
            System.out.println("冬天里的一把火");
        }
    };

    private final String seasonName;
    private final String seasonDesc;


    private Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}