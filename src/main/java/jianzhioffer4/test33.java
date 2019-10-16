package jianzhioffer4;
/*
* 三十三.二叉搜索树的后续遍历序列
* */
public class test33 {
    public static void main(String[] args){

    }
    public boolean isVerify(int[] array){
        if(array == null || array.length == 0)
            return false;
        return verify(array,0,array.length-1);
    }
    public boolean verify(int[] array,int first,int last){
        if(last - first <=1){
            return true;
        }
        int i = first;
        int rootvalue = array[last];
        while(i < last && rootvalue >= array[i]){
            i++;
        }
        for(int j = i;j < last;j++){
            if(array[j] < rootvalue){
                return false;
            }
        }
        return verify(array, first, i-1) && verify(array, i, last-1);
    }
}
