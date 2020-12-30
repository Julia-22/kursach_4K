import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static int[][] investment = {
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30}
    };

//    static int[][] income = {
//            {0, 8, 16, 23, 30, 40, 41, 45, 49, 53, 55, 57, 59, 60, 61, 62, 63, 64, 66, 68, 70, 78, 83, 88, 95, 98, 100, 104, 107, 112, 113},
//            {0, 10, 20, 35, 38, 46, 54, 65, 67, 72, 77, 79, 83, 84, 86, 87, 88, 89, 89, 90, 95, 96, 99, 102, 105, 110, 113, 120, 123, 124, 128},
//            {0, 15, 29, 42, 54, 65, 75, 84, 92, 100, 107, 113, 118, 122, 125, 127, 127, 128, 128, 128, 128, 128, 128, 128, 128, 130, 140, 145, 148, 158, 160},
//            {0, 20, 39, 56, 72, 87, 100, 112, 123, 134, 144, 153, 162, 170, 177, 183, 188, 192, 195, 197, 198, 199, 200, 200, 200, 200, 202, 203, 208, 212, 215},
//            {0, 15, 36, 40, 51, 61, 70, 79, 87, 93, 98, 102, 105, 107, 108, 109, 110, 110, 110, 110, 110, 110, 110, 110, 110, 110, 110, 113, 117, 120, 127},
//            {0, 10, 17, 29, 31, 46, 51, 55, 58, 60, 70, 79, 82, 93, 100, 103, 105, 107, 109, 112, 115, 117, 118, 119, 120, 120, 120, 120, 123, 128, 129, 134},
//            {0, 13, 25, 36, 50, 60, 69, 72, 79, 89, 90, 94, 97, 99, 100, 100, 101, 101, 102, 102, 102, 103, 103, 104, 104, 104, 105, 109, 110, 115, 119},
//            {0, 10, 20, 28, 36, 48, 51, 56, 61, 65, 67, 69, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 76, 78, 82, 86, 91},
//            {0, 15, 29, 42, 53, 63, 72, 80, 86, 87, 95, 98, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 101, 107, 109, 112, 116, 121},
//            {0, 8, 20, 23, 30, 36, 41, 45, 49, 53, 55, 57, 59, 60, 61, 62, 63, 64, 65, 65, 65, 65, 68, 70, 71, 76, 83, 90, 95, 101, 104},
//            {0, 20, 39, 56, 72, 87, 100, 112, 123, 134, 144, 159, 162, 170, 173, 183, 188, 192, 195, 197, 198, 199, 200, 200, 200, 200, 200, 206, 210, 212, 213},
//            {0, 10, 20, 29, 38, 46, 51, 55, 58, 60, 65, 79, 87, 93, 100, 105, 109, 112, 115, 117, 118, 119, 120, 120, 120, 120, 120, 122, 124, 128, 130}
//    };


    static int[][] income = {
            {0, 8, 16, 23, 30, 36, 41, 45, 49, 53, 55, 57, 59, 60, 61, 62, 63, 64, 65, 65, 65, 65, 66, 66, 67, 67, 67, 67, 67, 67, 67},
            {0, 10, 20, 29, 38, 46, 54, 61, 67, 72, 77, 79, 82, 84, 86, 87, 88, 89, 89, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90},
            {0, 15, 29, 42, 54, 65, 75, 84, 92, 100, 107, 113, 118, 122, 125, 127, 127, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128},
            {0, 20, 39, 56, 72, 87, 100, 112, 123, 134, 144, 153, 162, 170, 177, 183, 188, 192, 195, 197, 198, 199, 200, 200, 200, 200, 200, 200, 200, 200, 200},
            {0, 15, 28, 40, 51, 61, 70, 79, 87, 93, 98, 102, 105, 107, 108, 109, 110, 110, 110, 110, 110, 110, 110, 110, 110, 110, 110, 110, 110, 110, 110},
            {0, 10, 10, 29, 38, 46, 51, 55, 58, 60, 70, 79, 87, 93, 100, 103, 105, 107, 109, 112, 115, 117, 118, 119, 120, 120, 120, 120, 120, 120, 120, 120},
            {0, 13, 25, 36, 46, 55, 64, 72, 79, 85, 90, 94, 97, 99, 100, 100, 101, 101, 102, 102, 102, 103, 103, 104, 104, 104, 105, 105, 105, 105, 105},
            {0, 10, 20, 28, 36, 43, 50, 56, 61, 65, 67, 69, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70},
            {0, 15, 29, 42, 53, 63, 72, 80, 86, 91, 95, 98, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100},
            {0, 8, 16, 23, 30, 36, 41, 45, 49, 53, 55, 57, 59, 60, 61, 62, 63, 64, 65, 65, 65, 65, 66, 66, 67, 67, 67, 67, 67, 67, 67},
            {0, 20, 39, 56, 72, 87, 100, 112, 123, 134, 144, 153, 162, 170, 177, 183, 188, 192, 195, 197, 198, 199, 200, 200, 200, 200, 200, 200, 200, 200, 200},
            {0, 10, 20, 29, 38, 46, 51, 55, 58, 60, 70, 79, 87, 93, 100, 105, 109, 112, 115, 117, 118, 119, 120, 120, 120, 120, 120, 120, 120, 120, 120}
    };

