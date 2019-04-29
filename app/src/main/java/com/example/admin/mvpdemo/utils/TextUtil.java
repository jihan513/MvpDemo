package com.example.admin.mvpdemo.utils;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;

import java.util.Collection;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextUtil {

    /**
     * 判断文本不为空
     * @param txt
     * @return
     */
    public static boolean isValidate(String txt) {
        return txt != null && !"".equals(txt.trim());
    }

    /**
     * 判断集合不为空
     * @param list
     * @return
     */
    public static boolean isValidate(Collection<?> list) {
        return list != null && list.size() > 0;
    }

    /**
     * 判断集合不为空
     * @param map
     * @return
     */
    public static boolean isValidate(Map<?, ?> map) {
        return map != null && map.size() > 0;
    }

    /**
     * 环信会话列表，显示表情不全解决办法
     * */
    public static String getText(String text) {
        if (text.length() <= 15) {
            return text;
        } else {
            String newText = text.substring(0, 15);
            if (newText.substring(14, 15).equals("]")) {
                return newText + "...";
            } else {
                int index = newText.lastIndexOf("[");
                if (index > 10) {
                    return newText.substring(0, index) + "...";
                } else {
                    return newText + "...";
                }
            }
        }
    }

    //改变数字颜色
    public static SpannableString ChangeNumColor(String str, int color) {
        SpannableString ss = new SpannableString(str);
        boolean b = false;
        int s = 0;
        int e = str.length();
        for (int i = 0; i < str.length(); i++) {
            if (isNumeric(str.charAt(i)) || String.valueOf(str.charAt(i)).equals(".")) {
                if (!b) {
                    s = i;
                    b = true;
                }

            } else {
                if (b) {
                    e = i;
                    break;
                }
            }
        }

        ss.setSpan(new ForegroundColorSpan(color), s, e,
                Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        return ss;
    }

    public static boolean isNumeric(char str) {

        Pattern pattern = Pattern.compile("[0-9]*");

        Matcher isNum = pattern.matcher(String.valueOf(str));

        if (!isNum.matches()) {

            return false;

        }

        return true;

    }
}
