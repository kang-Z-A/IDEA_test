package Math;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Math_demo {
    public static void main(String[] args) throws ParseException {
        /*
        //Math.abs(x)求绝对值
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));

        //Math.ceil(x)求大于x的最小整数
        System.out.println(Math.ceil(76.4));
        System.out.println(Math.ceil(-76.4));

        //Math.floor(x)求小于x的最大整数
        System.out.println(Math.floor(76.4));
        System.out.println(Math.floor(-76.4));

        //Math.random()求[0.0,1.0)的随机数
        System.out.println(Math.random());

        //Math.round(x)求x的四舍五入结果
        System.out.println(Math.round(76.4));
        System.out.println(Math.round(-76.4));

        //Math.pow(a,b)求a的b次幂
        System.out.println(Math.pow(2.0,3.0));

        //Math.max(a,b) Math.mix(a,b)求a，b的最大/小值

        */
        /*long start = System.currentTimeMillis();
        for (int i=0;i<10000;i++)
        {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时："+(end-start)+"毫秒");*/

        /*String s = "27 56 13 98 46";
        String[] arr=s.split(" ");
        int[] intarr=new int[arr.length];
        for(int i=0;i< arr.length;i++)
        {
            intarr[i]=Integer.valueOf(arr[i]);
        }
        Arrays.sort(intarr);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i< intarr.length;i++){
            if(i== intarr.length){
                sb.append(intarr[i]);
            }else
            sb.append(intarr[i]+" ");
        }
        String s1 = sb.toString();

        System.out.println(s1);*/

        /*//Date到String
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s=sdf.format(d);
        System.out.println(s);
        System.out.println("---------");

        //String到Date
        String s1="2021-12-12 10:05:25";
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd=sdf2.parse(s1);
        System.out.println(dd);*/

        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int day = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + day + "日");

    }
}