//    static int[][] income = {
//            {0, 16, 32, 46, 60, 72, 82, 90, 98, 106, 110, 114, 118, 120, 122, 124, 126, 128, 130, 130, 130, 130, 132, 132, 134, 134, 134, 134, 134, 134, 134},
//            {0, 10, 20, 29, 38, 46, 54, 61, 67, 72, 77, 79, 82, 84, 86, 87, 88, 89, 89, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90},
//            {0, 15, 29, 42, 54, 65, 75, 84, 92, 100, 107, 113, 118, 122, 125, 127, 127, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128},
//            {0, 20, 39, 56, 72, 87, 100, 112, 123, 134, 144, 153, 162, 170, 177, 183, 188, 192, 195, 197, 198, 199, 200, 200, 200, 200, 200, 200, 200, 200, 200},
//            {0, 15, 28, 40, 51, 61, 70, 79, 87, 93, 98, 102, 105, 107, 108, 109, 110, 110, 110, 110, 110, 110, 110, 110, 110, 110, 110, 110, 110, 110, 110},
//            {0, 10, 10, 29, 38, 46, 51, 55, 58, 60, 70, 79, 87, 93, 100, 103, 105, 107, 109, 112, 115, 117, 118, 119, 120, 120, 120, 120, 120, 120, 120, 120},
//            {0, 13, 25, 36, 46, 55, 64, 72, 79, 85, 90, 94, 97, 99, 100, 100, 101, 101, 102, 102, 102, 103, 103, 104, 104, 104, 105, 105, 105, 105, 105},
//            {0, 10, 20, 28, 36, 43, 50, 56, 61, 65, 67, 69, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70},
//            {0, 15, 29, 42, 53, 63, 72, 80, 86, 91, 95, 98, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100},
//            {0, 8, 16, 23, 30, 36, 41, 45, 49, 53, 55, 57, 59, 60, 61, 62, 63, 64, 65, 65, 65, 65, 66, 66, 67, 67, 67, 67, 67, 67, 67},
//            {0, 20, 39, 56, 72, 87, 100, 112, 123, 134, 144, 153, 162, 170, 177, 183, 188, 192, 195, 197, 198, 199, 200, 200, 200, 200, 200, 200, 200, 200, 200},
//            {0, 10, 20, 29, 38, 46, 51, 55, 58, 60, 70, 79, 87, 93, 100, 105, 109, 112, 115, 117, 118, 119, 120, 120, 120, 120, 120, 120, 120, 120, 120}
//    };


    public static void main(String[] args) {

        optimum(investment, income);

    }
//ищет минимальную разницу
    public static int minimum(List<Integer> diferences){
        int min = 1000;
        for(int i=0; i<12; i++ ){
            if(min>diferences.get(i)){
                min=diferences.get(i);
            }
        }
        return min;
    }
//если не соответсвует нашему минимуму заполняем 1000
    public static List<Integer> wrong_value(int min, List<Integer> diferences, int[] index, int iteration){
        for(int k = 0; k<12; k++){
            if(diferences.get(k)==min){
                diferences.set(k,income[k][index[k]-iteration] - income[k][index[k] - (1+iteration)]);
            }else{diferences.set(k,1000);}
        }
        return diferences;
    }
//нет повторяющихся минимумов
    public static boolean expected_value(List<Integer> diferences, int min){
        int count = 0;
        for(int i = 0; i<12; i++){
            if(diferences.get(i)==min){
                count++;
            }
        }
        if(count==1){
            return true;
        }else{return false;}
    }
//в какой строке делаем выбор
    public static int value(List<Integer> diferences,int min){
        for(int i = 0; i<12; i++){
            if(diferences.get(i)==min){
                return i;
            }
        }
        return 0;
    }
