package com.hackerrank.dataStructures;

import java.util.*;
//------------------------------------------------------------------------------
// Write your Checker class here

/*class Checker{

    public void checker(){




    }
}*/

//------------------------------------------------------------------------------
class Players{
    String name;
    int score;

    Players(String name, int score){
        this.name = name;
        this.score = score;
    }
}


class Tests {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Players[] player = new Players[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Players(scan.next(), scan.nextInt());
        }
        scan.close();

        //---------------------------------------------
        List<Players> list = new ArrayList<Players>();
        list.add(player[0]);
        list.add(player[1]);
        list.add(player[2]);
        list.add(player[3]);

        System.out.println(list);

        Players a = list.get(0);
        Players b = list.get(1);

        Collections.sort(list, new Comparator<Players>() {


            public int compare(Players o1, Players o2) {

                //return o1.compareToIgnoreCase(o2);
                return 0;
            }
        });

        System.out.println(list);
        //----------------------------------------------

        //Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}

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