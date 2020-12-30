package lambdas;

public class DownloaderApi {

    public static void downloadImage(ImageDownloader callback) {

        new Thread(() -> {
            try {
                Thread.sleep(5000);
                callback.onImageDownloaded("this is an image");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

    }
}
