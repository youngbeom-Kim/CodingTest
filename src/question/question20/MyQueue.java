package question.question20;

import java.util.Arrays;

//MyQueue
//추가 - void add(String value)
//읽기 - String poll()
//개수 - int size()
//확인 - String peek()
//크기조절 - void trimToSize()
//초기화 - void clear()
public class MyQueue {

    private String[] list;
    private int index;

    public MyQueue() {
        this.list = new String[4];
        this.index = 0;
    }

    public void add(String value) {

        doubling();

        this.list[index] = value;
        index++;
    }

    public void doubling() {

        if (list.length == index) {
            String[] newlist = new String[index * 2];

            for (int i = 0; i < index; i++) {
                newlist[i] = list[i];
            }
            list = newlist;
        }

    }

    public String poll() {

        String first = "";

            try {
                if (!list[0].equals(null)) {
                    first += list[0];
                    for (int i = 0; i < index; i++) {
                        this.list[i] = this.list[i + 1];
                    }
                    list[index - 1] = null;
                    index--;
                    return first;
                }
            } catch (Exception e) {
                return list[0];
            }

        return null;
    }

    public int size() {
        return this.index;
    }

    public String peek() {
        return this.list[0];
    }

    public void clear() {
        this.list = new String[4];
        index = 0;
    }

    public void trimToSize() {

        String[] newList = new String[index];
        for (int i = 0; i < index; i++) {
            newList[i] = this.list[i];
            this.list = newList;
        }

    }

    public String toString() {

        String temp = "";

        temp += String.format("list : %s\n", Arrays.toString(list));
        temp += String.format("index : %d\n", this.index);
        temp += "\n";

        return temp;
    }

}
