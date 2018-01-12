package com.hackerrank.dataStructures;

import java.util.*;
//-----------------------------Learn more-------------------------------------------------
// Write your Checker class here

 class Checker implements Comparator<Player>{

    public int compare(Player a, Player b){
        int compare = b.score - a.score;
        if (compare == 0){
            return a.name.compareTo(b.name);
        }
        return compare;
    }
}

//------------------------------------------------------------------------------
class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class JavaComparator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);

        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
//score....if same score then: name
/*
Sample Input
5
amy 100
david 100
heraldo 50
aakansha 75
aleksa 150

Sample Output
aleksa 150
amy 100
david 100
aakansha 75
heraldo 50
*/