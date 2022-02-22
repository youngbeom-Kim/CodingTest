package question20;

public class Main {

    public static void main(String[] args) {

        //queue();
        stack();

    }

    private static void stack() {

        MyStack stack = new MyStack();

        //추가
        stack.push("빨강");
        stack.push("노랑");
        stack.push("파랑");
        stack.push("주황");
        stack.push("검정");
        System.out.println(stack);

        //읽기
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);

        //개수
        System.out.println(stack.size());
        System.out.println();

        //확인
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println();

        //크기 조절
        stack.trimToSize();
        System.out.println(stack);

        //초기화
        stack.clear();
        System.out.println(stack.size());
        System.out.println(stack);

    }

    private static void queue() {

        MyQueue queue = new MyQueue();

        //추가
        queue.add("빨강");
        queue.add("노랑");
        queue.add("파랑");
        queue.add("주황");
        queue.add("검정");
        System.out.println(queue);

        //읽기
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);

        //개수
        System.out.println(queue.size());
        System.out.println();

        //확인
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.size());
        System.out.println();

        //크기 조절
        queue.trimToSize();
        System.out.println(queue);

        //초가화
        queue.clear();
        System.out.println(queue.size());

    }
}
