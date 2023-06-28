package Sem_4;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;

public class sem_4 {

        public static void main(String[] args) {

            ArrayList<String> listData_F = new ArrayList<String>();
            ArrayList<String> listData_I = new ArrayList<String>();
            ArrayList<String> listData_O = new ArrayList<String>();
            ArrayList<Integer> listData_V = new ArrayList<Integer>();
            ArrayList<String> listData_P = new ArrayList<String>();

            String str = "";
            Scanner in = new Scanner(System.in);
            System.out.println("Введите ФИО, Возраст, Пол: ");
            while (!str.equals("q")) {


                str = in.nextLine();
                if (!str.equals("q")) {
                    String[] tmp = new String[3];
                    tmp = str.split(",");

                    String[] fio = new String[3];
                    fio = tmp[0].split(" ");

                    listData_F.add(fio[0]);
                    listData_I.add(fio[1]);
                    listData_O.add(fio[2]);
                    listData_V.add(Integer.parseInt(tmp[1].trim()));
                    listData_P.add(tmp[2]);
                }
            }
//        listData.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                int r = Integer.parseInt(o1.split(" ")[2])-Integer.parseInt(o2.split(" ")[2]);
//                return r;
//            }
//        });

            ArrayList<Integer> listData_V_tmp = new ArrayList<Integer>(listData_V);
            int[] indexV = new int[listData_V.size()];
            for (int i = 0; i < indexV.length; i++) {
                indexV[i] = i;
            }
            for (int i = 0; i < listData_V.size() - 1; i++) {
                int minV = listData_V_tmp.get(i);
                for (int j = i + 1; j < listData_V_tmp.size(); j++) {
                    int nextV = listData_V_tmp.get(j);
                    if (nextV < minV) {
                        int tmp_j = indexV[j];
                        indexV[j] = indexV[i];
                        indexV[i] = tmp_j;
                        listData_V_tmp.set(i, nextV);
                        listData_V_tmp.set(j, minV);
                        minV = nextV;
                    }
                }
            }
            System.out.println(Arrays.toString(indexV));
            for (int k = 0; k < indexV.length; k++) {
                int s = indexV[k];
                String itogStr = listData_F.get(s) + " " + listData_I.get(s).toUpperCase().charAt(0) + "."
                        + listData_O.get(s).toUpperCase().charAt(0) + "." + listData_V.get(s) + listData_P.get(s);
                System.out.println(itogStr);
            }

            int[] indexVP = new int[listData_P.size()];
            ArrayList<Integer> indexVP_tmp1 = new ArrayList<Integer>();
            ArrayList<Integer> indexVP_tmp2 = new ArrayList<Integer>();
            String tmp_P = listData_P.get(0);
            indexVP_tmp1.add(indexV[0]);
            for (int k = 1; k < indexV.length; k++) {
                int s = indexV[k];
                if (listData_P.get(s).equals(tmp_P)) {
                    indexVP_tmp1.add(s);
                } else {
                    indexVP_tmp2.add(s);
                }
            }
            int i = 0;
            for (int j = 0; j < indexVP_tmp1.size(); j++) {
                indexVP[i] = indexVP_tmp1.get(j);
                i++;
            }
            for (int j = 0; j < indexVP_tmp2.size(); j++) {
                indexVP[i] = indexVP_tmp2.get(j);
                i++;
            }
            System.out.println(Arrays.toString(indexVP));
            for (int k = 0; k < indexVP.length; k++) {
                int s = indexVP[k];
                String itogStr = listData_F.get(s) + " " + listData_I.get(s).toUpperCase().charAt(0) + "."
                        + listData_O.get(s).toUpperCase().charAt(0) + "." + listData_V.get(s) + listData_P.get(s);
                System.out.println(itogStr);
            }
        }
    }




