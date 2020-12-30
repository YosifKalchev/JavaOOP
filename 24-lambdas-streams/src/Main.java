import lambdas.DownloaderApi;
import lambdas.ImageDownloader;
import lambdas.SortNames;

public class Main {

    public static void main(String[] args) {
        new SortNames().sortNames();

    }

    public void samExample() {
        System.out.println("Starting image download");
        final boolean[] isDownloadFinished = {false};

        DownloaderApi.downloadImage(image -> {
            isDownloadFinished[0] = true;
            System.out.println("Image:" + image);
        });

        while (!isDownloadFinished[0]) {
            System.out.print("..");
        }
        System.out.println("Download finished");
    }
}
