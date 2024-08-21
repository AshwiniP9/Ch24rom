public class VideoGameRunner{
	public static void main(String[] args){
        VideoGame videoGame1=new VideoGame("ludo","3.4",4000);
        VideoGame videoGame2=new VideoGame("starfall Spire","4.5",500);
        VideoGame[] videoGames={videoGame1,videoGame2};
        for (int start = 0; start < videoGames.length; start++)// 2
    {
        System.out.println("Reading videoGames from index :" + start);
        VideoGame ref = videoGames[start];
        ref.display();
    }
}
}