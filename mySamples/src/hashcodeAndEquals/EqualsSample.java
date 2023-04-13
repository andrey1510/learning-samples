package hashcodeAndEquals;

public class EqualsSample {

    public static void main(String[] args) {

        int int1 = 3;
        int int2 = 3;

        String string1 = "str";
        String string2 = new String("str");
        String string3 = "str";

        SampleObject sampleObject1 = new SampleObject(1, 2);
        SampleObject sampleObject2 = new SampleObject(1, 6);

        SampleObject sampleObject3 = new SampleObject(1, 2, "abc");
        SampleObject sampleObject4 = new SampleObject(1, 2, "abc");

        SampleObject sampleObject5 = new SampleObject(1, 2, "abc", 5);
        SampleObject sampleObject6 = new SampleObject(1, 2, "abc", 8);

        SampleObject sampleObject7 = new SampleObject(1, 2, "abc", new InnerObject(1));
        SampleObject sampleObject8 = new SampleObject(1, 2, "abc", new InnerObject(1));

        System.out.println("sampleObject1 equals to sampleObject2: " + sampleObject1.equals(sampleObject2));
        System.out.println("sampleObject3 equals to sampleObject4: " + sampleObject3.equals(sampleObject4));
        System.out.println("sampleObject5 equals to sampleObject6: " + sampleObject5.equals(sampleObject6));
        System.out.println("sampleObject7 equals to sampleObject8: " + sampleObject7.equals(sampleObject8));

        if (sampleObject3 == sampleObject4) {
            System.out.println("sampleObject3 == sampleObject4 is true");
        } else if (sampleObject3 != sampleObject4) {
            System.out.println("sampleObject3 == sampleObject4 is false");
        }

        if(int1 == int2) {
            System.out.println("int1 == int2 is true");
        } else if (int1 != int2) {
            System.out.println("int1 == int2 is false");
        }

        if(string1 == string2) {
            System.out.println("string1 == string2 is true");
        } else if (string1 != string2) {
            System.out.println("string1 == string2 is false");
        }

        if(string1 == string3) {
            System.out.println("string1 == string3 is true");
        } else if (string1 != string3) {
            System.out.println("string1 == string3 is false");
        }

        System.out.println("string1 equals to string2: " + string1.equals(string2));
        System.out.println("string1 equals to string3: " + string1.equals(string3));



    }

}

class SampleObject {
    int a;
    int b;
    String c;
    InnerObject innerObject;
    int d;


    public SampleObject(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public SampleObject(int a, int b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public SampleObject(int a, int b, String c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public SampleObject(int a, int b, String c, InnerObject innerObject) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.innerObject = innerObject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SampleObject that = (SampleObject) o;

        if (a != that.a) return false;
        if (b != that.b) return false;
        if (c != null ? !c.equals(that.c) : that.c != null) return false;
        return innerObject != null ? innerObject.equals(that.innerObject) : that.innerObject == null;
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + b;
        result = 31 * result + (c != null ? c.hashCode() : 0);
        result = 31 * result + (innerObject != null ? innerObject.hashCode() : 0);
        return result;
    }
}


class InnerObject {
        long f;

    public InnerObject(long f) {
        this.f = f;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InnerObject that = (InnerObject) o;

        return f == that.f;
    }

    @Override
    public int hashCode() {
        return (int) (f ^ (f >>> 32));
    }
}