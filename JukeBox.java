package csce247.assignments.singelton;

public class JukeBox {
	
	//initialize variables
	Queue<String> songQueue = new Queue<String>();
	private static JukeBox jukeBox;
	private int counter = 1;
	private JukeBox() {}
	
	//getinstance method used to initialize jukebox
	public static JukeBox getInstance() {
		if (jukeBox == null) {
			System.out.println("Initializing the JukeBox!!! Let's get Dancing");
			jukeBox = new JukeBox();
		}
		return jukeBox;
	}
	
	//dequeues the next song in the queue and lowers the counter
	public void playNextSong() {
		System.out.println("Let's jam to " + jukeBox.songQueue.dequeue());
		counter --;
	}
	
	//enqueues a song to the list and adds to the counter
	public void requestSong(String a) {
		jukeBox.songQueue.enqueue(a);
		System.out.println(a+" is now number "+ counter+ " on the list!");
		counter ++;
	}
	
	//checks if there are more songs on the list
	public boolean hasMoreSongs() {
		if (jukeBox.songQueue.toString() == null) {
			return false;
		}
		else
			return true;
	}
}
