package question.question18;

public class MyArrayList {

    private String[] list;
    private int index;

    public MyArrayList() {

        this.list = new String[4];

    }

    public void add(String s) {

        this.list[index] = s;
        index++;

        if (list.length == index) {
            String[] list2 = new String[index * 2];

            for (int i = 0; i < this.list.length; i++) {
                list2[i] = this.list[i];
            }
            this.list = list2;
        }

    }

    public String get(int index) {
        return this.list[index];
    }

    public int size() {
        return this.list.length;
    }

    public void set(int index, String s) {
        list[index] = s;
    }

    public void remove(int index) {
        for (int i = index; i < list.length - 1; i++) {
            list[i] = list[i + 1];
        }
        this.index--;
    }

    public void add(int index, String s) {
        this.index++;
        list[index + 1] = list[index];
        list[index] = s;
        this.index--;
    }

    public int indexOf(String s) {
        int result = this.list.toString().indexOf(s);
        return result;
    }

    public int lastIndexOf(String s) {
        int result = this.list.toString().lastIndexOf(s);
        return result;
    }

    public void clear() {
        this.index = 0;
    }
}
