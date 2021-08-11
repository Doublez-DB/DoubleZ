import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author zz
 * @date 2021/8/10
 **/
public class testUdf {
    public static void main(String[] args) throws ParseException {
        Map<String,String> p = new HashMap<>();
        p.put("1","cai");
        p.put("2","zhang");
        p.put("3","tai");
        p.put("4","peng");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");

        String dateStr1 = "2021-08-09 00:00:00";
        Date date1 = DateUtil.parse(dateStr1);

        String dateStr2 = "2021-10-04 00:00:00";
        Date date2 = DateUtil.parse(dateStr2);

        //相差一个月，31天
        long betweenDay = DateUtil.between(date1, date2, DateUnit.DAY);

        int a = (int)Math.ceil(betweenDay/14);
        //天数模以人数
        String  b = String.valueOf(a%4);
        System.out.println(betweenDay);
        System.out.println(a);
        System.out.println(b);
        System.out.println(p.get("4"));
        System.out.println(p.get(b.replace("0","4")));

    }
}
