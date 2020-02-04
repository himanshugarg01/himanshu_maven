package org.example;
import java.util.*;
public class Gift {
    Vector <Sweets> v;
    String mess;
    int tweights;

    public Gift(Vector<Sweets> v,String mess) {
        this.v = v;
        this.mess=mess;
    }
    public int totalWeightOfGift()
    {
        for(Sweets v:v)
        {
            tweights +=v.weights;
        }
        return tweights;
    }
}
