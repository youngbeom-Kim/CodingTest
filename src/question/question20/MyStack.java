package question.question20;

import java.util.Arrays;

//MyStack
//추가 - void push(String value)
//읽기 - String pop()
//개수 - int size()
//확인 - String peek()
//크기조절 - void trimToSize()
//초기화 - void clear()
public class MyStack {

    private String[] list;
    private int index;

    public MyStack() {
        this.list = new String[4];
        this.index = 0;
    }

    public void push(String value) {

        doubling();

        list[index] = value;
        index++;
    }

    public void doubling() {
        if (list.length == index) {
            String[] newList = new String[index * 2];
            for (int i = 0; i < index; i++) {
                newList[i] = list[i];
            }
            list = newList;
        }
    }

    public String pop() {
        String last = "";
        last += list[index - 1];
        list[index - 1] = null;
        index--;

        return last;
    }

    public int size() {
        return this.index;
    }

    public String peek() {
        return this.list[index - 1];
    }

    public void trimToSize() {

        String[] newList = new String[index];
        for (int i = 0; i < index; i++) {
            newList[i] = list[i];
        }
        list = newList;

    }

    public void clear() {
        this.list = new String[4];
        this.index = 0;
    }

    public String toString() {

        String temp = "";

        temp += String.format("list : %s\n", Arrays.toString(list));
        temp += String.format("index : %d\n", this.index);
        temp += "\n";

        return temp;
    }
}
