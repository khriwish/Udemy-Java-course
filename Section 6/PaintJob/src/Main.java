public class Main {

    public static void main(String[] args) {

        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || (extraBuckets < 0)) {
            return -1;
        }

        double totalArea = width * height;
        double bucketsToPaintAll = totalArea / areaPerBucket;
        int bucketCount = (int) Math.ceil(bucketsToPaintAll - extraBuckets);

        return bucketCount;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double totalArea = width * height;
        double bucketsToPaintAll = totalArea / areaPerBucket;
        int bucketCount = (int) Math.ceil(bucketsToPaintAll);

        return bucketCount;

    }

    public static int getBucketCount(double area, double areaPerBucket) {

        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double totalArea = area / areaPerBucket;
        return (int) Math.ceil(totalArea);

    }

}