//углубляемся
    public static int next_iteration(int[] index, List<Integer> diferences){

        int index_min = 100;
        for (int k = 0;k<12; k++){
            if(index_min>index[k]){
                index_min=index[k];
            }
        }

        int min = minimum(diferences);
        if(expected_value(diferences,min)){
            return value(diferences,min);
        }

        if(index_min==1){
            return value(diferences,min);
        }
        List<Integer> diferences1 = wrong_value(min, diferences, index, 1);
        min = minimum(diferences1);
        if(expected_value(diferences1,min)){
            return value(diferences1,min);
        }

        if(index_min==2){
            return value(diferences1,min);
        }
        List<Integer> diferences2 = wrong_value(min, diferences1, index, 2);
        min = minimum(diferences2);
        if(expected_value(diferences2,min)){
            return value(diferences2,min);
        }

        if(index_min==3){
            return value(diferences2,min);
        }
        List<Integer> diferences3 = wrong_value(min, diferences2, index, 3);
        min = minimum(diferences3);
        if(expected_value(diferences3,min)){
            return value(diferences3,min);
        }
        if(index_min==4){
            return value(diferences3,min);
        }
        List<Integer> diferences4 = wrong_value(min, diferences3, index, 4);
        min = minimum(diferences4);
        if(expected_value(diferences4,min)){
            return value(diferences4,min);
        }
        if(index_min==5){
            return value(diferences4,min);
        }
        List<Integer> diferences5 = wrong_value(min, diferences4, index, 5);
        min = minimum(diferences5);
        if(expected_value(diferences5,min)){
            return value(diferences5,min);
        }
        if(index_min==6){
            return value(diferences5,min);
        }
        List<Integer> diferences6 = wrong_value(min, diferences5, index, 6);
        min = minimum(diferences6);
        if(expected_value(diferences6,min)){
            return value(diferences6,min);
        }
        if(index_min==7){
            return value(diferences6,min);
        }
        List<Integer> diferences7 = wrong_value(min, diferences6, index, 7);
        min = minimum(diferences7);
        if(expected_value(diferences7,min)){
            return value(diferences7,min);
        }
        if(index_min==8){
            return value(diferences7,min);
        }
        List<Integer> diferences8 = wrong_value(min, diferences7, index, 8);
        min = minimum(diferences8);
        if(expected_value(diferences8,min)){
            return value(diferences8,min);
        }
        if(index_min==9){
            return value(diferences8,min);
        }
        List<Integer> diferences9 = wrong_value(min, diferences8, index, 9);
        min = minimum(diferences9);
        if(expected_value(diferences9,min)){
            return value(diferences9,min);
        }
        if(index_min==10){
            return value(diferences9,min);
        }
        List<Integer> diferences10 = wrong_value(min, diferences9, index, 10);
        min = minimum(diferences10);
        if(expected_value(diferences10,min)){
            return value(diferences10,min);
        }
        if(index_min==11){
            return value(diferences10,min);
        }
        List<Integer> diferences11 = wrong_value(min, diferences10, index, 11);
        min = minimum(diferences11);
        if(expected_value(diferences11,min)){
            return value(diferences11,min);
        }
        if(index_min==12){
            return value(diferences11,min);
        }
        List<Integer> diferences12 = wrong_value(min, diferences11, index, 12);
        min = minimum(diferences12);
        if(expected_value(diferences12,min)){
            return value(diferences12,min);
        }
        if(index_min==13){
            return value(diferences12,min);
        }
        List<Integer> diferences13 = wrong_value(min, diferences12, index, 13);
        min = minimum(diferences13);
        if(expected_value(diferences13,min)){
            return value(diferences13,min);
        }
        if(index_min==14){
            return value(diferences13,min);
        }
        List<Integer> diferences14 = wrong_value(min, diferences13, index, 14);
        min = minimum(diferences14);
        if(expected_value(diferences14,min)){
            return value(diferences14,min);
        }
        if(index_min==15){
            return value(diferences14,min);
        }
        List<Integer> diferences15 = wrong_value(min, diferences14, index, 15);
        min = minimum(diferences15);
        if(expected_value(diferences15,min)){
            return value(diferences15,min);
        }
        if(index_min==16){
            return value(diferences15,min);
        }
        List<Integer> diferences16 = wrong_value(min, diferences15, index, 16);
        min = minimum(diferences16);
        if(expected_value(diferences16,min)){
            return value(diferences16,min);
        }
        if(index_min==17){
            return value(diferences16,min);
        }
        List<Integer> diferences17 = wrong_value(min, diferences16, index, 17);
        min = minimum(diferences17);
        if(expected_value(diferences17,min)){
            return value(diferences17,min);
        }
        if(index_min==18){
            return value(diferences17,min);
        }
        List<Integer> diferences18 = wrong_value(min, diferences17, index, 18);
        min = minimum(diferences18);
        if(expected_value(diferences18,min)){
            return value(diferences18,min);
        }
        if(index_min==19){
            return value(diferences18,min);
        }
        List<Integer> diferences19 = wrong_value(min, diferences18, index, 19);
        min = minimum(diferences19);
        if(expected_value(diferences19,min)){
            return value(diferences19,min);
        }
        if(index_min==20){
            return value(diferences19,min);
        }
        List<Integer> diferences20 = wrong_value(min, diferences19, index, 20);
        min = minimum(diferences20);
        if(expected_value(diferences20,min)){
            return value(diferences20,min);
        }
        return 0;
    }

    //огр с 30
    public static int problem_number(int[] index, int m){
        int problem = 0;
        int k = 1000;
        if(index[0]+index[1]+index[2]>=30){
            for (int i = 0; i<3; i++){
                if(m==i)i++;
                if(problem<index[i]){
                    problem = index[i];
                    k=i;
                }
            }
            return k;
        }
        if(index[3]+index[4]+index[5]>=30){
            for (int i = 3; i<6; i++){
                if(m==i)i++;
                if(problem<index[i]){
                    problem = index[i];
                    k=i;
                }
            }
            return k;
        }
        if(index[6]+index[7]+index[8]>=30){
            for (int i = 6; i<9; i++){
                if(m==i)i++;
                if(problem<index[i]){
                    problem = index[i];
                    k=i;
                }
            }
            return k;
        }
        if(index[9]+index[10]+index[11]>=30){
            for (int i = 9; i<12; i++){
                if(m==i)i++;
                if(problem<index[i]){
                    problem = index[i];
                    k=i;
                }
            }
            return k;
        }
        return k;
    }

     public static int[] ogr(int[] index, int k){
         if(k==1000){return index;}
         int a = 0,b = 0,i = 0,j = 0,y = 0;
         for(i = 1; i<=k; i++) {
             a = income[k][index[k]] - income[k][index[k] - i];
             b = 0;
             for (j = 0; j < 12; j++) {
                 if(j==k)j++;
                 for (y = 1; y < (20 - k); y++) {
                     b = income[j][index[j] + y] - income[j][index[j]];
                     if (a == b && y<=i)break;
                 }
                 if (a == b)break;
             }
             if (a == b)break;
         }

         if(a==b){
             index[k] = index[k] - i;
             index[j] = index[j] + y;
             return index;
         }
         return index;
     }

    public static void optimum(int[][] investment, int[][] income) {
        int n = 100;
        int l = 30;

        int index[] = {30,30,30,30,30,30,30,30,30,30,30,30};

        int investment_max = investment[0][index[0]]+investment[1][index[1]]+investment[2][index[2]]
                +investment[3][index[3]]+ investment[4][index[4]]+investment[5][index[5]]
                +investment[6][index[6]]+investment[7][index[7]]+ investment[8][index[8]]
                +investment[9][index[9]]+ investment[10][index[10]]+investment[11][index[11]];

        for(int x=0; x<260;x++) {
            if (investment_max > n) {
                Integer[] diff = new Integer[12];
                for (int k = 0; k < 12; k++) {
                    int a = income[k][index[k]] - income[k][index[k] - 1];
                    diff[k]=a;
                }
                int i = next_iteration(index,Arrays.asList(diff));
                index[i]--;
            }
        }

        ogr(index, problem_number(index,1000));
        ogr(index, problem_number(index,1000));
        ogr(index, problem_number(index,1000));

        for(int x=0; x<3;x++) {
            if (investment_max > n) {
                Integer[] diff = new Integer[12];
                for (int k = 0; k < 12; k++) {
                    int a = income[k][index[k]] - income[k][index[k] - 1];
                    diff[k]=a;
                }
                int i = next_iteration(index,Arrays.asList(diff));
                index[i]--;
            }
        }

        investment_max = investment[0][index[0]]+investment[1][index[1]]+investment[2][index[2]]
                +investment[3][index[3]]+ investment[4][index[4]]+investment[5][index[5]]
                +investment[6][index[6]]+investment[7][index[7]]+ investment[8][index[8]]
                +investment[9][index[9]]+ investment[10][index[10]]+investment[11][index[11]];

        int income_max=income[0][index[0]]+income[1][index[1]]+income[2][index[2]]+income[3][index[3]]
                +income[4][index[4]] +income[5][index[5]]+income[6][index[6]]+income[7][index[7]]
                +income[8][index[8]]+ income[9][index[9]]+income[10][index[10]]+income[11][index[11]];

        System.out.println("Список наших інвестицій:");
        for (int i = 0; i < 12; i++) {
            System.out.print(index[i] + ", ");
        }
        System.out.println();
        System.out.println("Список наших прибутків:");
        for (int i = 0; i < 12; i++) {
            System.out.print(income[i][index[i]] + ", ");
        }
        System.out.println();
        System.out.println("Максимальний прибуток:");
        System.out.println(income_max);
        System.out.println("Сума наших інвестицій:");
        System.out.println(investment_max);
    }
}