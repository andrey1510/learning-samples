package level8;

public class VolumeOfCuboid {
  public static double getVolumeOfCuboid(final double length, final double width, final double height) {
    return length*width*height;
  }

  public static void main(String[] args) {              // test
    System.out.println(getVolumeOfCuboid(2,3,4));
  }

  }
