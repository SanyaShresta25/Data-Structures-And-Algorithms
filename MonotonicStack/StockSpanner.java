package MonotonicStack;

import java.util.Stack;

public class StockSpanner {

    Stack<int[]> stack = new Stack<>();

    public int next(int price) {
        int span = 1;
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }
        stack.push(new int[]{price, span});
        return span;
    }

    public static void main(String[] args) {
        StockSpanner spanner = new StockSpanner();

        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        System.out.println("Stock Spans:");
        for (int price : prices) {
            int span = spanner.next(price);
            System.out.println("Price: " + price + " -> Span: " + span);
        }
    }
}
