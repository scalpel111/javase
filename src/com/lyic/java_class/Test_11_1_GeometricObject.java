package com.lyic.java_class;

public class Test_11_1_GeometricObject {

        private String color = "white";
        private boolean filled;
        private java.util.Date dateCreated;

        public Test_11_1_GeometricObject() {
                dateCreated = new java.util.Date();
        }
        public Test_11_1_GeometricObject(String color, boolean filled) {
                dateCreated = new java.util.Date();
                this.color = color;
                this.filled = filled;
        }
        public String getColor() {
                return color;
        }
        public void setColor(String color) {
                this.color = color;
        }
        public boolean isFilled() {
                return filled;
        }
        public void setFilled(boolean filled) {
                this.filled = filled;
        }
        public java.util.Date getDateCreated(){
                return dateCreated;
        }
        public String toString() {
                return "created on" + dateCreated + "\ncolor: " + color + " and filled: " + filled;
        }

}