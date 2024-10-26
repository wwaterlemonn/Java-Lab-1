//import java.lang.util.Math;

public class LabWork1 {
    public static void main(String args[]){
        int[] z = new int[19];
        for (int i = 0; i < 19; i++){
            z[i] = i+1;
        }

        float[] x = new float[12];
        for (int i = 0; i < 12;i++){
            x[i] = (float) Math.random()*16-9;
        }

        float[][] z1 = new float[19][12];
        for (int i = 0; i < 19; i++){
            for (int j = 0; j < 12; j++){
                z1[i][j] = computeElement(z[i], x[j]);
            }
        }
        printMatrix(z1);
    }

    public static float computeElement(int z, float xf){
        int[] con2 = {2, 3, 9, 10, 11, 13, 14, 16, 18};
        double x = (double) xf; //xf - значение x в float, x - в double для работы с методами Math
        if (z == 8){
            return (float) Math.pow(Math.E,(Math.asin(Math.pow(Math.E,(-Math.abs(x))))));
        }else if (inArray(z, con2)){
            return (float) Math.pow((Math.log(Math.pow(Math.tan(x),2))/1)/2,Math.asin(Math.sin(x)));
        }else{
            return (float) Math.pow(Math.pow(Math.log(Math.pow(2*Math.PI+(4+Math.abs(x))/Math.abs(x),2)/Math.PI),Math.pow(Math.pow((1/3)*(Math.PI-x),2)/2,Math.pow((1-x)/x,2))),Math.pow(Math.E, Math.sin((x-1)/x)));
        }
    }

    public static void printMatrix(float args[][]){
        for (int i = 0; i < 19; i++){
            System.out.println("");
            for (int j = 0; j < 12; j++){
                System.out.printf("%.4f ", args[i][j]);
            }
        }
    }

    public static boolean inArray(int x, int[] args){
        boolean flag = false;
        for (int i = 0; i < args.length; i++){
            if (x == args[i]){
                flag = true;
                break;
            }
        }
        return flag;
    }
}