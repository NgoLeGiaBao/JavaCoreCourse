package test;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
/*
 * - Queue (hàng đợi): được hoạt động dựa trên nguyên tắc FIFO (First In First Out)
 * - PriorityQueue là hàng đợi ưu tiên, nó lưu trữ các phần tử dựa trên trật tự tự nhiên 
 * của phần tử đó (nếu các phần tử đs so sanh sánh với nhau - thi hành Comparable) 
 * hoặc một bộ so sánh Comparator được cung cấp cho PriorityQueue 
 * - Deque là hàng đợi 2 đầu. Với một hàng đợi thông thường, ban thêm mọi thức vào một đầu 
 * và lấy chúng từ đầu kia. Với hàng đợi kết thúc kép, bạn có thể thêm một thứ vào một trong 
 * hai đầu và lấy chúng từ một trong hai đầu. ĐIều đó làm cho nó linh hoạt hơn một chút
 * - Một số phương thức trong Queue:
 * 	+ add(e) hoặc offer(e) để thêm phần tử, thường sử dụng offer(e)
 * 	+ remove() hoặc poll() để lấy ra phần tử, và xóa phần tử đó khỏi Queue 
 * 	+ element() hoặc peek() lấy ra phần tử, nhưng không xóa phần tử đó khỏi Queue
 * - Một số phương thức trong Deque:
 * 	+ Có tất cả các phương thức có trong Queue và có thêm một số phương thức khác như:
 *  addFirst(e), addLast(e), offerFirst(e), offerLast(e), removeFirst(), removeLast(), pollFirst(),
 *  pollLast(), elementFirst(), elemntLast(), peekFirst(), peekLast(); 
 */
public class Main_EX063_QueueAndDeque {
	public static void main(String[] args) {
		Queue<String> linkList = new LinkedList<String>();
		Queue<String> priorityQueue = new PriorityQueue<String>();
		Deque<String> arrayDeque = new ArrayDeque<String>();
		
		
		// Queue with LinhkList 
		System.out.println("---Queue with LinhkList---");
		linkList.offer("Janes Huynh");
		linkList.offer("Vu Nguyen Coder");
		linkList.offer("Anna Channel about English");
		linkList.offer("Tonny Code Dao");
		
		while(true) {
			if (linkList.peek() == null) {
				break;
			} else {
				System.out.println(linkList.poll());
			}
		}
		
		
		// Queue with PriorityQueue
		System.out.println("---Queue with PriorityQueue---");
		priorityQueue.offer("Hai Trieu Schannel");
		priorityQueue.offer("Vu Nguyen Coder");
		priorityQueue.offer("Anna Channel about English");
		priorityQueue.offer("Bill Gates and stories");
		
		while(true) {
			if (priorityQueue.peek() == null) {
				break;
			} else {
				System.out.println(priorityQueue.poll());
			}
		}
		
		
		// Deque with ArrayDeque
		System.out.println("---Deque with ArrayDeque---");
		arrayDeque.offer("F8 - FullStack");
		arrayDeque.offer("ChatGPT how to be so intelligent");
		arrayDeque.offerLast("TIVI Channel");
		arrayDeque.offerFirst("JackMa behinds his success");

		while (true) {
			if (arrayDeque.peek() == null) {
				break;
			} else {
				System.out.println(arrayDeque.poll());
			}
		}
		
	}

	
}
