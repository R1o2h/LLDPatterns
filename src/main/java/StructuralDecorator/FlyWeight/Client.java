package StructuralDecorator.FlyWeight;

import java.awt.*;
import java.util.ArrayList;

public class Client {
    private static java.util.List<FlyingBullet>flyingBulletList=new ArrayList<>();
    private static BulletRegistry bulletRegistry=new BulletRegistry();

    public static void main(String[] args) {
        Bullet b=new Bullet();
        b.caliber=5.99f;
        bulletRegistry.register(BulletType.T5_56,b);
        b=new Bullet();
        b.caliber=9.00f;
        bulletRegistry.register(BulletType.T7_62,b);
        b=new Bullet();
        b.caliber=2.5f;
        bulletRegistry.register(BulletType.T_9,b);
        for(int i=0;i<3;++i) {
            FlyingBullet flyingBullet=new FlyingBullet(bulletRegistry.get(BulletType.T7_62));
            flyingBulletList.add(flyingBullet);
        }


        for(int i=0;i<3;++i) {
            FlyingBullet flyingBullet=new FlyingBullet(b);
            flyingBulletList.add(flyingBullet);
        }



        for(int i=0;i<3;++i) {
            FlyingBullet flyingBullet=new FlyingBullet(b);
            flyingBulletList.add(flyingBullet);
        }
    }
}
