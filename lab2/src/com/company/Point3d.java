package com.company;
/**
 * Трёхмерный класс точки.
 **/
public class Point3d {
        private double xCoord;  /** координата X **/
        private double yCoord;  /** координата Y **/
        private double zCoord;  /** координата Z **/
        /** Конструктор инициализации **/
        public Point3d ( double x, double y, double z) {
            xCoord = x;
            yCoord = y;
            zCoord = z;
        }
    /** Конструктор по умолчанию **/
    public Point3d () {
        //Вызовите конструктор с тремя параметрами и определите источник.
        this(0, 0, 0);
    }
    /** Возвращение координаты Х **/
    public double getX () {
        return xCoord;
    }
    /** Возвращение координаты Y **/
    public double getY () {
        return yCoord;
    }
    /** Возвращение координаты Z **/
    public double getZ () {
        return zCoord;
    }
    /** Установка значения координаты X **/
    public void setX ( double val) {
        xCoord = val;
    }
    /** Установка значения координаты Y **/
    public void setY ( double val) {
        yCoord = val;
    }
    /** Установка значения координаты z **/
    public void setZ ( double val) {
        zCoord = val;
    }
    // Вычисление расстояния между двумя точками
    public double distanceTo (Point3d obj){
        //Ввод локальных переменных для удобства ввода в формулу
        double x1=getX();
        double y1=getY();
        double z1=getZ();
        double x2= obj.getX();
        double y2= obj.getY();
        double z2= obj.getZ();

        double distance=Math.abs(Math.pow(Math.pow(x1-x2,2)+Math.pow(y1-y2,2)+Math.pow(z1+z2,2), 1.0/2));

        return distance;
    }

    // Сравнение двух точек
    public boolean comparePoints(Point3d point) {
        if (this.getX() == point.getX() & this.getY() == point.getY() & this.getZ() == point.getZ()) {
            return true;
        } else return false;
    }
}

