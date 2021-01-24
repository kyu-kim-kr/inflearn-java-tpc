class A extends Object{
    String name;

    public A(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object obj) {
        return this.name == ((A)obj).name;
    }
}

class Tutorial01 {

    public static void main(String[] args) {
        A a1 = new A("Kyu");
        A a2 = new A("Kyu");

        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));

    }
}