package question.question19;

import java.util.Arrays;

public class MyHashMap {

    //배열 생성
    private String[] keys;
    private String[] values;

    private int index;

    public MyHashMap() {
        //2개 배열 생성
        this.keys = new String[4];
        this.values = new String[4];
        this.index = 0;
    }

    public void put(String key, String value) {

        doubling();

        //키 값이 있을 경우, 키 값을 그 위치에 덮어 쓰기
        for (int i = 0; i < index; i++) {
            if (this.keys[i].equals(key)) {
                this.keys[i] = key;
                this.values[i] = value;
                return;
            }
        }

        this.keys[index] = key;
        this.values[index] = value;
        index++;

    }

    public void doubling() {

        if (keys.length == index && values.length == index) {
            String[] newkeys = new String[index * 2];
            String[] newvalues = new String[index * 2];

            for (int i = 0; i < index; i++) {
                newkeys[i] = keys[i];
                newvalues[i] = values[i];
            }
            keys = newkeys;
            values = newvalues;
        }
    }

    public String get(String key) {

        if (index != 0) {

            int count = 0;

            for (int i = 0; i < index; i++) {
                if (this.keys[i].equals(key)) {
                    break;
                }
                count++;
            }
            return this.values[count];

        }

        return null;
    }

    public int size() {
        return this.index;
    }

    public void remove(String key) {

        for (int i = 0; i < index; i++) {
            if (this.keys[i].equals(key)) {
                this.keys[i] = this.keys[i + 1];
                this.values[i] = this.values[i + 1];
            }
        }

        this.keys[index - 1] = null;
        this.values[index - 1] = null;

        index--;

    }

    public boolean containKey(String key) {

        for (int i = 0; i < index; i++) {
            if (this.keys[i].equals(key)) {
                return true;
            }
        }

        return false;

    }

    public boolean containValue(String value) {

        for (int i = 0; i < index; i++) {
            if (this.values[i].equals(value)) {
                return true;
            }
        }

        return false;

    }

    public void clear() {
        this.index = 0;
    }

    public String toString() {

        String temp = "";

        temp += String.format("keyList : %s\n", Arrays.toString(this.keys));
        temp += String.format("valueList : %s\n", Arrays.toString(this.values));
        temp += String.format("index : %s\n", this.index);

        return temp;

    }


}
