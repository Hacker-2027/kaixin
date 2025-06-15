class People {
    int averHeight = 18;
    int getAverHeight(){
        return averHeight;
    }
}

class ChinaPeople extends People {
    int height;
    void setHeight(int h){
        this.height = h;
    }
    public int getHeight(){
        return height;
    }
}

class Main {
    public static void main(String[] args){
        ChinaPeople A = new ChinaPeople();
        System.out.println("AverHeight is: " + A.getAverHeight());
        A.setHeight(178);
        System.out.println("His height is: " + A.getHeight());
    }
}
