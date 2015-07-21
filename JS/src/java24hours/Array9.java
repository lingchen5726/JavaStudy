package java24hours;

import java.util.Arrays;

public class Array9 {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    static void basicExample() {
        String[] reindeerNames = { "Dasher", "Dancer", "Prancer", "Vixen",
                "Comet", "Cupid", "Donder", "Blitzen" };
        System.out.println(reindeerNames[7]);
        String[] reindeerNames2 = new String[20];
        reindeerNames2[8]="Rudolph";
        System.out.println(reindeerNames2[8]);
        boolean[] bArr = new boolean[3];
        System.out.println(bArr[0]);

        String[] sortedReindeerNames = reindeerNames.clone();
        Arrays.sort(sortedReindeerNames);
        System.out.println("Sorted sortedReindeerNames are:");
        for (String str:sortedReindeerNames) {
            System.out.println(str);
        }
        
        Arrays.sort(reindeerNames);
        System.out.println("Sorted reindeerNames are:");
        for (String str:reindeerNames) {
            System.out.println(str);
        }
        
        int[] letterCounter = new int[26];
        int totalLetters = 0;
        for (String str: reindeerNames) {
            char[] letters = str.toCharArray();
            for (char c:letters) {
                if (c>='A' && c<='Z') {
                    letterCounter[c-'A']++;
                    totalLetters++;
                }
                if (c>='a' && c<='z') {
                    letterCounter[c-'a']++;
                    totalLetters++;
                }
            }
        }
        System.out.println("Total letters:"+totalLetters);
        for (int i=0;i<letterCounter.length;i++) {
            char c = (char) (i+'A');
            System.out.println(c+"["+letterCounter[i]+"]");
        }
        System.out.println("Anoter kind of loop");
        int t=0;
        for (char c='A';c<='Z';c++) {
            System.out.print(c+":"+letterCounter[c-'A']+", ");
            t++;
            if (t%10==0) {
                t=0;
                System.out.println();
            }
        }
    }
    
    static void printSpaceWithDot() {
        String old = "a bc def sdaflk l";
        char[] chArrOld = old.toCharArray();
        for (int i=0;i<chArrOld.length;i++) {
            if (chArrOld[i]!=' ') {
                System.out.print(chArrOld[i]);
            } else {
                System.out.print('.');
            }
        }
        System.out.println();
        
        String dottedStr = old.replace(' ', '.');
        System.out.println("New dotted string is:"+dottedStr);
        System.out.println("Old string is:"+old);
    }
    
    static void multiDimension() {
        int ixy[][]={{1,2},{3,4},{5,6}};
        System.out.println("ixy.length is:"+ixy.length);
        System.out.println("ixy[0].length is:"+ixy[0].length);
        for (int[] x: ixy) {
            for (int y: x) {
                System.out.print(y+"\t");
            }
            System.out.println();
        }

        boolean[][] xy = new boolean[4][];
        for (int i=0;i<xy.length;i++)
            xy[i] = new boolean[3];
        
        System.out.println("xy.length is:"+xy.length);
        System.out.println("xy[0].length is:"+xy[0].length);
        
        xy[2][1]=true;
        xy[1][0]=true;
        System.out.println("xy[2][1]:"+xy[2][1]);
        System.out.println("xy[1][0]:"+xy[1][0]);
        
        for (int i=0;i<xy.length;i++) {
            for (int j=0;j<xy[i].length;j++) {
                System.out.print("xy["+i+"]["+j+"]:"+xy[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //basicExample();
        //printSpaceWithDot();
        multiDimension();
    }

}
