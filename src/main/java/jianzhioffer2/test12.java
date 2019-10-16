package jianzhioffer2;
/*
 * 十二.矩阵中的路径
 * 给你一个二维数组(矩阵)，和一个字符串，找出再矩阵中有没有一条，通过上下左右和这个字符串相同的字符串
 *
 * 思路:
 * 采用回溯法
 * 从头到尾变量开始的点，从开始的点开始进行上下左右遍历，注意走过的位置不能再走
 *
 * */
public class test12 {
    public static void main(String[] args){
        //好像没写成功
    }
}
class gogo{
    //上下左右的操作
    private final static int[][] next= {{0,-1},{0,1},{-1,0},{1,0}};
    private int rows;   //行数
    private int clos;	//列数

    /*
     * rows行,clos列，map二维数组的矩阵图，string需要匹配的字符串
     * */
    public boolean begin(int rows,int clos,char[][] map,char[] string){
        if(rows == 0|| clos==0)
            return false;              //边界值判断

        this.rows = rows;
        this.clos = clos;
        //定义路径是否有走过的图route，初始化默认都为false
        boolean[][] route = new boolean[rows][clos];
        for(int i = 0;i < rows;i++){
            for(int j = 0;j < clos;j++){
                if(test(i,j,route,map,string,0)){//传入的最后那个0，表示起始点开始遍历时，已经匹配好的长度为0
                    return true;
                }
            }
        }
        return false;
    }
    /*
     * r表示当前所在的行
     * c表示当前所在的列
     * route表示哪些点已经被遍历过
     * map表示图
     * string表示要对比的字符串
     * lenght表示当前匹配字符串完整度，如果lenght == string.lenght的时候，表示匹配成功
     * */
    public boolean test(int r,int c,boolean [][] route,char[][] map,char[] string,int lenght){
        if(lenght == string.length){
            return true;
        }
        //下面这个判断换句话说就是他们的否定都必须要都满足才能进行下一步(即该点成功匹配占用)
        if(r<0 || r>=rows|| c<0||c>=clos||map[r][c]!=string[lenght]||route[r][c]){
            return false;
        }
        route[r][c] = true;
        for(int[] nex:next){
            if(test(r+nex[0],c+nex[1],route,map,string,lenght+1)){
                return true;
            }
        }
        route[r][c] = false;

        return false;
    }
}