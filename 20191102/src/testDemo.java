public class testDemo {
        public static void main(String[] args) {
            MySingleList mySingleList = new MySingleList();
            mySingleList.addFirst(3);
            mySingleList.addFirst(4);
            mySingleList.addFirst(7);
            mySingleList.addIndex(1,99);
            mySingleList.display();
            mySingleList.remove(99);
            mySingleList.display();
            mySingleList.remove(3);
            mySingleList.display();
            System.out.println(mySingleList.getLength());
            mySingleList.addFirst(4);
            mySingleList.addFirst(67);
            mySingleList.addFirst(60);
            mySingleList.display();
            mySingleList.clear();
            mySingleList.display();

        }
    }
