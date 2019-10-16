package jianzhioffer1;
/*
 * 五.替换空格
 * 将一个字符串中的空格替换成 "%20"。
 * 在Java看来感觉很简单：思路,在尾部添加一个字符(为了防止xx空格的字符串存在而遗漏最后一个空格),然后利用Java的分割,分割完后，间隔
 * 之间再添加%20,合成完一条完整的字符串后，别忘了把最后一个字符删除
 * */
public class test5 {
    public static void main(String[] args) {
        String str = "a b c ";
        System.out.println(test(str));
    }
    public static String test(String str){
        String str2 = str + "a";
        String stt[] = str2.split("\\s");
        return "";
    }
}
