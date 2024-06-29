package multithreading;

public class DeadlockDetector {

	public static void detectDeadlock() {
		ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
		long[] threadIds = threadMXBean.findDeadlockedThreads();

		if (threadIds != null) {
			System.out.println("Deadlock detected!");
			for (long id : threadIds) {
				System.out.println(threadMXBean.getThreadInfo(id));
			}
		} else {
			System.out.println("No deadlock detected.");
		}
	}

	public static void main(String[] args) {
		detectDeadlock();
	}
}
