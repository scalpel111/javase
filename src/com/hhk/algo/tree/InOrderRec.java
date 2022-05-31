package com.hhk.algo.tree;

import java.util.Stack;

public class InOrderRec {

    public static void inOrderRec(Node root){
        System.out.println("中序遍历:");
        if(root == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        while (!stack.empty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                System.out.print(root.value + " ");
                root = root.right;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(5);
        inOrderRec(root);
    }

}
