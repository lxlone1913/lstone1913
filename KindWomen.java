package n_proxy.g.a.bproxy;

public interface KindWomen {
    public void makeEyesWithMan();

    public void happyWithMan();


}

class Pjl implements KindWomen {
    @Override
    public void makeEyesWithMan() {
        System.out.println("pjl mmmm yyyyyy");
    }

    @Override
    public void happyWithMan() {
        System.out.println("pjl nnnnnnnn");

    }
}

class WP implements KindWomen {

    private KindWomen kindWomen;//zi duan

    public WP() {
        this.kindWomen = new Pjl();

    }
    public WP(KindWomen kindWomen) {
        this.kindWomen = kindWomen;
    }



    @Override
    public void makeEyesWithMan() {
        this.kindWomen.makeEyesWithMan();
    }

    @Override
    public void happyWithMan() {
        this.kindWomen.happyWithMan();
    }
}

class JiaShi implements KindWomen{
    @Override
    public void makeEyesWithMan() {
        System.out.println("hhhhhhiiiiii");
    }

    @Override
    public void happyWithMan() {
        System.out.println("lllllll");

    }
}


class XiMenQing {
    public static void main(String[] args) {
        JiaShi jiaShi = new JiaShi();
        Pjl pjl = new Pjl();

        WP wp = new WP(jiaShi);
        WP wp2 = new WP(pjl);
        wp.happyWithMan();
        wp.makeEyesWithMan();


    }


}