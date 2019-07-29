public class abc {
    public static void main(String[] args) {
        //int lab=7;
        //int assignment1=3;
        //int assignment2=8;
        //int finalexam=53;
        for (int lab=0;lab<=10;lab++){
            for (int assignment1=0;assignment1<=10;assignment1++){
                for (int assignment2=0;assignment2<=10;assignment2++){
                    for (int finalexam=0;finalexam<=100;finalexam++){
                        int raw = (int) Math.round(((assignment1 / 10.0f) * 0.15f + (assignment2 / 10.0f)
                                * 0.15f + (lab / 10.0f) * 0.1f + (finalexam / 100.0f) * 0.6f) * 100.0f);

                        int m = (assignment1 * 150 + assignment2 * 150 + lab * 100 + finalexam * 60);
                        int t = ((m % 100 < 50) ? (m / 100) : (m / 100) + 1);

                        if (raw!=t){
                            System.out.println(raw+"  -   "+t);
                            System.out.println(lab+" "+assignment1+" "+assignment2+" "+finalexam);
                        }

                    }
                }
            }
        }

    }
}
