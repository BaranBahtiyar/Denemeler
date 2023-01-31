public class DataStructure {
    private final static int SIZE = 30;
    private int[] arrayOfInts = new int[SIZE];

    public DataStructure() {
        for (int i = 0; i < arrayOfInts.length; i++) {
            arrayOfInts[i] = i;
        }
    }

    public void print() {
        InnerIterator iteratorOdd = this.new InnerIterator("odd");
        System.out.print("Odd : ");
        while (iteratorOdd.hasNext()) {
            System.out.print(iteratorOdd.getNext() + " ");
            iteratorOdd.next++;
        }

        InnerIterator iteratorEven = this.new InnerIterator("even");
        System.out.println("");
        System.out.print("Even : ");
        while (iteratorEven.hasNext()){
            System.out.print(iteratorEven.getNext() + " ");
            iteratorEven.next++;
        }
    }

    private class InnerIterator implements Iterator{
        private int next = 0;
        private int type = -1;

        public InnerIterator(String typeDef) {
            if (typeDef.equals("even")) {
                this.type = 0;
            }
            if (typeDef.equals("odd")) {
                this.type = 1;
            }
        }

        public boolean hasNext(){
            return(next < SIZE-1);
        }

        public int getNext(){
            if (arrayOfInts[next]%2==type) {
                return arrayOfInts[next];
            }
            else{
                next++;
                return arrayOfInts[next];
            }
        }
    }

    public static void main(String s[]) {
        DataStructure ds = new DataStructure();
        ds.print();
    }

    private interface Iterator{
        boolean hasNext();
        int getNext();
    }
}


