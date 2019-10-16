package jianzhioffer2;
/*
 * 十三.写一个八皇后来证明我确实回使用回溯算法
 *
 * 机器人我就不写了，没看懂题目要求啥(未解决)  新思路: 判断新下的棋是否安全时，只需要判断该点中上，左上，右上有没有已经存在的点即可
 * */
public class test13 {
    public static void main(String[] args){
        quene q = new quene();
        //好像又没写成功！
    }
}
class quene{
    private int row;
    private int clos;
    private int num;

    public boolean route(int row,int clos){
        this.row = row;
        this.clos = clos;
        num = 0;
        int[][] map = new int[8][8];//这里的占位图不使用boolean的原因是防止回溯的时候重复清除，0表示未占位
        boolean[][] mm = new boolean[8][8];
        for(int i =0;i<8;i++){
            if(gogo(map,mm,row,i,num)){
                return true;
            }
        }
        return false;
    }
    public boolean gogo(int[][] map,boolean[][] mm,int r,int c,int num){
        if(num == 8){
            //查看返回值
            System.out.println();
            System.out.println("boolean");
            for(int o=0;o<8;o++){
                for(int k= 0;k<8;k++){
                    System.out.print(mm[o][k]+" ");
                }
                System.out.println();
            }
            return true;
        }
        if(c>=8 || r>=8){
            return false;
        }

        if(map[r][c] !=0){  // r<0||r>=8||c<0||c>=8||
            gogo(map,mm,r,c+1,num);
        }
        mm[r][c] = true;
        //.....
        if(gogo(baozhuang(map,r,c),mm,r+1,0,num+1)){
            return true;
        }
        mm[r][c] = false;
        return false;
    }
    public int[][] baozhuang(int[][] map,int r,int c){
        //占位上下左右斜对角
        for(int i =0;i<8;i++){
            map[r][i]++;
            map[i][c]++;
        }
        int rr = r;int cc = c;
        while(rr<8 && cc<8){
            map[rr][cc]++;
            rr++;
            cc++;
        }
        rr = r;cc =c;
        while(rr<8 && cc >0){
            map[rr][cc]++;
            rr++;
            cc--;
        }
        rr = r;cc =c;
        while(rr>0 && cc >0){
            map[rr][cc]++;
            rr--;
            cc--;
        }
        rr = r;cc =c;
        while(rr>0 && cc <8){
            map[rr][cc]++;
            rr--;
            cc++;
        }
        return map;
    }

}