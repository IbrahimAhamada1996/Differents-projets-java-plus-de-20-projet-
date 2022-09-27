package project1;

public class MuliplicationTable {
    void print() {
        this.print(4);
    }

    void print(int table) {
        for(int i=1;i<=10;i++) {
            System.out.printf("%d * %d = %d",table,i,table*i).println();
        }
    }

    void print(int table,int limit) {
        for(int i=1;i<=limit;i++) {
            System.out.printf("%d * %d = %d",table,i,table*i).println();
        }
    }

    void print(int start, int table, int limit) {
        for(int i=start;i<=limit;i++) {
            System.out.printf("%d * %d = %d",table,i,table*i).println();
        }
    }

}
