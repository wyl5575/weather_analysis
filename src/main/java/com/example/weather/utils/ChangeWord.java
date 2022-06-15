package com.example.weather.utils;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;

public class ChangeWord {
    /**
     * 中文转拼音
     * @param chinese
     * @return
     */
    public static String toPinyin(String chinese) {
        StringBuilder pinyinStr = new StringBuilder();
        // 创建拼音输出格式：小写、无需音调
        HanyuPinyinOutputFormat pinyinFormat = new HanyuPinyinOutputFormat();
        pinyinFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        pinyinFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        // 循环遍历转换
        for (char ch : chinese.toCharArray()) {
            if (ch > 128) {
                try {
                    pinyinStr.append(PinyinHelper.toHanyuPinyinStringArray(ch, pinyinFormat)[0]);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                pinyinStr.append(ch);
            }
        }
        return pinyinStr.toString();
    }
}
