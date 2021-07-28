package com.company.kotlin.sealed;

enum ShapeJava {
    Rectangle(4, 30),
    Sqaure(4, 90);

    private final int side;
    private final int angle;
    ShapeJava(int side, int angle) {
        this.side = side;
        this.angle = angle;
    }
}

class Sample{
    void callingFunction(){
        testFunction(ShapeJava.Sqaure);
    }

    void testFunction(ShapeJava shapeJava){
        System.out.println("Testing " + shapeJava);
    }
}