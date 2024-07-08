package StructuralDecorator.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class BulletRegistry {
     private Map<BulletType,Bullet> bulletMap=new HashMap<>();
     public void register(BulletType type,Bullet b) {
         bulletMap.put(type,b);
     }
     public Bullet get(BulletType type) {
         return bulletMap.get(type);
     }
}
