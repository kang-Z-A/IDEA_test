package Doudizhu;

import java.util.*;

public class demo {
    public static void main(String[] args) {
        //创建牌盒
        HashMap<Integer,String> hm=new HashMap<>();
        ArrayList<Integer> arr=new ArrayList<>();
        String[] colors={"♦","♣","♥","♠"};
        String[] numbers={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int index=0;
        for(String num:numbers){
            for (String c:colors){
                hm.put(index,c+num);
                arr.add(index);
                index++;
            }
        }
        hm.put(index,"小王");
        arr.add(index);
        index++;
        hm.put(index,"大王");
        arr.add(index);

        /*
            洗牌
        */
        Collections.shuffle(arr);

        //为每人发牌
        TreeSet<Integer> one=new TreeSet<>();
        TreeSet<Integer> two=new TreeSet<>();
        TreeSet<Integer> three=new TreeSet<>();
        TreeSet<Integer> poker=new TreeSet<>();

        for(Integer i:arr){
            Integer ii = arr.get(i);
            if(i>=arr.size()-3){
                poker.add(ii);
            }else if(i%3==0){
                one.add(ii);
            }else if(i%3==1){
                two.add(ii);
            }else{
                three.add(ii);
            }
        }

        //遍历每个人的牌
        Search("one",one,hm);
        Search("two",two,hm);
        Search("three",three,hm);
        Search("poker",poker,hm);
    }

    //遍历牌型
    public static void Search(String name,TreeSet<Integer> ts,HashMap<Integer,String> hm){
        System.out.println(name+"的牌为：");
        for (Integer i:ts){
            System.out.print(hm.get(i)+"\t");
        }
        System.out.println();
    }
}
