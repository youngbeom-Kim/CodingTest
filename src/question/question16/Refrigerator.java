package question.question16;

public class Refrigerator {

    private Item[] list = new Item[100];

    int num = 0;

    public void add(Item item) {

        list[num] = item;

        System.out.printf("'%s'를 냉장고에 넣었습니다.\n", list[num].getName());

        num++;

    }

    public Item get(String name) {

        Item food = null;
        int index = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[i].getName().equals(name)) {
                food = list[i];
                index = i;
                num--;
                break;
            }
        }

        if (food != null) {
            for (int i = index; i < num; i++) {
                list[i] = list[i + 1];
            }
        }

        return food;

    }

    public int count() {

        return num;
    }

    public void listItem() {

        System.out.println("[냉장고 아이템 목록]");
        for (int i = 0; i < num; i++) {
            System.out.printf("%s(%s)\n", list[i].getName(), list[i].getExpiration());
        }

    }

}
