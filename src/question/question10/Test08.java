package question.question10;

//특정 단어가 문장내에 몇회 있는지 수를 세시오.
public class Test08 {

    public static void main(String[] args) {

        String content = "안녕~ 길동아~ 잘가~ 길동아~";
        String word = "길동";
        int count = 0;
        int index = 0;

        for (int i = 0; i < content.length(); i++) {

            index = content.indexOf(word, index + word.length());

            if (index == -1) {
                break;
            }
            count++;

        }

        System.out.printf("'%s'을 총 %d회 발견했습니다.", word, count);


    }
}
