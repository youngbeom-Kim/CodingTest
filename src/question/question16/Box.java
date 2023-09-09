package question.question16;

public class Box {

    private Macaron[] list = new Macaron[10];

    String[] color = new String[] {"red", "blue", "yellow", "white", "pink", "purple", "green", "black"};

    public void cook() {

        for (int i = 0; i < list.length; i++) {

            Macaron m = new Macaron(); //마카롱 생성하기

            m.setSize((int) (Math.random() * 11 + 5)); //마카롱 사이즈 5 ~ 15

            m.setColor(color[(int) (Math.random() * color.length)]); //마카롱 색상 랜덤

            m.setThickness((int) (Math.random() * 20 + 1));

            list[i] = m;

        }

        System.out.println("마카롱 10개를 만들었습니다.");
        System.out.println();

    }

    public void check() {

        int pass = 0;
        int fail = 0;

        for (int i = 0; i < list.length; i++) {

            //마카롱 사이즈(8 ~ 14)
            if (list[i].getSize() >= 8 && list[i].getSize() <= 14) {
                //마카롱 색깔(black이외에 전부)
                if (!list[i].getColor().equals("black")) {
                    //마카롱 두께(3 ~ 18)
                    if (list[i].getThickness() >= 3 && list[i].getThickness() <= 18) {
                        pass++;
                    } else {
                        fail++;
                    }
                } else {
                    fail++;
                }
            } else {
                fail++;
            }

        }

        System.out.println("[박스 체크 결과]");
        System.out.printf("QC 합격 개수 : %d개\n", pass);
        System.out.printf("QC 불합격 개수 : %d개\n", fail);
        System.out.println();

    }

    public void list() {

        System.out.println("[마카롱 목록]");

        String check = "";

        for (int i = 0; i < list.length; i++) {

            //마카롱 사이즈(8 ~ 14)
            if (list[i].getSize() >= 8 && list[i].getSize() <= 14) {
                //마카롱 색깔(black이외에 전부)
                if (!list[i].getColor().equals("black")) {
                    //마카롱 두께(3 ~ 18)
                    if (list[i].getThickness() >= 3 && list[i].getThickness() <= 18) {
                        check = "합격";
                    } else {
                        check = "불합격";
                    }
                } else {
                    check = "불합격";
                }
            } else {
                check = "불합격";
            }

            System.out.printf("%d번 마카롱 : %2dcm(%s, %dmm) : %s\n", i+1
                                                            , list[i].getSize()
                                                            , list[i].getColor()
                                                            , list[i].getThickness()
                                                            , check);

        }



    }

}
